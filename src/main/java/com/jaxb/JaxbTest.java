package com.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JaxbTest {
	private int id;
	private String name;
	private String roll;
	
	public JaxbTest(){}
	public JaxbTest(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
	}
	@XmlAttribute
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	@XmlAttribute
	public void setRoll(String roll) {
		this.roll = roll;
	}

}
