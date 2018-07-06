package setup;


import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


/**
 * {@link AbstractApiGetSetup} provides necessary setup for each api test
 *
 */
public abstract class AbstractApiGetSetup
{
	protected String city;
	protected String baseURI;

	protected Response response;
	protected String responseBodyAsString;
	protected ResponseBody<?> body;
	protected JsonPath jsonPathEvaluator;
	protected RequestSpecification httpRequest;



	public AbstractApiGetSetup(final String city, final String baseUri)
	{
		this.city = city;
		this.baseURI = baseUri;
	}


	@BeforeTest
	protected void setup()
	{
		RestAssured.baseURI = this.baseURI;

		this.httpRequest = RestAssured.given();
		this.response = this.httpRequest.get(this.city);

		// Gather response body
		this.body = this.response.getBody();
		this.responseBodyAsString = this.body.asString();

		// Gather json path for response
		this.jsonPathEvaluator = this.response.jsonPath();
	}
}
