package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {


    @Test
    public void loginAsDriver() {

        //name of the test
        extentLogger = report.createTest("login as Driver");
        LoginPage loginPage = new LoginPage();

        extentLogger.info("Enter username: User10");
        String username = ConfigurationReader.get("driver_username");
        extentLogger.info("Enter password: UserUser123");
        String password = ConfigurationReader.get("driver_password");
        extentLogger.info("click login button");
        loginPage.login(username, password);
        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/", "verify we successfuly login");
        extentLogger.pass("driver test passed");
    }

    @Test
    public void loginAsStoreManager() {
        extentLogger = report.createTest("login store manager");
        LoginPage loginPage = new LoginPage();

        extentLogger.info("Enter username: storemanager57");
        String username = ConfigurationReader.get("storemanager_username");
        extentLogger.info("Enter password: UserUser123");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("click login button");
        loginPage.login(username, password);
        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/", "verify we successfuly login");
        extentLogger.pass("store manager test passed");

    }

}