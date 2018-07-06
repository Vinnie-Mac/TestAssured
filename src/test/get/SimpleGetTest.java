package test.get;


import org.testng.Assert;
import org.testng.annotations.Test;

import components.enums.assert_message.Message;
import components.enums.base_uri.Uri;
import components.enums.cities.City;
import components.enums.status_codes.SuccessCode;
import helpers.string.InformationDisplayHelper;
import setup.AbstractApiGetSetup;


public class SimpleGetTest extends AbstractApiGetSetup
{
	InformationDisplayHelper stringDisplay = new InformationDisplayHelper();


	private SimpleGetTest()
	{
		super(City.MANCHESTER.getUriRepresentation(), Uri.WEATHER_GET_URI.getAddress());
	}


	@Test
	public void GetWeatherDetails()
	{
		this.stringDisplay.displayResponseBody(this.responseBodyAsString);
	}


	@Test
	public void GetSuccessfulStatusCode()
	{
		Assert.assertEquals(
				this.response.getStatusCode(),
				SuccessCode.OK.getValue(),
				Message.INCORRECT_STATUS_CODE_FOUND.getMessage());
	}
}
