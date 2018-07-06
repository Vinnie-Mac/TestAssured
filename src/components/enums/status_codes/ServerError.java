package components.enums.status_codes;

/**
 * {@link ServerError} provides status code values that indicates cases in which the server is aware that it has erred
 * or is incapable of performing the request.
 *
 */
public enum ServerError
{
	INTERNAL_SERVER_ERROR(500, "500"),
	NOT_IMPLEMENTED(501, "501"),
	BAD_GATEWAY(502, "502"),
	SERVICE_UNAVAILABLE(503, "503"),
	GATEWAY_TIMEOUT(504, "504"),
	HTTP_VERSION_NOT_SUPPORTED(505, "505"),
	VARIANT_ALSO_NEGOTIATES(506, "506"),
	INSUFFICIENT_STORAGE(507, "507"),
	LOOP_DETECTED(508, "508"),
	BANDWIDTH_LIMIT_EXCEEDED(509, "509"),
	NOT_EXTENDED(510, "510"),
	NETWORK_AUTHENTICATION_REQUIRED(511, "511"),
	NETWORK_READ_TIMEOUT_ERROR(598, "598"),
	NETWORK_CONNECT_TIMEOUT_ERROR(599, "599");

	int codeValue;
	String codeValueAsString;


	ServerError(final int codeValue, final String codeValueAsString)
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
