package com.vytrack.tests;


import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.TesterMeetingInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginStoreManager extends TestBase {

    /*

    Test case #1 1.Go to “https://qa1.vytrack.com/"
    2.Login as a store manager
    3.Navigate to “Activities -> Calendar Events”
    4.Verify that page subtitle "Options" is displayed
     */

    @Test
    public void optionDisplayed(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();


        calendarEventsPage.navigateToModule("Activities","Calendar Events");
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        System.out.println(calendarEventsPage.PageSubTitle.getText());
        Assert.assertTrue(calendarEventsPage.PageSubTitle.isDisplayed(),"Verify Options is displayed");

    }
    /*
    Test case #2 1.Go to “https://qa1.vytrack.com/"
    2.Login as a store manager
    3.Navigate to “Activities -> Calendar Events”
    4.Verify that page number is equals to "1"
     */

    @Test
    public void pageNumberEquals1() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.navigateToModule("Activities", "Calendar Events");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        Assert.assertEquals(calendarEventsPage.Page.getAttribute("value"),"1","Verify that page number is equals to 1");

    }

    /*
    Test case #3 1.Go to “https://qa1.vytrack.com/"
    2.Login as a store manager
    3.Navigate to “Activities -> Calendar Events”
    4.Verify that view per page number is equals to "25"
     */
    @Test
    public void pageNumberEquals25(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.navigateToModule("Activities","Calendar Events");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        Assert.assertEquals(calendarEventsPage.viewPerPage.getText(),"25","Verify that page number is equals to 1");



    }

    /*
    Test case #4 1.Go to “https://qa1.vytrack.com/"
    2.Login as a store manager
    3.Navigate to “Activities -> Calendar Events”
    4.Verify that number of calendar events (rows in the table) is equals to number of recordsHint:
     In HTML, <table> tag represents table, <thread> - table header,
      <tr> tag represents table row element, <th> table header cell and <td> table data.
     */
    @Test
    public void NumberOfCalendarEventsEqualsNumOfRecords(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.navigateToModule("Activities","Calendar Events");
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        Assert.assertEquals(calendarEventsPage.numberOfRecords.getText(),"1562","Verify that page number is equals to 1");



    }
    /*
    Test Case #5 1.Go to “https://qa1.vytrack.com/"
    2.Login as a store manager
    3.Navigate to “Activities -> Calendar Events”
    4.Click on the top checkbox to select all
    5.Verify that all calendar events were selected
     */
    @Test
    public void calendarEventsAllSelected(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.navigateToModule("Activities","Calendar Events");
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.allSelected.click();

        Assert.assertTrue(calendarEventsPage.allSelected.isSelected(),"Verify checkbox is all selected");


    }
    @Test
    /*
    Test Case #6 1.Go to “https://qa1.vytrack.com/"
    2.Login as a store manager
    3.Navigate to “Activities -> Calendar Events”
    4.Select “Testers meeting”5.Verify that following data is displayed:
     */
    public void dataIsDisplayed(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

        calendarEventsPage.navigateToModule("Activities","Calendar Events");
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        calendarEventsPage.selectTestersMeeting.click();
        calendarEventsPage.testerMeeting.click();
        TesterMeetingInfoPage testerMeetingInfoPage = new TesterMeetingInfoPage();
        calendarEventsPage.waitUntilLoaderScreenDisappear();

        Assert.assertEquals(testerMeetingInfoPage.testerMeetingInfo.getText(),"Testers meeting","Verify that Testers meeting data is displayed");

    }


}
