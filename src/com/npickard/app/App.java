/**
 * 
 */
package com.npickard.app;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author nigel
 *
 */
public class App {
	// Define a static logger variable so that it references the
	// Logger instance named "HelloWorld".
	static Logger logger = Logger.getLogger(App.class);

	static{
	// Set up a simple configuration that logs on the console.
		BasicConfigurator.configure();
	}

}
