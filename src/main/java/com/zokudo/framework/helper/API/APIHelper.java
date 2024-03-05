package com.zokudo.framework.helper.API;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Reporter;

import com.zokudo.constants.APIConstants;
import com.zokudo.framework.helper.InitializeWebDriver;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIHelper {
	RequestSpecification request;

	public APIHelper() {
//		RestAssured.baseURI = url;
		request = RestAssured.given();
	}

	public RequestSpecification basicAuthentication(String username, String password) {
		return request.auth().preemptive().basic(username, password);
	}

	public RequestSpecification addHeader(String username, String password) {
		return basicAuthentication(username, password).header("Accept", ContentType.JSON.getAcceptHeader())
				.contentType(ContentType.JSON);
	}

	public Response postWithAuth(String username, String password) {
		return addHeader(username, password).post();
	}

	public Response post(String url, File fileName) {
		return request.contentType(ContentType.JSON).body(fileName).when().post(url);
	}

	public Response post(String url, String json_string) {
		System.out.println("Request ==> " + json_string);
		APIConstants.logs.add("Request ==> " + json_string);
		Reporter.log("Request ==> " + json_string);
		InitializeWebDriver.scenario.write("Request ==> " + json_string);
		return request.contentType(ContentType.JSON).body(json_string).when().post(url);
	}

	public Response postWithHeader(String url, String json_string) {
		System.out.println("Request ==> " + json_string);
		APIConstants.logs.add("Request ==> " + json_string);
		Reporter.log("Request ==> " + json_string);
		InitializeWebDriver.scenario.write("Request ==> " + json_string);
		return request.contentType(ContentType.JSON)
				.header("Authorization", "Basic YXBwbGljYXRpb25MZXZlbFVzZXI6QCMkRkFEU0BAIyRBRg==").body(json_string)
				.when().post(url);
	}

	public String getResponseBody(Response response) {
		String res = response.getBody().asString();
		APIConstants.logs.add("Response ==> " + res);
		Reporter.log("Response ==> " + res);
		InitializeWebDriver.scenario.write("Response ==> " + res);
		return res;
	}

	public int getResponseCode(Response response) {
		return response.getStatusCode();
	}

	@SuppressWarnings("unchecked")
	public static Map<Object, Object> getMapFromJsonString(String data) {
		ObjectMapper mapper = new ObjectMapper();
		Map<Object, Object> dataMap = new HashMap<Object, Object>();
		try {
			dataMap = mapper.readValue(data, Map.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dataMap;
	}

	public String getDescription(Response response) {
		System.out.println("Response ==> " + getResponseBody(response));
		String description = response.getBody().path("description").toString();
		return description;
	}

	public String getStatus(Response response) {
		String status = response.getBody().path("status").toString();
		return status;
	}

	public void setLogs() {
		String file = "log.txt";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file)));
			for (int i = 0; i < APIConstants.logs.size(); i++) {
				if (i != 0)
					bw.newLine();
				bw.write(APIConstants.logs.get(i));
				if (APIConstants.logs.get(i).contains("Response")) {
					bw.newLine();
					bw.write(
							"====================================================================================================");
				}
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
