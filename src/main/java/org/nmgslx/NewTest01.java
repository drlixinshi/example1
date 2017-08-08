package org.nmgslx;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest01 {
  private WebDriver driver;
  
  @Test
  public void verify01() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.google.com");
	  String search_text = "Google Search";
      WebElement search_button = driver.findElement(By.name("btnK"));
      String text = search_button.getAttribute("value");
      Assert.assertEquals(text, search_text, "Text not found!");
      driver.quit();
  }

  @Test
  public void verify02() {
      Assert.assertEquals("text", "text", "Text not found!");
  }
  
  @BeforeClass
  public void beforeClass() {
	  //driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
