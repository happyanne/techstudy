package com.imsizon.classloader.test;

public class App {

	public static void main(String[] args) {
		XmlObject o = new XmlObject();
		o.setId(1688);
		o.setName("test");
		o.setDescription(new StringBuilder("class loader test"));
		System.out.println("================Raw XmlObject=================");
		System.out.println(o);

		IXstreamConvertor newVersion = new XStream141Convertor();
		String newVersionXml = newVersion.toXml(o);
		System.out
				.println("================XmlObject to xml with xstream 1.4.1=================");
		System.out.println(newVersionXml);

		IXstreamConvertor oldVersion = new XStream112Convertor();
		XmlObject unmarshalObject141 = newVersion.fromXml(newVersionXml);
		System.out
				.println("================Unmarshal XmlObject with xstream 1.4.1=================");
		System.out.println(unmarshalObject141);
		String oldVersionXml = oldVersion.toXml(unmarshalObject141);
		System.out
				.println("================XmlObject to xml with xstream 1.1.2=================");
		System.out.println(oldVersionXml);
		XmlObject unmarshalObject112 = oldVersion.fromXml(oldVersionXml);
		System.out
				.println("================Unmarshal XmlObject with xstream 1.1.2=================");
		System.out.println(unmarshalObject112);
	}

}
