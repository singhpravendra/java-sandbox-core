package com.json;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

public class CommonInfoResponse {

	@JsonProperty("Info")
	private Info info;

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public CommonInfoResponse() {
		super();
		info = new Info();
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Info {

		private Map<String, String> fields = new HashMap<String, String>();

		@JsonAnyGetter
		public Map<String, String> getFields() {
			return fields;
		}

		@JsonAnySetter
		public void addToFields(String name, String value) {
			if (value == null)
				value = "";

			fields.put(name, value);
		}

		public void setFields(Map<String, String> fields) {
			this.fields = fields;
		}
	}

}
