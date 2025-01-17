package com.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommonInfoRequest {

	@JsonProperty("Info")
	private Info info;

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public CommonInfoRequest() {
		if (info == null) {
			info = new Info();
		}
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public class Info {

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
