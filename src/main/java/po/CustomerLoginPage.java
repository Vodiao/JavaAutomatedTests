package po;

import base.BaseMethod;
import org.openqa.selenium.By;

public class CustomerLoginPage extends BaseMethod {

    private final By username = By.xpath("//input[@name='username']");
    private final By password = By.xpath("//input[@name='password']");
    private final By logIn = By.xpath("//input[@value='Log In']");


    public void fillUsername(String text) {
        send(username,text);
    }

    public void fillPassword(String text) {
        send(password,text);
    }

    public void clickLogIn(){
        click(logIn,5);
    }


}
