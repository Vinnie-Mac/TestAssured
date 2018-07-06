package helpers.string;


import components.enums.nodes.WeatherJsonNode;
import io.restassured.http.Header;
import io.restassured.http.Headers;


public class InformationDisplayHelper
{
	/**
	 * Display the key value pair information for a given response header
	 *
	 * @param allHeaders a total list of headers for a given response
	 */
	public void displayHeaders(final Headers allHeaders)
	{
		startOfOutput();

		for (final Header header : allHeaders)
		{
			System.out.println("\nKey: " + header.getName() + " \nValue: " + header.getValue());
		}

		endOfOutput();
	}


	/**
	 * Display the city received from a http response
	 *
	 * @param city the specific city to be received from the response
	 */
	public void displayNodeFromResponse(final WeatherJsonNode chosenNode, final String receivedNode)
	{
		startOfOutput();

		
		System.out.println(chosenNode.getNodeAsString() + " received from Response --> " + receivedNode);

		
		endOfOutput();
	}


	/**
	 * Display the full response body within the console
	 *
	 * @param responseBody the full body from a http response as a string
	 */
	public void displayResponseBody(final String responseBody)
	{
		startOfOutput();

		System.out.printf("\n%s\n", responseBody);

		endOfOutput();
	}



	/**
	 * Display the key value pairing of certain content received from the header.
	 *
	 * @param key the key object within the response header
	 * @param value the value of the corresponding key
	 */
	public void displayHeaderKeyValue(final String key, final String value)
	{
		startOfOutput();

		System.out.println(key + " value: " + value);

		endOfOutput();
	}


	/**
	 * Supply a pair of new lines within the console in order to create a buffer of space before certain content is
	 * output to the console.
	 */
	private void startOfOutput()
	{
		System.out.println("\n[ -- START -- ]\n");
	}


	/**
	 * Supply a pair of new lines within the console in order to create a buffer of space between outputs. Effective if
	 * you need to separate chunks of data within the console during debugging.
	 */
	private void endOfOutput()
	{
		System.out.println("\n[ -- END -- ]\n");
	}
}
