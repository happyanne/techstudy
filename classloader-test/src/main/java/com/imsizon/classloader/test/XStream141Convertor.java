package com.imsizon.classloader.test;

import com.thoughtworks.xstream.XStream;

public class XStream141Convertor implements IXstreamConvertor {

	private static XStream xstream = new XStream();

	public String toXml(XmlObject xml) {
		return xstream.toXML(xml);
	}

	public XmlObject fromXml(String xml) {
		return (XmlObject) xstream.fromXML(xml);
	}

}
