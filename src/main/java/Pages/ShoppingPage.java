package Pages;

public class ShoppingPage {
	public static String shop="//a[@href=\"#/shop\"]";
	public static String cart="//a[@href=\"#/cart\"]";
	
	
	public static String toyType= "//h4[@class=\"product-title ng-binding\"]";
	public static String  buyOption= "(//*[@class=\"btn btn-success\"])";
	
	public static String toySelected="(//*[@class=\"cart-item ng-scope\"]/td/img)";
	public static String priceOfEachToySelected= "(//*[@class=\"cart-item ng-scope\"]/td[2])";
	public static String quantityOfToySelected= "//*[@class=\"cart-item ng-scope\"]/td[3]/input";
	public static String subTotalPriceToySelected="//*[@class=\"cart-item ng-scope\"]/td[4]";	
	public static String totalPrice="//*[@class=\"total ng-binding\"]";

}
