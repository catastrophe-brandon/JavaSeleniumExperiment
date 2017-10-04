# JavaSeleniumExperiment

Some example code to illustrate how to work with Selenium webdriver automation in Java using Page Object Pattern. This
repo can be used as a reference or a starting point for building your own Selenium automation in Java.

## About this Project

To dodge some of the more cumbersome/tiresome aspects of project setup, I used an archetype to create the base
project. If you'd like to learn more about this archetype take a peek at [this project on github](https://github.com/barancev/webdriver-testng-archetype)

My goal here was to give a practical example of using Selenium, so I've thrown
in some code to stalk Toys R Us in the search for an SNES Classic Edition.

## How to use this code

For local setup you may need to install Selenium Standalone Server via `brew install selenium-server-standalone`.
If you're on Windows, you'll probably need to find a copy of the selenium jar and run it locally.
Also, why are you on Windows?

Depending on the browser under test, you may need to install ChromeDriver or GeckoDriver.
Use your Google foo to track these down and install them.

Run `mvn clean install` and the tests should execute, provided the pre-requisites have met.

Basically:

```
brew install selenium-server-standalone
brew install maven
cd burrito
mvn clean install -Dsite.url="http://toysrus.com"
```
