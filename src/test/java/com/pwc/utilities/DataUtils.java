package com.pwc.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public String[][] validCredentialData() throws IOException
	{
		String[][] main=ExcelUtils.getSheetIntoTwoDimArray("data/TestData.xlsx", "validCredentialTest");
		return main;
	}

	@DataProvider
	public String[][] invalidCredentialData() {
		String[][] main = new String[4][3];

		main[0][0] = "john";
		main[0][1] = "john123";
		main[0][2] = "Invalid credentials";

		main[1][0] = "Peter";
		main[1][1] = "Peter123";
		main[1][2] = "Invalid credentials";

		main[2][0] = "";
		main[2][1] = "Peter123";
		main[2][2] = "Username cannot be empty";

		main[3][0] = "Peter";
		main[3][1] = "";
		main[3][2] = "Password cannot be empty";

		return main;
	}

	
}
