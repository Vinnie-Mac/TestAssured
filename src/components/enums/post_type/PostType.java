package components.enums.post_type;

/**
 * {@link PostType} provides ...
 *
 */
public enum PostType
{
	REGISTER("/register");


	String uriRepresentation;


	PostType(final String uri)
	{
		this.uriRepresentation = uri;
	}


	public String getUriRepresentation()
	{
		return this.uriRepresentation;
	}
}
