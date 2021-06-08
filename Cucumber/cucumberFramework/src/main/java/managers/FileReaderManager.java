package managers;

import dataProvider.ConfigFileReader;
import gherkin.lexer.Fi;

public class FileReaderManager {
	
	private static ConfigFileReader configFileReader;
	
	private FileReaderManager() { }
	
	public static ConfigFileReader getInstance() {
		return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
          
	}

}
