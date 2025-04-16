package po;

import base.BaseMethod;
import org.openqa.selenium.By;

public class SearchPage extends BaseMethod {

    private  final By search = By.xpath("//input[@class='cdx-text-input__input']");
    private  final By szukaj = By.xpath("//button[text()='Szukaj']");
    private  final By history = By.xpath("//li[@id='ca-history']");
    private  final By result = By.xpath("//span[@class='mw-page-title-main']");

    public void clickOnTabHistory(){
       click(history,5);
    }

    public void fillText(String text){
        send(search,text);
    }

    public void clickOnTabSzukaj(){
        click(szukaj,10);
    }

    public String getTitle(){
        return getTextFromElement(result);
    }
}
