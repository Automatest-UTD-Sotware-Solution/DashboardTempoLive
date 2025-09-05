package Pages.HostsAgencies;

import Pages.base.BasePages;
import org.openqa.selenium.By;

public class HostsAgenciesPage extends BasePages {

    // TODO:: Open Hosts Agencies Page
    By AgencySystemButton = By.xpath("//span[text()='Agency System']");
    By HostsAgenciesButton = By.xpath("//span[text()='Host Agencies']");
    By AgenciesButton = By.xpath("//span[text()='Agencies']");
    By newAgencyButton = By.xpath("//a[@title=\"New\"]");

    // TODO:: Fill New Agency Form Without BD
    By appOwnerIdDropDown = By.xpath("//select[@name='app_owner_id']/following-sibling::span");
    By searchAppOwnerIdField = By.xpath("//input[@type='search']");
    By appOwnerIdResult = By.xpath("//*[@role=\"tree\"]/li[text()='Youssef Tester - 4218445']");
    By agencyNameField = By.id("name");
    By statusButton = By.xpath("//div[@class='bootstrap-switch-container']");
    By agencyWhatsAppNumberField = By.id("phone-input");
    By submitButton = By.xpath("(//button[@type='submit'])[1]");

    // TODO:: Assert The New Agency Created Successfully
    By NewAgencyName = By.xpath("//span[text()='Hosts Agency For SDET']");

    // TODO:: Delete The Hosts Agency
    By actionsButton = By.xpath("(//i[@class=\"fa fa-ellipsis-v\"])[1]");
    By deleteButton = By.xpath("(//a[text()=\"Delete\"])[1]");
    // TODO:: Confirm Dialog Delete The Created Agency
    By submitButtonDialog = By.xpath("//div[@class=\"swal2-actions\"]/button[1]");
    By successMessageDialog = By.id("swal2-title");

    public HostsAgenciesPage navigateToHostsAgenciesPage() {
        driverEngine().element().click(AgencySystemButton).click(HostsAgenciesButton).click(AgenciesButton);
        return this;
    }

    public HostsAgenciesPage assertThatTheTitleIsHostsAgencies() {
        driverEngine().browser().assertThat().title().isEqualTo("Admin | Agencies");
        return this;
    }

    public HostsAgenciesPage clickOnNewAgencyButton() {
        driverEngine().element().click(newAgencyButton);
        return this;
    }

    public HostsAgenciesPage fillNewAgencyFormWithoutBD() {
        driverEngine().element().click(appOwnerIdDropDown)
                .type(searchAppOwnerIdField, "4218445")
                .click(appOwnerIdResult)
                .type(agencyNameField, "Hosts Agency For SDET")
                .click(statusButton)
                .type(agencyWhatsAppNumberField, "1068772266")
                .click(submitButton);

        return this;
    }

    public HostsAgenciesPage assertTheNewAgencyCreatedSuccessfully() {
        driverEngine().element().assertThat(NewAgencyName).text().isEqualTo("Hosts Agency For SDET");
        return this;
    }

    public HostsAgenciesPage deleteTheCreatedAgency() {
        driverEngine().element().hover(actionsButton).click(actionsButton)
                .click(deleteButton);
        return this;
    }

    public HostsAgenciesPage assertTheAgencyDeletedSuccessful() {
        driverEngine().element().click(submitButtonDialog)
                .assertThat(successMessageDialog).text().isEqualTo("Successful");
        return this;
    }



}
