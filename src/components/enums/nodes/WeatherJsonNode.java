package components.enums.nodes;

/**
 * {@link WeatherJsonNode} provides ...
 *
 */
public enum WeatherJsonNode
{
	TEMPERATURE("Temperature"),
	WIND_DIRECTION_DEGREE("WindDirectionDegree"),
	HUMIDITY("Humidity"),
	WEATHER_DESCRIPTION("WeatherDescription"),
	WIND_SPEED("WindSpeed"),
	CITY("City");

	String node;


	WeatherJsonNode(final String node)
	{
		this.node = node;
	}


	public String getNodeAsString()
	{
		return this.node;
	}
}
