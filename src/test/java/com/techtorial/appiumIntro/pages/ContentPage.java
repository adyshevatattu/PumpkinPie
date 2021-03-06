package com.techtorial.appiumIntro.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ContentPage {

    public ContentPage( AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        // "this"-> means instance of the class
    }

    @AndroidFindBy(accessibility = ("Assets"))
    public AndroidElement assets ;

     @AndroidFindBy(accessibility =("Clipboard"))
    public AndroidElement clipboard ;

     @AndroidFindBy(accessibility=("packages"))
    public AndroidElement packages;

    @AndroidFindBy(accessibility=("Resources"))
    public AndroidElement resources;


    @AndroidFindBy(accessibility=("Storage"))
    public AndroidElement storage;

    @AndroidFindBy(accessibility=("Provider"))
    public AndroidElement provider;
}
