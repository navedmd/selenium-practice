package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
	WebDriver driver;
	
	By loginlink = By.linkText("Log in");
	By email = By.id("Email");
	By pwd = By.id("Password");
	By loginbtn = By.xpath("//input[@value='Log in']");
	
	
	By apshoelink = By.partialLinkText("Apparel & Shoes");
	By cagolfshoelink = By.partialLinkText("Casual Golf Belt");
	By qty = By.id("addtocart_40_EnteredQuantity");
	By addtocart = By.id("add-to-cart-button-40");
	By shoppingcart = By.partialLinkText("Shopping cart");
	
	
	By termsofs = By.id("termsofservice");
	By checkout = By.id("checkout");
	
	
	By newaddr = By.xpath("//select[@id='billing-address-select']//option[@value='']");
	By city = By.id("BillingNewAddress_City");
	By address = By.id("BillingNewAddress_Address1");
	By zip = By.id("BillingNewAddress_ZipPostalCode");
	By phone = By.id("BillingNewAddress_PhoneNumber");
	By contbtn = By.xpath("//input[@value='Continue' and @onclick='Billing.save()']");
	By country = By.id("BillingNewAddress_CountryId");
//	By countryy = By.xpath("//select[@id='BillingNewAddress_CountryId']//option[@value='41']");
	By contbtn2 = By.xpath("//input[@value='Continue' and @onclick='Shipping.save()']");
	By contbtn3 = By.xpath("//input[@value='Continue' and @onclick='ShippingMethod.save()']");
	By cc = By.id("paymentmethod_2");
	By contbtn4 = By.xpath("//input[@value='Continue' and @onclick='PaymentMethod.save()']");
	
	
	By ccname = By.id("CardholderName");
	By ccno = By.id("CardNumber");
	By month = By.id("ExpireMonth");
	


	By monthclick = By.xpath("//select[@id='ExpireMonth' and @class='valid']//option[@value='4']");
	By year = By.id("ExpireYear");
	By yearclick = By.xpath("//select[@id='ExpireYear' and @class='valid']//option[@value='2030']");
	By cvv = By.id("CardCode");
	By contbtn5 = By.xpath("//input[@value='Continue' and @onclick='PaymentInfo.save()']");
	By contbtn6 = By.xpath("//input[@value='Confirm' and @onclick='ConfirmOrder.save()']");
	
	
//	By verify = By.xpath("//strong[text()='Your order has been successfully processed!']");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	public void doLogin() {
		driver.findElement(loginlink).click();
		driver.findElement(email).sendKeys("email@naved.test");
		driver.findElement(pwd).sendKeys("abcd123");
		driver.findElement(loginbtn).click();
	}
	
	public void orderProduct() throws InterruptedException {
		driver.findElement(apshoelink).click();
		driver.findElement(cagolfshoelink).click();
		driver.findElement(qty).clear();
		driver.findElement(qty).sendKeys("10");
		driver.findElement(addtocart).click();
		Thread.sleep(3000);
		driver.findElement(shoppingcart).click();
		
	}
	
	public void doCheckout() {
		driver.findElement(termsofs).click();
		driver.findElement(checkout).click();
		
	}
	
	public void doPayment() throws InterruptedException {
		driver.findElement(newaddr).click();
		driver.findElement(city).sendKeys("Bangalore");
		driver.findElement(address).sendKeys("Bellandur Outer Ring Road");
		driver.findElement(zip).sendKeys("560031");
		driver.findElement(phone).sendKeys("00 11 22 33 44 55");
		Select country_1 = new Select(driver.findElement(country));
		country_1.selectByVisibleText("India");
//		driver.findElement(country).click();
//		driver.findElement(countryy).click();
		driver.findElement(contbtn).click();
		driver.findElement(contbtn2).click();
		driver.findElement(contbtn3).click();
		driver.findElement(cc).click();
		driver.findElement(contbtn4).click();
		driver.findElement(ccname).sendKeys("Barbara Gordon");
		driver.findElement(ccno).sendKeys("4485564059489345");
//		driver.findElement(month).click();
		Select emonth = new Select(driver.findElement(month));
		emonth.selectByValue("4");
//		driver.findElement(monthclick).click();
//		driver.findElement(year).click();
		Select eyear = new Select(driver.findElement(year));
		eyear.selectByValue("2030");
//		driver.findElement(yearclick).click();
		driver.findElement(cvv).sendKeys("123");
		driver.findElement(contbtn5).click();
		Thread.sleep(2000);
		driver.findElement(contbtn6).click();
		
	}
	

	
}

