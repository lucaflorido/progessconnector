package it.progess.connector.service.vo;

import java.util.Map;

public class ProgessRequest {
	
	private String urlcode;
	private String payload;
	private Map<String, String> params;
	
	
	public String getUrlcode() {
		return urlcode;
	}
	public void setUrlcode(String urlcode) {
		this.urlcode = urlcode;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
}
