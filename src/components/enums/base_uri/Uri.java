package components.enums.base_uri;

/**
 * {@link Uri} provides ...
 *
 */
public enum Uri
{
	WEATHER_GET_URI("http://restapi.demoqa.com/utilities/weather/city"),
	EXAMPLE_SERVICE_ENDPOINT("http://restapi.demoqa.com/customer");


	String address;


	Uri(final String address)
	{
		this.address = address;
	}


	public String getAddress()
	{
		return this.address;
	}
}
