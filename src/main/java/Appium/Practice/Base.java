package Appium.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	static AndroidDriver<AndroidElement> driver;
	 Properties prop;
	public static AndroidDriver<AndroidElement> cap(String Appname) throws IOException {
		
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resorces\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		File appdir=new File("src");
		File apploc=new File(appdir, (String) prop.get(Appname));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Siraj");
		 capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10);
		 capabilities.setCapability(MobileCapabilityType.APP, apploc.getAbsolutePath());
		driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		 return driver;
	}
}
