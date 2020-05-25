package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventsPage extends BasePage {


    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//div[contains(text(),'Options')]")
    public WebElement PageSubTitle;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement Page;

    @FindBy(xpath = "//button[contains(text(),'25')]")
    public WebElement viewPerPage;

    @FindBy(xpath = "//label[contains(text(),'Total of 1562 records')]")
    public WebElement numberOfRecords;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement allSelected;

    @FindBy(xpath = "//input[@tabindex='-1']")
    public WebElement selectTestersMeeting;


    @FindBy(xpath = "//td[contains(text(),'Testers meeting')]")
    public WebElement testerMeeting;


}

