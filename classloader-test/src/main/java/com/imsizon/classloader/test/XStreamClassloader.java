package com.imsizon.classloader.test;

import java.net.URL;
import java.net.URLClassLoader;

public class XStreamClassloader extends URLClassLoader {

	public XStreamClassloader(URL[] arg0) {
		super(arg0);
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		if (name != null && name.startsWith("com.thoughtworks.xstream")) {
			return super.findClass(name);
		}
		return this.getClass().getClassLoader().loadClass(name);

	}

}
