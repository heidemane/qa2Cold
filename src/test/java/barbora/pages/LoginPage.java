package barbora.pages;

import org.openqa.selenium.By;

public class LoginPage {
    private BaseFunc baseFunc;
    private  By REGISTER = By.xpath(".//a[@aria-controls = 'b-user-register']");

    public LoginPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void getRegisterSection (){
        baseFunc.getElement(REGISTER).click();
    }
}
