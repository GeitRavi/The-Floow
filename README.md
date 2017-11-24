# The-Floow

# Appium + Web driver + Page Object Model + Cucumber. 
# Automation Test Cases

Pre-requisite:
-------------
 * Java 8 JDK
 * Maven 
 * Git
 * Android SDK
 * NodeJS
 * Appium Server
 * Appication file .apk 
 * Real Device or Emulator
 
 Set-up:
---------
* Install java JDK and set up JAVA PATH
* Install android SDK and set up ANDROID PATH
* Install Nodejs and Appium 
* Install Appium Desktop client
* Enable developer mode on Android phone
* Install Application on Android phone
* Install Eclipse IDE and set up maven project
* Download Appium java client jar & selenium web driver & Cucumber & Junit jar file.
 
Configuration:
-------------
Enter the following variable value in Config.properties file.
OS,DEVICE_NAME , PLATFORM_NAME,PLATFORM_VERSION ,AUTOMATION_NAME=Appium ,APP_NAME=8b3d8e298.apk ,UDID
The-Floow/Automation/src/test/resources/config.properties 

Execution:
----------
command to execute/run test cases.
  * mvn test
  * or run TestRunner.java file

