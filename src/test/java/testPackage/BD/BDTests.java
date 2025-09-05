package testPackage.BD;

import Pages.BD.BDPage;
import org.testng.annotations.Test;
import testPackage.base.BaseTests;

public class BDTests extends BaseTests {

    @Test
    public void navigateToBDPageAndVerifyCreateANewBDSuccessful(){
        new BDPage().navigateToBDPage()
                .assertThatTheTitleIsBD()
                .clickOnNewButton()
                .assertTheUrlCreate()
                .fillNewBDForm()
                .assertTheBDName();
    }

    @Test
    public void navigateToBDPageAndVerifyTheNewBDDeletedSuccessfully(){
        new BDPage().navigateToBDPage()
                .assertThatTheTitleIsBD()
                .deleteTheNewBD()
                .assertTheNewDBDeletedSuccessfully();
    }










}
