package setup;


import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


/**
 * {@link AbstractApiPostSetup} provides necessary setup for each api test
 *
 */
public abstract class AbstractApiPostSetup
{
	protected String baseURI;
	protected String postType;
	protected String jsonString;

	protected Response response;
	protected RequestSpecification httpRequest;



	public AbstractApiPostSetup(final String baseUri, final String postType, final String jsonString)
	{
		this.baseURI = baseUri;
		this.postType = postType;
		this.jsonString = jsonString;
	}


	@BeforeTest
	protected void setup()
	{
		RestAssured.baseURI = this.baseURI;

		this.httpRequest = RestAssured.given();
		this.httpRequest.body(this.jsonString);
		this.response = this.httpRequest.post(this.postType);
	}
}
