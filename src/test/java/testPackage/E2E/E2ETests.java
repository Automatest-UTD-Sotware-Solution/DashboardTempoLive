package testPackage.E2E;

import Pages.BD.BDPage;
import Pages.HostsAgencies.HostsAgenciesPage;
import org.testng.annotations.Test;
import testPackage.base.BaseTests;

public class E2ETests extends BaseTests {

    @Test
    public void e2eScenario_1(){
        new BDPage().navigateToBDPage()
                .assertThatTheTitleIsBD()
                .clickOnNewButton()
                .assertTheUrlCreate()
                .fillNewBDForm()
                .assertTheBDName();

        new HostsAgenciesPage().navigateToHostsAgenciesPage()
                .assertThatTheTitleIsHostsAgencies()
                .clickOnNewAgencyButton()
                .fillNewAgencyFormWithoutBD()
                .assertTheNewAgencyCreatedSuccessfully();

        new HostsAgenciesPage().navigateToHostsAgenciesPage()
                .assertThatTheTitleIsHostsAgencies()
                .deleteTheCreatedAgency()
                .assertTheAgencyDeletedSuccessful();

    }

    @Test
    public void e2eScenario_2(){

        new HostsAgenciesPage().navigateToHostsAgenciesPage()
                .assertThatTheTitleIsHostsAgencies()
                .clickOnNewAgencyButton()
                .fillNewAgencyFormWithoutBD()
                .assertTheNewAgencyCreatedSuccessfully();

        new HostsAgenciesPage().navigateToHostsAgenciesPage()
                .assertThatTheTitleIsHostsAgencies()
                .deleteTheCreatedAgency()
                .assertTheAgencyDeletedSuccessful();

    }


}
