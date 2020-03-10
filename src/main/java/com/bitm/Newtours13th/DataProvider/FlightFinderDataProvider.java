package com.bitm.Newtours13th.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.Newtours13th.Utils.ExcelUtils;

public class FlightFinderDataProvider {

	@DataProvider(name="flightfinderData")
	public static Object [][] getFlightFinderData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getFlightFinderData()
					},
				};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	        
    }
}
