package components.enums.cities;

/**
 * {@link City} provides ...
 *
 */
public enum City
{
	LEEDS("/Leeds", "Leeds"),
	MANCHESTER("/Manchester", "Manchester"),
	BOSTON("/Boston", "Boston"),
	SAN_FRAN("/San Francisco", "San Francisco"),
	CALIFORNI_WAY("/California", "California"),
	WINDY_CITY("/Chicago", "Chicago");

	String uriRepresentation;
	String nonUriRepresentation;


	City(final String uriRepresentation, final String nonUriRepresentation)
	{
		this.uriRepresentation = uriRepresentation;
		this.nonUriRepresentation = nonUriRepresentation;
	}


	public String getUriRepresentation()
	{
		return this.uriRepresentation;
	}


	public String getNonUriRepresentation()
	{
		return this.nonUriRepresentation;
	}
}
