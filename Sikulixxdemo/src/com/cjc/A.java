package com.cjc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class A {
	
public static void main(String[] args) throws FindFailed {
	

	
	System.setProperty("webdriver.chrome.driver","F:\\Chrome1\\chromedriver.exe");
	Screen screen=new Screen();
	WebDriver driver=new ChromeDriver();
	Pattern p1=new Pattern("F:\\Fill\\Sikulixphoto\\email.PNG");
	Pattern p2=new Pattern("F:\\Fill\\Sikulixphoto\\pass1.PNG");
	Pattern p3=new Pattern("F:\\Fill\\Sikulixphoto\\login.PNG");
      
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	screen.type(p1, "ankit@gmail.com");
     screen.type(p2,"9860525067");
	screen.click(p3);
	

	}
}
