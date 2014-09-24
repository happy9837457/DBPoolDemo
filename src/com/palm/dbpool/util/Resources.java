package com.palm.dbpool.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Resources {
	
	private static ClassLoader DEFAULT_CLASSLOADER = null;
	
	public static Properties readAsProperties(String name){
		
		InputStream in = null;
		Properties prop = null;
		try{
			in = getResourceAsStream(name);
			
			prop = new Properties();
			
			prop.load(in);
			
		}catch (Exception e) {

			e.printStackTrace();
		}finally{
			
			if(in != null){
				
				try {
					
					in.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
		}
		
		return prop;
	}
	
	public static InputStream getResourceAsStream(String name){
		
		return getClassLoader().getResourceAsStream(name);
	}
	
	public static ClassLoader getClassLoader(){
		
		if(DEFAULT_CLASSLOADER != null){
			
			return DEFAULT_CLASSLOADER;
		}
		
		return Thread.currentThread().getContextClassLoader();
	}

	public static void setDEFAULT_CLASSLOADER(ClassLoader default_classloader) {
		
		DEFAULT_CLASSLOADER = default_classloader;
	}
	
}
