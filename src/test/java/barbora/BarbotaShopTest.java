package barbora;

import barbora.pages.*;
import org.junit.jupiter.api.Test;

public class BarbotaShopTest {
    private String HOME_PAGE = "https://www.barbora.lv/";
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void barboraTest() {
        baseFunc.openPage(HOME_PAGE);
        HomePage homePage = new HomePage(baseFunc);
        homePage.addToCartById(1);
        LoginPage loginPage = new LoginPage(baseFunc);
        loginPage.getRegisterSection();
        RegisterPage registerPage = new RegisterPage(baseFunc);
        registerPage.fillInEmail("test@test.lv");
    }
}
