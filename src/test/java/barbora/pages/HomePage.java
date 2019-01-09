package barbora.pages;

import org.openqa.selenium.By;

public class HomePage {
    private BaseFunc baseFunc;
    private  By ADD_TO = By.xpath(".//button[@aria-label = 'Pievienot']");
    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;

    }

    public void addToCartById(int id){
        baseFunc.getElements(ADD_TO).get(id).click();
    }
}
