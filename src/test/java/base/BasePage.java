package base;

import org.openqa.selenium.WebDriver;

//Will continue to implement Page Object Model Pattern
public class BasePage {
	protected WebDriver driver;
	/*
	 * To use this driver, need to create Is-A Relationship.
	 * created constructor:
	 * using driver(highlighted) source --> Created constructor using field
	 */

	public BasePage(WebDriver driver) {
		super();
		this.driver = driver; // my driver ( This is the Parent)
	}

	

}
