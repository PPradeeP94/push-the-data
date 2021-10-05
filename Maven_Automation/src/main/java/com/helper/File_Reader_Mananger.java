package com.helper;

public class File_Reader_Mananger {

	public Configuration_Reader getInstancecr() throws Throwable {

		Configuration_Reader reader = new Configuration_Reader();

		return reader;
	}

	public static File_Reader_Mananger getInstance() {
		File_Reader_Mananger manager = new File_Reader_Mananger();
		
		return manager;

	}

	private File_Reader_Mananger() {

	}

}
