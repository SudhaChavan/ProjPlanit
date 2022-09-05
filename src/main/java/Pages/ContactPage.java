package Pages;

public class ContactPage {
	
	

	
	public static String contact="//a[@href=\"#/contact\"]";
	//a[@href="#/contact"]
	
	public static String foreNameText="//input[@id=\"forename\"]";
	public static String surnameText="//input[@id=\"surname\"]";
	public static String emailText="//input[@id=\"email\"]";
	public static String telephoneText="//input[@id=\"telephone\"]";
	public static String messageText="//textarea[@id=\"message\"]";
	public static String submitButton="//a[@class=\"btn-contact btn btn-primary\"]";
	
	
	public static String emailError= "//span[@id=\"email-err\"]";
	public static String messageError ="//span[@id=\"message-err\"]";
	public static String forenameError="//span[@id=\"forename-err\"]";
	public static String successMsg= "//div[@class=\"alert alert-success\"]";
}
