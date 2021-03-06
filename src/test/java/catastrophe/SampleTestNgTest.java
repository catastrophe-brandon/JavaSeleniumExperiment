package catastrophe;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import catastrophe.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    Assert.assertTrue("".equals(homepage.header.getText()));
  }

  @Test
  public void testHomePagHasSearchForm() {
    driver.get(baseUrl);
    Assert.assertTrue(homepage.searchForm !=null);
  }

  @Test
  public void testHomePageHasSearchText() {
    driver.get(baseUrl);
    Assert.assertTrue(homepage.searchText != null);
  }

  @Test
  public void testSearchTextTyping() {
    driver.get(baseUrl);
    homepage.searchText.sendKeys("SNES Classic Edition");
    Assert.assertTrue(homepage.searchText.getAttribute("value").equals("SNES Classic Edition"));
  }
}
