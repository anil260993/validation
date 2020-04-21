package com.GEC.MIS.popup;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.GEC.utility.*;

import junit.framework.Assert;

public class Mis_Popups {

	
		@Test
		public static void m1() throws Exception {
	Popup_Validation.launch("chrome");
	
	Popup_Validation.drillDown_To_BlockOrDistrictOrState("CHHATTISGARH","BALOD");//CHHATTISGARH
	
	
	Popup_Validation.MIS_Filter_Selection("2016-2017", "Annual","Admin","Normal");
	//Popup_Validation.popup_checking_functionality("Monsoon", 1);
	//Popup_Validation.MIS_Filter_Selection("aa", "Anual", "Amin", "ormal");
	Assert.assertEquals(expected, actual);
	SoftAssert s=new SoftAssert();
	s.assertAll();
		}

	

}
