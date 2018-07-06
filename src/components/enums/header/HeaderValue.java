package components.enums.header;

/**
 *
 * {@link HeaderValue} provides enum value to represent the header key value's within a response
 *
 */
public enum HeaderValue
{
	SERVER("server"),
	CONTENT_TYPE("Content-Type"),
	CONTENT_ENCODING("Content-Encoding");

	String headerValue;


	HeaderValue(final String responseHeaderValue)
	{
		this.headerValue = responseHeaderValue;
	}


	/**
	 * Return the string representation of a given header key
	 *
	 * @return {@link String} the value of the header key
	 */
	public String getStringRepresentation()
	{
		return this.headerValue;
	}
}
