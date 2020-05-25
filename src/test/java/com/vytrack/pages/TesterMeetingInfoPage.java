package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TesterMeetingInfoPage extends BasePage{

    @FindBy(xpath = "//h1[contains(text(),'Testers meeting')]")
    public WebElement testerMeetingInfo;


}
