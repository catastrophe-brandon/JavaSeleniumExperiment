# JavaSeleniumExperiment

Some example code to illustrate how to work with Selenium automation in Java using Page Object Pattern.

## How to use this code

For local setup you may need to install Selenium Standalone Server via `brew install selenium-server-standalone`. If you're on Windows, you'll probably need to find a copy of the selenium jar and run it locally. Why are you on Windows?

Depending on the browser under test, you may need to install ChromeDriver or GeckoDriver. Use your Google foo to track these down and install them.

Run `mvn clean install` and the tests should execute, provided the pre-requisites have met.
