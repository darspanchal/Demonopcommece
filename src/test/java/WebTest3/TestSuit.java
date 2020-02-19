package WebTest3;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    DigitalDownload digitalDownloads = new DigitalDownload();
    ProductComparision productComparision = new ProductComparision();


    Computers computers = new Computers();
 //   EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    Categories catagories = new Categories();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Test
    public void userShouldAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //fill up registration details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        //verify registrations success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    @Test
    public void userShouldAbleToCompareTwoProducts() {
        // Click on register button
        homePage.clickOnDigitalDownloads();
        // digitalDownloads.verifyUserIsOnDigitalDownloadsPage();
        digitalDownloads.chooseProductsToCompare();
        // Method will compare Two product
        ProductComparision.verifyUserOnProductComparisonPage();
    }


    @Test
    public void RegisteredUserShouldBeAbleToReferAFriendSuccessfully(){
        // Click on digital download
        homePage.clickOnDigitalDownloads();

        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        homePage.ClickOnComputerCatagory();
        catagories.verifyUserOnComputerCategoriesPage();
        catagories.userClickOnNoteBook();
        catagories.userClickOnAppleMac();
        catagories.userReferToFriend();

    }

    @Test
    public void nonRegisterUserShouldNotBeAbleToReferAProductToAFriend(){
        homePage.ClickOnComputerCatagory();
        productDetailsPage.VerifyUserIsOnComputerCatagoryPage();
        productDetailsPage.userClickOnNoteBook();
        productDetailsPage.userClickOnAppleMac();
        productDetailsPage.UserReferToFriend();
    }
    @Test
    public void UserShouldBeAbleToSortProductHighToLowByPrice(){
        homePage.ClickOnComputerCatagory();
        computers.UserClickOnNotebook();
        computers.SelectDropdownByVisibleText();

    }

}


