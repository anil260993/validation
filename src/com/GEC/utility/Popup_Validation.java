package com.GEC.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class Popup_Validation extends Utility {
	public static void popup_checking_functionality(String Period, int S_no) throws InterruptedException {
		Thread.sleep(3000);
		WebElement block_count = driver
				.findElement(By.xpath("/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/tbody"));
		List<WebElement> listOfRows_1 = block_count.findElements(By.tagName("tr"));// taking block count
		if (listOfRows_1.size() != 0 && S_no > 0 && S_no <= listOfRows_1.size()) {
			// if(listOfRows_1.size()!=0) {
			String location = driver.findElement(By.xpath(
					"/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/tbody/tr[" + S_no + "]/td[2]"))
					.getText();// taking block name from MIS Table
			// System.out.println("After locatin::"+location);
			if (Period == "Annual") {

				int x[] = { 10, 11, 13, 14, 16, 17, 22, 23, 25, 26, 28, 29, 55, 56, 61, 62, 64, 65, 67, 68, 70, 71, 76,
						77, 78, 79, 80, 87, 88, 90, 91, 96, 97, 105, 106, 108, 109 };

				for (int i = 0; i < x.length; i++) {
					Thread.sleep(3000);

					String check = driver.findElement(
							By.xpath("/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/tbody/tr[" + S_no
									+ "]/td[" + x[i] + "]"))
							.getText();// taking text from each column in MIS tabel

					if (check.equalsIgnoreCase("-")) {
						if (x[i] == 10) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command          Data Not Present(-) for Rainfall Recharge  ");

						} else if (x[i] == 11) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command       Data Not Present(-) for Rainfall Recharge");

						} else if (x[i] == 13) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command            Data Not Present(-) for  Ground Water Irrigation");

						} else if (x[i] == 14) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command         Data Not Present(-) for Ground Water Irrigation");
						} else if (x[i] == 16) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command              Data Not Present(-)  for Surface Water Irrigation ");

						} else if (x[i] == 17) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command         Data Not Present(-)  for Surface Water Irrigation ");
						} else if (x[i] == 22) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command              Data Not Present(-) for Canal Recharge");

						} else if (x[i] == 23) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-) for Canal Recharge");
						} else if (x[i] == 25) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-) for  Tanks and Ponds Recharge");

						} else if (x[i] == 26) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-) for  Tanks and Ponds Recharge");
						} else if (x[i] == 28) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)  for Water Conservation Structure Recharge");

						} else if (x[i] == 29) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-) for Water Conservation Structure Recharge");
						} else if (x[i] == 55) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-) for Unaccounted Flows of Natural Discharge");

						} else if (x[i] == 56) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)  for Unaccounted Flows of Natural Discharge");
						} else if (x[i] == 61) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)  for  Net Extractable Ground water Resource");

						} else if (x[i] == 62) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)  for Net Extractable Ground water Resource");
						} else if (x[i] == 64) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)   for Irrigation Ground Water Extraction");

						} else if (x[i] == 65) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-) for Irrigation Ground Water Extraction");
						} else if (x[i] == 67) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)  for Domestic Ground Water Extraction");

						} else if (x[i] == 68) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)  for Domestic Ground Water Extraction");
						} else if (x[i] == 70) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)  for Industrial Ground Water Extraction");

						} else if (x[i] == 71) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)  for Industrial Ground Water Extraction");
						}

						else if (x[i] == 76) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)   for Stage of Ground Water Extraction");

						} else if (x[i] == 77) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)  for  Stage of Ground Water Extraction");
						}

						else if (x[i] == 78) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Total                   Data Not Present(-) for Stage of Ground Water Extraction");

						} else if (x[i] == 79) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-) for Categorization of Assessment Unit");

						} else if (x[i] == 80) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-) for Categorization of Assessment Unit");
						} else if (x[i] == 87) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)  for Ground water allocation");

						} else if (x[i] == 88) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)  for Ground water allocation");
						}

						else if (x[i] == 90) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)    for Net Annual Ground Water Availability for Future Use");

						} else if (x[i] == 91) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)   for Net Annual Ground Water Availability for Future Use");
						} else if (x[i] == 96) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)   for Additional Potential--->Waterlogged and Shallow Water Table");

						} else if (x[i] == 97) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)    for Additional Potential--->Waterlogged and Shallow Water Table");
						} else if (x[i] == 105) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)   for  In-Storage Ground Water Resources--->Static Ground Water Resource");

						} else if (x[i] == 106) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command               Data Not Present(-)   for In-Storage Ground Water Resources--->Static Ground Water Resource");
						} else if (x[i] == 108) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)  for Total Ground Water Availability in Unconfined Aquifier");

						} else if (x[i] == 109) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)   for Total Ground Water Availability in Unconfined Aquifier");
						}

					}

					else {
						// Thread.sleep(3000);

						/*
						 * WebElement l= driver .findElement(By.xpath(
						 * "/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/tbody"));
						 * List<WebElement> l_1 = l.findElements(By.tagName("tr")); int
						 * count=l_1.size(); if(count>0 && block_rownumber_on_mistable>0
						 * &&block_rownumber_on_mistable<=count)
						 */
						driver.findElement(
								By.xpath("/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/tbody/tr["
										+ S_no + "]/td[" + x[i] + "]"))
								.click();// if text is not - then click on the column

						Thread.sleep(3000);
						try {
							if (driver.findElement(By.xpath(
									"/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[2]/div/div/app-rechargerainfall/div/div[1]/div/div/div/div[1]/strong"))
									.isDisplayed()
									&& driver.findElement(By.xpath(
											"/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[1]/h5"))
											.isDisplayed()) {// checking location and header for popup is coming or not
								// location=driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[2]/div/div/app-rechargerainfall/div/div[1]/div/div/div/div[1]/strong")).getText()
								// ;
								String Region = driver.findElement(By.xpath(
										"/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[2]/div/div/app-rechargerainfall/div/div[1]/div/div/div/div[2]/strong"))
										.getText();// taking Region from popup
								String popup_name = driver.findElement(By.xpath(
										"/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[1]/h5"))
										.getText();// taking header of popup in varaiable location
								System.out.println(
										"Location---->" + location + "   Period--->" + Period + "   Region---->"
												+ Region + "   popup_name---->" + popup_name + "  is opened       ");
								driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[1]/button/span")).click();//closing opende popup
							}
						} catch (NoSuchElementException e) { // if text is not visible then popup is not opended
							if (x[i] == 10) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Rainfall Recharge Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 11) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command               popup_name----->Rainfall Recharge Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 13) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Ground Water Irrigation Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 14) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Ground Water Irrigation Summary not  opended ");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 16) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Surface Water Irrigation Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 17) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Surface Water Irrigation Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 22) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Canal Recharge Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 23) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Canal Recharge Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 25) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Tanks and Ponds Recharge Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 26) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Tanks and Ponds Recharge Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 28) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Water Conservation Structure Recharge Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 29) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Water Conservation Structure Recharge Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 55) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Unaccounted Flows of Natural Discharge not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 56) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Unaccounted Flows  of Natural Discharge not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 61) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Net Extractable Ground water Resource not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 62) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Net Extractable Ground water Resource  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 64) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Irrigation Ground Water Extraction Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 65) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Irrigation Ground Water Extraction Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 67) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Domestic Ground Water Extraction Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 68) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Domestic Ground Water Extraction Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 70) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Industrial Ground Water Extraction Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 71) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Industrial Ground Water Extraction Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							}

							else if (x[i] == 76) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Stage of Ground Water Extraction Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 77) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Stage of Ground Water Extraction Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							}

							else if (x[i] == 78) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Total                   popup_name----->Stage of Ground Water Extraction Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 79) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Ground water trend Summary   /  Categorization of Assessment Unit popup   not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 80) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Ground water trend Summary   / Categorization of Assessment Unit popup  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 87) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Ground water allocation Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 88) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Ground water allocation Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							}

							else if (x[i] == 90) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Net Annual Ground Water Availability for Future Use not  opended  ");

								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 91) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Net Annual Ground Water Availability for Future Use  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 96) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Additional Potential--->Waterlogged and Shallow Water Table   not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 97) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Additional Potential--->Waterlogged and Shallow Water Table   not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 105) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->In-Storage Ground Water Resources--->Static Ground Water Resource Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 106) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->In-Storage Ground Water Resources--->Static Ground Water Resource Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 108) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Total Ground Water Availability in Unconfined Aquifier Summary   not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 109) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Total Ground Water Availability in Unconfined Aquifier Summary    not  opended");
								Page_refresh();
								checking_expand_functionality();
							}
						}

					}
				}
			} else if (Period.equalsIgnoreCase("Monsoon") || Period.equalsIgnoreCase("Non-Monsoon")) {
				int x[] = { 10, 11, 13, 14, 16, 17, 22, 23, 25, 26, 28, 29, 55, 56, 64, 65, 67, 68, 70, 71, 96, 97 };

				for (int i = 0; i < x.length; i++) {
					Thread.sleep(3000);
					String check = driver.findElement(
							By.xpath("/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/tbody/tr[" + S_no
									+ "]/td[" + x[i] + "]"))
							.getText();// taking location form mis table

					if (check.equalsIgnoreCase("-")) {
						if (x[i] == 10) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command          Data Not Present(-) for Rainfall Recharge  ");

						} else if (x[i] == 11) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command       Data Not Present(-) for Rainfall Recharge");

						} else if (x[i] == 13) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command            Data Not Present(-) for  Ground Water Irrigation");

						} else if (x[i] == 14) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command         Data Not Present(-) for Ground Water Irrigation");
						} else if (x[i] == 16) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command              Data Not Present(-)  for Surface Water Irrigation ");

						} else if (x[i] == 17) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command         Data Not Present(-)  for Surface Water Irrigation ");
						} else if (x[i] == 22) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command              Data Not Present(-) for Canal Recharge");

						}

						else if (x[i] == 23) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-) for Canal Recharge");
						} else if (x[i] == 25) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-) for  Tanks and Ponds Recharge");

						} else if (x[i] == 26) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-) for  Tanks and Ponds Recharge");
						} else if (x[i] == 28) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)  for Water Conservation Structure Recharge");

						} else if (x[i] == 29) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-) for Water Conservation Structure Recharge");
						} else if (x[i] == 55) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-) for Unaccounted Flows of Natural Discharge");

						} else if (x[i] == 56) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)  for Unaccounted Flows of Natural Discharge");
						}

						else if (x[i] == 64) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)   for Irrigation Ground Water Extraction");

						}

						else if (x[i] == 65) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-) for Irrigation Ground Water Extraction");
						} else if (x[i] == 67) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)  for Domestic Ground Water Extraction");

						} else if (x[i] == 68) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)  for Domestic Ground Water Extraction");
						} else if (x[i] == 70) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)  for Industrial Ground Water Extraction");

						} else if (x[i] == 71) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)  for Industrial Ground Water Extraction");
						}

						else if (x[i] == 96) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Command                   Data Not Present(-)   for Additional Potential--->Waterlogged and Shallow Water Table");

						}

						else if (x[i] == 97) {
							System.out.println("Location---->" + location + "   Period--->" + Period
									+ "      Region ---->Non-Command                Data Not Present(-)    for Additional Potential--->Waterlogged and Shallow Water Table");
						}

					} else {
						Thread.sleep(3000);

						driver.findElement(
								By.xpath("/html/body/app-root/main/app-misview/div/div[2]/div[2]/div/table/tbody/tr["
										+ S_no + "]/td[" + x[i] + "]"))
								.click();

						// Thread.sleep(3000);
						try {
							if (driver.findElement(By.xpath(
									"/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[2]/div/div/app-rechargerainfall/div/div[1]/div/div/div/div[1]/strong"))
									.isDisplayed()
									&& driver.findElement(By.xpath(
											"/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[1]/h5"))
											.isDisplayed()) {
								// location=driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[2]/div/div/app-rechargerainfall/div/div[1]/div/div/div/div[1]/strong")).getText()
								// ;
								String Region = driver.findElement(By.xpath(
										"/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[2]/div/div/app-rechargerainfall/div/div[1]/div/div/div/div[2]/strong"))
										.getText();
								String popup_name = driver.findElement(By.xpath(
										"/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[1]/h5"))
										.getText();
								System.out.println(
										"Location---->" + location + "   Period--->" + Period + "   Region---->"
												+ Region + "   popup_name---->" + popup_name + "  is opened       ");
								driver.findElement(By.xpath(
										"/html/body/ngb-modal-window/div/div/app-computationpopup/div/div[1]/button/span"))
										.click(); //closing popup
							}
						} catch (NoSuchElementException e) {

							if (x[i] == 10) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Rainfall Recharge Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 11) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command               popup_name----->Rainfall Recharge Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 13) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Ground Water Irrigation Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 14) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Ground Water Irrigation Summary not  opended ");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 16) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Surface Water Irrigation Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 17) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Surface Water Irrigation Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 22) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Canal Recharge Summary not opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 23) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Canal Recharge Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 25) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Tanks and Ponds Recharge Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 26) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Tanks and Ponds Recharge Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 28) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Water Conservation Structure Recharge Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 29) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Water Conservation Structure Recharge Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							}

							else if (x[i] == 55) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Unaccounted Flows of Natural Discharge not  opended");
								Page_refresh();
								checking_expand_functionality();

							} else if (x[i] == 56) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Unaccounted Flows  of Natural Discharge not  opended");
								Page_refresh();
								checking_expand_functionality();
							}

							else if (x[i] == 64) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Irrigation Ground Water Extraction Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 65) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Irrigation Ground Water Extraction Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 67) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Domestic Ground Water Extraction Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 68) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Domestic Ground Water Extraction Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 70) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Industrial Ground Water Extraction Summary  not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 71) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Industrial Ground Water Extraction Summary not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 96) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Command                   popup_name----->Additional Potential--->Waterlogged and Shallow Water Table   not  opended");
								Page_refresh();
								checking_expand_functionality();
							} else if (x[i] == 97) {
								System.out.println("Location---->" + location + "   Period--->" + Period
										+ "      Region ---->Non-Command                popup_name----->Additional Potential--->Waterlogged and Shallow Water Table   not  opended");
								Page_refresh();
								checking_expand_functionality();
							}

						}

					}

				}

			}

		} else {
			System.out.println("Given  " + S_no
					+ "  number of blocks  is not present in MIS Table please give valid block number");

		}
	}

}
