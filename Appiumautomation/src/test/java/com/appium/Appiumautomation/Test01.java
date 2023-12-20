package com.appium.Appiumautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Test01  {
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M10");
	cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
	
	
	
}
}
