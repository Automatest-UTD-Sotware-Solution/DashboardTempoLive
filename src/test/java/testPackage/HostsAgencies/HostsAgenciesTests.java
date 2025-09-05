package testPackage.HostsAgencies;

import Pages.HostsAgencies.HostsAgenciesPage;
import org.testng.annotations.Test;
import testPackage.base.BaseTests;

public class HostsAgenciesTests extends BaseTests {

    @Test
    public void navigateToHostsAgencyPageAndVerifyCreatedANewAgencyWithoutBD(){
        new HostsAgenciesPage().navigateToHostsAgenciesPage()
                .assertThatTheTitleIsHostsAgencies()
                .clickOnNewAgencyButton()
                .fillNewAgencyFormWithoutBD()
                .assertTheNewAgencyCreatedSuccessfully();
    }

    @Test
    public void navigateToHostsAgencyPageAndVerifyDeletedTheAgencySuccessful(){
        new HostsAgenciesPage()
                .navigateToHostsAgenciesPage()
                .assertThatTheTitleIsHostsAgencies()
                .deleteTheCreatedAgency()
                .assertTheAgencyDeletedSuccessful();
    }
}
