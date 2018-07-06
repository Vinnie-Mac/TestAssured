package test.post;


import org.testng.Assert;
import org.testng.annotations.Test;

import components.enums.assert_message.Message;
import components.enums.base_uri.Uri;
import components.enums.post_type.PostType;
import components.enums.status_codes.SuccessCode;
import components.generators.NewUserGenerator;
import setup.AbstractApiPostSetup;


/**
 * {@link RegisterTest} provides ...
 *
 */
public class RegisterTest extends AbstractApiPostSetup
{

	private RegisterTest()
	{
		super(
				Uri.EXAMPLE_SERVICE_ENDPOINT.getAddress(),
				PostType.REGISTER.getUriRepresentation(),
				NewUserGenerator.generateRandomUser());
	}


	@Test
	public void RegistrationSuccessful()
	{
		int statusCode = this.response.getStatusCode();
		String successCode = this.response.jsonPath().get("SuccessCode");

		Assert.assertEquals(statusCode, SuccessCode.CREATED.getValue());

		Assert.assertEquals(
				successCode,
				Message.OPERATION_SUCCESS.getResponseValue(),
				Message.INCORRECT_STATUS_CODE_FOUND.getMessage());
	}
}
