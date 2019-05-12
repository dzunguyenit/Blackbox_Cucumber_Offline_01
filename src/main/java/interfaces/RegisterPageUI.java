package interfaces;

public class RegisterPageUI {
	public static final String USER_ID_TEXT = "//*[contains(text(),'User ID :')]/following-sibling::td";
	public static final String PASSWORD_ID_TEXT = "//*[contains(text(),'Password :')]/following-sibling::td";
	public static final String EMAIL_REGISTER_TXT = "//input[@name='emailid']";
	public static final String SUBMIT_BTN = "//*[@name='btnLogin']";
}
