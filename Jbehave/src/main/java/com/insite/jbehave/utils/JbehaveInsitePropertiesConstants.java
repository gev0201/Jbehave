package com.insite.jbehave.utils;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.net.URL;
import java.util.Properties;

import com.helpsystems.common.util.Constants;

public final class JbehaveInsitePropertiesConstants {

	private static final String PROPERTIES_FILE_NAME = "jbehave.insite.test.properties";

	private final static String TEST_INPUTS_PARAM = "sa.test.inputs.root";
	public final static String TEST_INPUTS;
	
	// ################################ PROJECT PROPERTIES 
	private final static String CHROME_DRIVER_PATH_PARAM = "chrome.driver.path";
	public final static String CHROME_DRIVER_PATH;
	private final static String BASE_URL_PARAM = "base.url";
	public final static String BASE_URL;
	
	// ################################ USERS
	private final static String DEFAULT_USERNAME_PARAM = "default.username";
	public final static String DEFAULT_USERNAME;
	private final static String DEFAULT_PASSWORD_PARAM = "default.password";
	public final static String DEFAULT_PASSWORD;

	static {
		Properties properties = new Properties();
		try {
			URL url = Constants.class.getClassLoader().getResource(PROPERTIES_FILE_NAME);
			URI uri = new URI(url.toString());
			FileInputStream fileInputStream = new FileInputStream(uri.getPath());
			properties.load(fileInputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ################################ PROJECT PROPERTIES 
		CHROME_DRIVER_PATH = properties.getProperty(CHROME_DRIVER_PATH_PARAM);
		BASE_URL = properties.getProperty(BASE_URL_PARAM);

		// ################################ USERS
		DEFAULT_USERNAME = properties.getProperty(DEFAULT_USERNAME_PARAM);
		DEFAULT_PASSWORD = properties.getProperty(DEFAULT_PASSWORD_PARAM);

		TEST_INPUTS = properties.getProperty(TEST_INPUTS_PARAM);
		new File(TEST_INPUTS).mkdirs();

	}
}
