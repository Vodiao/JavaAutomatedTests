package ParaBank;
import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import po.CustomerLoginPage;


public class CustomerLoginTest extends BaseTest {

    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    @BeforeMethod
    public void open(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
        driver.manage().window().maximize();
    }

    @Test
    void  customerShouldBeLogin(){
      customerLoginPage.fillUsername("vodiao");
      customerLoginPage.fillPassword("V51090!");
      customerLoginPage.clickLogIn();
    }
}
