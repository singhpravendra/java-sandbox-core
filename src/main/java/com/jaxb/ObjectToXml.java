package com.jaxb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXml {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		JAXBContext jaxbOBJ=JAXBContext.newInstance(JaxbTest.class);
		
		Marshaller marsObj=jaxbOBJ.createMarshaller();
		marsObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		JaxbTest jbTest=new JaxbTest(1,"Pintu"); 
		jbTest.setId(2);
		jbTest.setName("NAME");
		jbTest.setRoll("Roll");
		
		
		marsObj.marshal(jbTest, new FileOutputStream("JaxBtest.xml"));
		System.out.println(marsObj.toString());
		marsObj.marshal(jbTest, System.out);
		System.out.println("Done.");
	}
}
