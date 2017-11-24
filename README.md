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
* Enter the following variable value in Config.properties file.
* OS,DEVICE_NAME , PLATFORM_NAME,PLATFORM_VERSION ,AUTOMATION_NAME=Appium ,APP_NAME=8b3d8e298.apk ,UDID
* The-Floow/Automation/src/test/resources/config.properties 

Steps to execute this code:
---------------------------
* Create new folder
* Open command prompt (cmd) and go to the folder created in step 1.
* Execute command ::  git clone https://github.com/GeitRavi/The-Floow.git
* Go to The-Floow/Automation folder in command prompt.
* Execute command::  mvn dependency:resolve
* Execute command::  mvn test

Execution:
----------
command to execute/run test cases.
  * mvn test
  * or run TestRunner.java file

