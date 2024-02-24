package com.dilip.java11;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpClientExmaple {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();

		/**
		 * // Create an HttpRequest with the desired URI and add headers HttpRequest
		 * request1 = HttpRequest.newBuilder().uri(new
		 * URI("http://localhost:8050/app/get?brandname=AA")) .build();
		 * HttpResponse<String> send = client.send(request1,
		 * HttpResponse.BodyHandlers.ofString());
		 * 
		 * String body = send.body(); ObjectMapper objectMapper = new ObjectMapper();
		 * List<Car> readValue = objectMapper.readValue(body, new
		 * TypeReference<List<Car>>() { }); readValue.stream().forEach(x ->
		 * System.out.print(x.getCarId())); Map<String, Object> jsonMap =
		 * objectMapper.readValue(body, Map.class);
		 * System.out.println(jsonMap.get("noOfKms"));
		 **/

		/****
		 * with Request body , header, post , response body // Define the request body
		 * String[] headers = { "Content-Type: application/json" }; String requestBody =
		 * "{\"key\": \"value\"}"; // // Create an HttpRequest with the desired URI,
		 * headers, and body HttpRequest HttpRequest request2 =
		 * HttpRequest.newBuilder().uri(new URI("https://api.example.com/resource"))
		 * .headers(headers).POST(HttpRequest.BodyPublishers.ofString(requestBody)).build();
		 * HttpResponse<String> send2 = client.send(request2,
		 * HttpResponse.BodyHandlers.ofString());
		 ****/

		// Query parameters
		Map<String, String> params = Map.of("param1", "value1", "param2", "value2","param3", "value1", "param4", "value2");

		// Construct query string
		String queryString = params.entrySet().stream()
				.map(e -> e.getKey() + "=" + e.getValue())
				.collect(Collectors.joining("&"));
		System.out.println(queryString);
	}
}
