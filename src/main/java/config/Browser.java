package config;

public enum Browser {
	CHROME("chrome"), FIREFOX("firefox"), IE("ie");

	private final String browser;

	public String getBrowser() {
		return browser;
	}

	private Browser(String browser) {
		this.browser = browser;
	}
}
