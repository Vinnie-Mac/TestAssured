package components.enums.status_codes;

/**
 * {@link InformationalCode} provides status code values that indicates a provisional response, consisting only of the
 * Status-Line and optional headers, and is terminated by an empty line
 *
 */
public enum InformationalCode
{
	CONTINUE(100, "100"),
	SWITCHING_PROTOCOLS(101, "101"),
	PROCESSING(102, "102"),
	CHECKPOINT(103, "103"),
	REQUEST_URI_TOO_LONG(122, "122");


	int codeValue;
	String codeValueAsString;


	InformationalCode(final int codeValue, final String codeValueAsString)
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
