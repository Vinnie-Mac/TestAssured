package test.json_path;


import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import components.enums.assert_message.Message;
import components.enums.base_uri.Uri;
import components.enums.cities.City;
import components.enums.nodes.WeatherJsonNode;
import helpers.string.InformationDisplayHelper;
import setup.AbstractApiGetSetup;


public class JsonTests extends AbstractApiGetSetup
{
	InformationDisplayHelper informationDisplayHelper = new InformationDisplayHelper();

	private static City CALIFORNI_WAY = City.CALIFORNI_WAY;


	private JsonTests()

	{
		super(CALIFORNI_WAY.getUriRepresentation(), Uri.WEATHER_GET_URI.getAddress());
	}


	@Test
	public void VerifyCityInJsonResponse()
	{
		this.informationDisplayHelper.displayNodeFromResponse(
				WeatherJsonNode.CITY,
				this.jsonPathEvaluator.getString(WeatherJsonNode.CITY.getNodeAsString()));

		Assert.assertEquals(
				this.jsonPathEvaluator.get(WeatherJsonNode.CITY.getNodeAsString()),
				CALIFORNI_WAY.getNonUriRepresentation(),
				Message.RESPONSE_DOES_NOT_CONTAIN_APPROPRIATE_STRING.getMessage());
	}


	@Test
	public void DisplayAllNodesFromResponse()
	{
		displayNodes(new ArrayList<>(EnumSet.allOf(WeatherJsonNode.class)));
	}


	
	private void displayNodes(final List<WeatherJsonNode> nodes) 
	{
		for (final WeatherJsonNode node : nodes)
		{
			this.informationDisplayHelper.displayNodeFromResponse(
					node,
					this.jsonPathEvaluator.getString(node.getNodeAsString()));
		}
	}
}
