package utils;

import pages.LoginPage;

import java.util.Random;

import static tests.BaseTest.*;
import static utils.Constant.*;

public class Helper {

    /**
     * Random String Generator
     * @param length
     * @return
     */
    public static String generateRandomString(int length) {
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public static void adminLogin() throws Exception {

        //Url Assertion
        String currentUrl = driver.getCurrentUrl();
        Log.debug("Current Url: "+ currentUrl);
        String expectedUrl = configProperties.config.getProperty("BASE_URL");
        Log.info("Expected Url: "+expectedUrl);
        softAssert.assertEquals(currentUrl,expectedUrl);

        //Insert Credentials
        page.getInstance(LoginPage.class).getUsernameField().sendKeys(adminUsername);
        page.getInstance(LoginPage.class).getPasswordField().sendKeys(adminPassword);

        //Click on login Button
        page.getInstance(LoginPage.class).getLoginBtn().click();
        Log.info("Login Button Clicked");

        //Logged in User Info
        String loggedInUserInfo = page.getInstance(LoginPage.class).getLoggedInUsername().getText();
        Log.debug("Actual Logged In Username: "+loggedInUserInfo);

        String adminLoggedInUrl = driver.getCurrentUrl();
        Log.info("Logged In page URL: "+adminLoggedInUrl);

        Log.info("Admin Login Successfully");


        softAssert.assertAll();

    }

    public static void logout(){
        page.getInstance(LoginPage.class).getProfileDropdown().click();
        page.getInstance(LoginPage.class).getLogoutBtn().click();

        //Wait till logout successfully
        page.getInstance(LoginPage.class).getLoginBtn();

        //Logout assertion
        String currentUrl = driver.getCurrentUrl();
        Log.debug("Current Url after Logout: "+currentUrl);
        softAssert.assertEquals(currentUrl,configProperties.config.getProperty("BASE_URL"));
        softAssert.assertAll();

        Log.info("Logout Successfully....");
    }


}
