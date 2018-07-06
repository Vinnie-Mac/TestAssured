package test.body;


import org.testng.Assert;
import org.testng.annotations.Test;

import components.enums.assert_message.Message;
import components.enums.base_uri.Uri;
import components.enums.cities.City;
import helpers.string.InformationDisplayHelper;
import setup.AbstractApiGetSetup;


public class ResponseBodyTest extends AbstractApiGetSetup
{
	InformationDisplayHelper stringFormatHelper = new InformationDisplayHelper();

	static City CALIFORNI_WAY = City.CALIFORNI_WAY;


	private ResponseBodyTest()
	{
		super(CALIFORNI_WAY.getUriRepresentation(), Uri.WEATHER_GET_URI.getAddress());
	}


	@Test
	public void WeatherMessageBody()
	{
		this.stringFormatHelper.displayResponseBody(this.responseBodyAsString);
	}


	@Test
	public void WeatherMessageBodyContainsString()
	{
		Assert.assertEquals(this.responseBodyAsString.contains(CALIFORNI_WAY.getNonUriRepresentation()),
				true,
				Message.RESPONSE_DOES_NOT_CONTAIN_APPROPRIATE_STRING.getMessage());
		Assert.assertEquals(
				this.responseBodyAsString.toLowerCase().contains(CALIFORNI_WAY.getNonUriRepresentation().toLowerCase()),
				true,
				Message.RESPONSE_DOES_NOT_CONTAIN_APPROPRIATE_STRING.getMessage());
	}
}
