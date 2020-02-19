package WebTest3;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Computers extends Utils {

    public void ClickOnComputerCategory(){
        // ClickOnElement(_Computer);

    }
    private By _Notebook = By.linkText("Notebooks");
    public void UserClickOnNotebook(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_Notebook);
    }
    // public void VarifyUserIsOnComputerPage(){
    //   driver.get("https://demo.nopcommerce.com/computers");
    // }
    public void SelectDropdownByVisibleText(){
        Select select = new Select(driver.findElement(By.id("products-orderby")));
        select.selectByVisibleText("Price: High to Low");
        //  Select select = new Select(driver.findElement(By.id("products-orderby")));
        // select.selectByVisibleText("Price:High to low");
    }



}
