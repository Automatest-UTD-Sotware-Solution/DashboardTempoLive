package Pages.BD;

import Pages.base.BasePages;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class BDPage extends BasePages {

    // TODO:: Locators Open BD Page
    By AgencySystemButton = By.xpath("(//i[@class='fa fa-angle-left pull-right'])[12]");
    By agencyManagerButton = By.xpath("(//i[@class='fa fa-angle-left pull-right'])[17]");
    By bdButton = By.xpath("(//i[@class='fa fa-bars'])[48]");
    By newButton = By.xpath("//a[@title='New']");

    // TODO:: Locators Fill New BD Form
    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By selectImageField = By.xpath("//input[@class=\"file-caption-name\"]");
    By browserButton = By.xpath("//input[@type=\"file\"]");
    By selectUserDropDown = By.xpath("//span[text()=\"Select User\"]");
    By searchUserField = By.xpath("//input[@class=\"select2-search__field\"]");
    By searchResultField = By.xpath("//li[text()=\"Joo - 7417880\"]");
    By submitButton = By.xpath("//button[text()=\"Submit\"]");

    // TODO:: Locators Name BDNew
    By bdName = By.xpath("//span[text()=\"SDET\"]");

    // TODO:: Locators Delete TheNewBD
    By actionsButton = By.xpath("(//span[text()='SDET']/ancestor::tr//a)[3]");
    By deleteButton = By.xpath("(//tbody/tr//li/a)[3]");
    By submitDialogButton = By.xpath("//div[@class='swal2-actions']//button[text()='Submit']");
    By successMessageDialog= By.id("swal2-title");


    public BDPage navigateToBDPage() {
        driverEngine().element().click(AgencySystemButton).
                click(agencyManagerButton)
                .click(bdButton);
        return this;
    }

    public BDPage assertThatTheTitleIsBD() {
        driverEngine().browser().assertThat().title().isEqualTo("Admin | BD");
        return this;
    }

    public BDPage clickOnNewButton() {
        driverEngine().element().click(newButton);
        return this;
    }

    public BDPage assertTheUrlCreate() {
        driverEngine().browser().assertThat().url().contains("create");
        return this;
    }

    public BDPage fillNewBDForm() {
        driverEngine().element()
                .type(userNameField, "SDET")
                .type(passwordField, "SDET")
                .click(selectImageField)
//                .typeFileLocationForUpload(selectImageField, "src/test/resources/testDataFiles/download.jpg")
                .click(selectUserDropDown)
                .type(searchUserField, "7417880")
                .click(searchResultField)
                .click(submitButton);
        return this;
    }

    public BDPage assertTheBDName(){
        driverEngine().element().assertThat(bdName).text().isEqualTo("SDET");
        return this;
    }

    public BDPage deleteTheNewBD(){
        driverEngine().element().click(actionsButton).click(deleteButton).click(submitDialogButton);
        return this;
    }
    public BDPage assertTheNewDBDeletedSuccessfully(){
        driverEngine().element().assertThat(successMessageDialog).text().contains("BD deleted successfully.");
        return this;
    }
}
