package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}

/***** build and run the maven application
mvn clean install

java -jar target/MyMavenSeleniumApp01-1.0-SNAPSHOT 

if we get error in executing the above jar file do run the below command 
mvn exec:java -Dexec.mainClass="com.example.App"

//********* it opens saucedemo.com and we can login using the credentials 

we can run directly the java -jar target/MyMavenSeleniumApp01-1.0-SNAPSHOT  if we add the below plugin in pom.xml

<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-shade-plugin</artifactId>
<version>3.3.0</version>
<executions>
<execution>
<phase>package</phase>
<goals>
<goal>shade</goal>
</goals>
</execution>
</executions>
</plugin>
*/
