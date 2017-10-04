package catastrophe.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(how = How.TAG_NAME, using = "head")
  @CacheLookup
  public WebElement header;

  @FindBy(how = How.ID, using = "searchForm")
  public WebElement searchForm;

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
}
