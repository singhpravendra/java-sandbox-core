package com.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		JAXBContext jaxbOb=JAXBContext.newInstance(JaxbTest.class);
		File fl=new File("JaxBtest.xml");
		Unmarshaller unMar=jaxbOb.createUnmarshaller();
		JaxbTest jaxbUnObj=(JaxbTest) unMar.unmarshal(fl);
		System.out.println(jaxbUnObj.getId()+" "+jaxbUnObj.getName());
		System.out.println("Maza a gya-");
	}

}
