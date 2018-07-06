package test.header;


import org.testng.Assert;
import org.testng.annotations.Test;

import components.enums.base_uri.Uri;
import components.enums.cities.City;
import components.enums.header.HeaderValue;
import helpers.string.InformationDisplayHelper;
import io.restassured.http.Headers;
import setup.AbstractApiGetSetup;


public class HeaderTests extends AbstractApiGetSetup
{
	final String server = HeaderValue.SERVER.getStringRepresentation();
	final String contentType = HeaderValue.CONTENT_TYPE.getStringRepresentation();
	final String contentEncoding = HeaderValue.CONTENT_ENCODING.getStringRepresentation();

	InformationDisplayHelper stringFormatHelper = new InformationDisplayHelper();


	private HeaderTests()
	{
		super(City.BOSTON.getUriRepresentation(), Uri.WEATHER_GET_URI.getAddress());
	}


	@Test
	public void GetWeatherHeaders()
	{
		this.stringFormatHelper.displayHeaderKeyValue(this.contentType, this.response.header(this.contentType));

		this.stringFormatHelper.displayHeaderKeyValue(this.contentType, this.response.header(this.server));

		this.stringFormatHelper.displayHeaderKeyValue(this.contentType, this.response.header(this.contentEncoding));

	}


	@Test
	public void PrintAllHeaders()
	{
		final Headers allHeaders = this.response.headers();

		this.stringFormatHelper.displayHeaders(allHeaders);
	}


	@Test
	public void AssertWeatherHeaders()
	{
		final String contentType = this.response.header(this.contentType);
		Assert.assertEquals(contentType, "application/json");

		final String serverType = this.response.header(this.server);
		Assert.assertEquals(serverType, "nginx/1.12.2");

		final String contentEncoding = this.response.header(this.contentEncoding);
		Assert.assertEquals(contentEncoding, "gzip");
	}
}
