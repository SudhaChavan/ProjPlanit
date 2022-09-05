package StepDefination;

import TestBase.TestBase;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

import java.util.List;
//import java.awt.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pages.ContactPage;
import Pages.ShoppingPage;

public class ShoppingPageMethod extends TestBase {

	public static ContactPage contactPage = new ContactPage();
	public static ShoppingPage shopPage = new ShoppingPage();

	@Given("^user is on the HomePage of the Jupiter testing site$")
	public void user_is_on_the_HomePage_of_the_Jupiter_testing_site() throws Throwable {
		initialization();
		String ExpectedTitle = "Jupiter Toys";
		String actualTitle = driver.getTitle();
		System.out.println("Home Page title ::" + actualTitle);
		// Verify the title
		Assert.assertEquals(actualTitle, ExpectedTitle);

	}

	@When("^user click on the Shop Page$")
	public void user_click_on_the_Shop_Page() throws Throwable {
		try {
			WebElement shoptButton = driver.findElement(By.xpath(shopPage.shop));
			shoptButton.click();

		} catch (Exception e) {
			System.out.println("Something Went wrong in the Method" + e.getMessage());

		}
	}

	@When("^user selects the \"([^\"]*)\" , \"([^\"]*)\"  and \"([^\"]*)\"$")
	public void user_selects_the_and(String frog, String bunny, String bear) throws Throwable {

		try {
//			WebElements toys = driver.findElement(By.xpath(shopPage.toyType));
			List<WebElement> toyList = driver.findElements(By.xpath(shopPage.toyType));
			System.out.println("toyList.size():" + toyList.size());
			String toy;
			List<WebElement> buyOption = driver.findElements(By.xpath(shopPage.buyOption));

			for (int i = 0; i < toyList.size(); i++) {
				toy = toyList.get(i).getText();
				System.out.println("toyName:" + toy);
				System.out.println("toyName i:" + i);

				if (toy.contains("Stuffed Frog")) {
					WebElement buyOptionForEachToy = buyOption.get(i);
					System.out.println("Stuffed Frog CLicked:");
					buyOptionForEachToy.click();

				} else if (toy.contains("Fluffy Bunny")) {
					WebElement buyOptionForEachToy = buyOption.get(i);
					System.out.println("Fluffy Bunny CLicked:");
					buyOptionForEachToy.click();
				} else if (toy.contains("Valentine Bear")) {
					WebElement buyOptionForEachToy = buyOption.get(i);
					System.out.println("Valentine Bear CLicked:");
					buyOptionForEachToy.click();
				}

			}

		} catch (Exception e) {
			System.out.println("Something Went wrong in the Method" + e.getMessage());

		}

	}

	@When("^user click on the cart$")
	public void user_click_on_the_cart() throws Throwable {
		System.out.println("In the Click Cart");
		try {
			WebElement cartButton = driver.findElement(By.xpath(shopPage.cart));
			cartButton.click();

		} catch (Exception e) {
			System.out.println("Something Went wrong in the Method" + e.getMessage());

		}
	}

	@When("^user Enters the value quantity of (\\d+) , (\\d+)  and (\\d+) Each Item and verify subtotal$")
	public void user_Enters_the_value_quantity_of_and_Each_Item_and_verify_subtotal(int frog, int bunny, int bear)
			throws Throwable {

		double ExpFrogPrice = 0;
		double ExpBunnyPrice = 0;
		double ExpBearPrice = 0;
		try {
//			WebElements toysSelected = driver.findElement(By.xpath(shopPage.toySelected));
			List<WebElement> toysSelected = driver.findElements(By.xpath(shopPage.toySelected));
			System.out.println("toysSelected.size():" + toysSelected.size());
			String toy;
			List<WebElement> subTotalPriceToySelected = driver
					.findElements(By.xpath(shopPage.subTotalPriceToySelected));
			List<WebElement> priceOfEachToySelected = driver.findElements(By.xpath(shopPage.priceOfEachToySelected));
			List<WebElement> quantityOfToySelected = driver.findElements(By.xpath(shopPage.quantityOfToySelected));

			for (int i = 0; i < toysSelected.size(); i++) {
				toy = toysSelected.get(i).getText();
				
				if (i == 0) {
					WebElement noOfStuffedFrog = quantityOfToySelected.get(i);

					noOfStuffedFrog.click();
					noOfStuffedFrog.clear();
					String nofrog = Integer.toString(frog);
					noOfStuffedFrog.sendKeys(nofrog);

					WebElement ActualsubTotalPriceFrog = subTotalPriceToySelected.get(i);
					WebElement priceOfEachFrogSelected = priceOfEachToySelected.get(i);
//					int quantityOfFrogSelected = frog;

					String froga = priceOfEachFrogSelected.getText();
					froga = froga.substring(1);

					ExpFrogPrice = frog * Double.parseDouble(froga);

					String ActualsubPriceFrog = ActualsubTotalPriceFrog.getText();
					ActualsubPriceFrog = ActualsubPriceFrog.substring(1);

					Double ActFrogPrice = Double.parseDouble(ActualsubPriceFrog);

					if (ExpFrogPrice == ActFrogPrice) {
						System.out.println("Values of Subtotal is Equal " + "ActualFrogPrice" + ActFrogPrice
								+ "ExpFrogPrice: " + ExpFrogPrice);
					} else {
						System.out.println("Values of Subtotal is Not Equal " + "ActualFrogPrice" + ActFrogPrice
								+ "ExpFrogPrice: " + ExpFrogPrice);
					}

				} else if (i == 1) {

					WebElement noOfStuffedbunny = quantityOfToySelected.get(i);

					noOfStuffedbunny.click();
					noOfStuffedbunny.clear();
					String nobunny = Integer.toString(bunny);

					noOfStuffedbunny.sendKeys(nobunny);

					//////////////
					WebElement ActualsubTotalPriceBunny = subTotalPriceToySelected.get(i);
					WebElement priceOfEachBunnySelected = priceOfEachToySelected.get(i);

					String Bunny = priceOfEachBunnySelected.getText();
					Bunny = Bunny.substring(1);

					ExpBunnyPrice = bunny * Double.parseDouble(Bunny);

					String ActualsubPriceBunny = ActualsubTotalPriceBunny.getText();
					ActualsubPriceBunny = ActualsubPriceBunny.substring(1);

					Double ActBunnyPrice = Double.parseDouble(ActualsubPriceBunny);

					if (ExpBunnyPrice == ActBunnyPrice) {
						System.out.println("Values of Subtotal is Equal " + "ActBunnyPr: ice" + ActBunnyPrice
								+ "ExpBunnyPrice: " + ExpBunnyPrice);
					} else {
						System.out.println("Values of Subtotal is Not Equal " + "ActBunnyPrice" + ActBunnyPrice
								+ "ExpBunnyPrice: " + ExpBunnyPrice);
					}

					/////////////////////////////
				} else if (i == 2) {
					WebElement noOfStuffedBear = quantityOfToySelected.get(i);

					noOfStuffedBear.click();
					noOfStuffedBear.clear();

					String noBear = Integer.toString(bear);

					noOfStuffedBear.sendKeys(noBear);

					////
					WebElement ActualsubTotalPriceBear = subTotalPriceToySelected.get(i);
					WebElement priceOfEachBearSelected = priceOfEachToySelected.get(i);

					String Bear = priceOfEachBearSelected.getText();
					Bear = Bear.substring(1);

					ExpBearPrice = bear * Double.parseDouble(Bear);

					String ActualsubPriceBear = ActualsubTotalPriceBear.getText();
					ActualsubPriceBear = ActualsubPriceBear.substring(1);

					Double ActBearPrice = Double.parseDouble(ActualsubPriceBear);

					if (ExpBearPrice == ActBearPrice) {
						System.out.println("Values of Subtotal is Equal " + "ActBearPr: ice" + ActBearPrice
								+ "ExpBearPrice: " + ExpBearPrice);
					} else {
						System.out.println("Values of Subtotal is Not Equal " + "ActBearPrice" + ActBearPrice
								+ "ExpBearPrice: " + ExpBearPrice);
					}

				}

			}

		} catch (Exception e) {
			System.out.println("Something Went wrong in the Select Quantity Method : " + e.getMessage());

		}

	}

	@When("^Verify that total is equal sum sub totals$")
	public void verify_that_total_is_equal_sum_sub_totals() throws Throwable {

		List<WebElement> subTotalPriceToySelected = driver.findElements(By.xpath(shopPage.subTotalPriceToySelected));
		Double Exptotal = 0.0;

		for (int i = 0; i < subTotalPriceToySelected.size(); i++) {

			String totalofEachToy = subTotalPriceToySelected.get(i).getText();
			totalofEachToy = totalofEachToy.substring(1);

			Exptotal = Double.parseDouble(totalofEachToy) + Exptotal;

		}
		
		WebElement ActualTotPrice = driver.findElement(By.xpath(shopPage.totalPrice));
		String ActTotPrice =ActualTotPrice.getText();
		ActTotPrice=ActTotPrice.substring(7);
		
		
		
		
		if (ActTotPrice == ActTotPrice) {
			System.out.println("Values of Subtotal is Equal " + "ActTotPrice" + ActTotPrice
					+ "ActTotPrice: " + ActTotPrice);
		} else {
			System.out.println("Values of Subtotal is Not Equal " + "ActTotPrice" + ActTotPrice
					+ "ActTotPrice: " + ActTotPrice);
		}


	}

	
//	@After
	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
		System.out.println("The Chrome Browser is Closed");
	}
	

}
