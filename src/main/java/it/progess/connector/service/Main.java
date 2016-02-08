package it.progess.connector.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/ProgessCore/rest/user");
		System.out.println(target.request().post(Entity.json("{'username':'a1d1@libero.it','password':'a1d1@libero.it'}")).getStatus());
		Response response = target.request().post(Entity.json("{'username':'a1d1@libero.it','password':'a1d1@libero.it'}"));
		String jsonString = response.readEntity(String.class);
		System.out.println(jsonString);
		*/
		//System.out.println(ProgessConnector.doPost("CHECK_USER", "{'username':'a1d1@libero.it','password':'a1d1@libero.it'}"));
		
		/*Properties prop = new Properties();
		String propFile = "properties.properties";
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			InputStream ins = classloader.getResourceAsStream(propFile);
			prop.load(ins);
			System.out.println(prop.get("TEST"));
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		
		
		
	}

}
