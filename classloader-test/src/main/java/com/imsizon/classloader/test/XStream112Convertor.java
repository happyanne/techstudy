package com.imsizon.classloader.test;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class XStream112Convertor implements IXstreamConvertor {

	private Method toXml = null;

	private Method fromXml = null;

	@SuppressWarnings("rawtypes")
	private Class clazz = null;

	@SuppressWarnings("unchecked")
	public XStream112Convertor() {
		try {
			URLClassLoader loader = new XStreamClassloader(
					new URL[] { new URL(
							"http://maven.oschina.net/content/groups/public/com/thoughtworks/xstream/xstream/1.1.2/xstream-1.1.2.jar") });
			clazz = loader.loadClass("com.thoughtworks.xstream.XStream");
			toXml = clazz.getDeclaredMethod("toXML", java.lang.Object.class);
			fromXml = clazz
					.getDeclaredMethod("fromXML", java.lang.String.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toXml(XmlObject obj) {
		if (toXml != null) {
			try {
				return (String) toXml.invoke(clazz.newInstance(), obj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public XmlObject fromXml(String xml) {
		if (fromXml != null) {
			try {
				return (XmlObject) fromXml.invoke(clazz.newInstance(), xml);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
