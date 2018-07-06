package components.enums.status_codes;

/**
 * {@link Redirection} provides status code values that indicates further action needs to be taken by the user agent in
 * order to fulfil the request.
 *
 */
public enum Redirection
{
	MULTIPLE_CHOICES(300, "300"),
	MOVED_PERMANENTLY(301, "301"),
	FOUND(302, "302"),
	SEE_OTHER(303, "303"),
	NOT_MODIFIED(304, "304"),
	USE_PROXY(305, "305"),
	TEMPORARY_REDIRECT(307, "307"),
	PERMANENT_REDIRECT(308, "308");

	int codeValue;
	String codeValueAsString;


	Redirection(final int codeValue, final String codeValueAsString)
	{
		this.codeValue = codeValue;
		this.codeValueAsString = codeValueAsString;
	}


	public int getCodeValue()
	{
		return this.codeValue;
	}


	public String getCodeValueAsString()
	{
		return this.codeValueAsString;
	}
}
