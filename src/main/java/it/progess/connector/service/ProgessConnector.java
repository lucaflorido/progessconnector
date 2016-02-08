package it.progess.connector.service;

import it.progess.connector.service.vo.ProgessRequest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ClientInfoStatus;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public  class ProgessConnector {
    private static Properties prop;
    private static String propFile = "config.properties";
    private static String getFromProperties(String key){
    	try {
			if (prop == null){
				prop = new Properties();
				ClassLoader classloader = Thread.currentThread().getContextClassLoader();
				InputStream ins = classloader.getResourceAsStream(propFile);
				prop.load(ins);
			}
		} catch (Exception e) {
			return "";
		}
		return prop.get(key).toString();
    }
	public static String doGet(){
		try{
			Client client = ClientBuilder.newClient();
			WebTarget target = client.target("http://localhost:8080/InvoiceCreator/rest/user/check");
			Invocation.Builder builder = target.request();
			Response response = builder.get();
			//response.get
		}catch(Exception e){
			
		}
		
		return "OK";
	}
	public static String doPost(ProgessRequest pr){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(ProgessConnector.getFromProperties("MAIN_DOMAIN")+ProgessConnector.getFromProperties(pr.getUrlcode()) );
		Response response = target.request().post(Entity.json(pr.getParams()));
		String jsonString = response.readEntity(String.class);
		return jsonString;
	}
	public static String doPut(){
		return "OK";
	}
	public static String doDelete(){
		return "OK";
	}
}
