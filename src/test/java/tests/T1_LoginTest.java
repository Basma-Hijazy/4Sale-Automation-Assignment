package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class T1_LoginTest extends T0_BaseTest{

    LoginPage loginObject;
    List<String> userNames = new ArrayList<>(Arrays.asList("standard_user"));
    // Include these values to userNames arraylist for logging with random user:
    // "locked_out_user", "problem_user", "performance_glitch_user", "error_user", "visual_user"

    public static String getRandomMail(List<String> userNames) {
        Random random = new Random();
        int randomIndex = random.nextInt(userNames.size());
        return userNames.get(randomIndex);
    }
    public String userName = getRandomMail(userNames) , password = "secret_sauce";

    @Test
    public void userLoginWithValidData() throws InterruptedException {
        loginObject = new LoginPage(driver);
        loginObject.loginWithValidData(userName,password);
        Assert.assertTrue(loginObject.isLogoutVisible);
    }

}