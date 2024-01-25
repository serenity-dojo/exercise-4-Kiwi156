# BDD Exercise with Cucumber and Java

In this exercise we use gherkin scenarios with concise examples to describe the business rules and the scenario outlines. The scenarios contain concreate outcomes that can be checked automatically. They can be found under the test then features location. 

Within the test location there are also Step Definitions Classes, Actions Classes and Cucumber Test suite Classes. The Step Definitions, have the Java code that run the scenarios and checks the outcomes. The Actions have the Java code for the different Actions Classes for the different components for example LoginActions or CartActions. There is a Cucumber Test suite Class for executing the tests. 

The web application for this exercise was a test site https://www.saucedemo.com/. On the test website items can be purchased using a shopping cart and user credentials need to be used to log on.   

# Goal 

The goal of the exercise was to create an executable specification by implementing the Java code for the gherkin scenarios within the following features.

![image](https://github.com/serenity-dojo/exercise-4-Kiwi156/assets/73317499/be4d7e8e-b26b-417b-9a93-ad269fb21142)


# Techniques Learned

When running the tests to Implement BDD Scenarios I encountered a "net.thucydides.core.webdriver.DriverConfigurationError: Could not instantiate class org.openqa.selenium.chrome.ChromeDriver" error message. The Serenity version needed to be updated in the Pom.xml. Here are the related configuration changes I made to resolve this error message. https://github.com/serenity-dojo/exercise-4-Kiwi156/commit/2dd1672eb4b3e3d1d6af46a465e76c10192f0d6b.

When working on this exercise I learnt to run Cucumber tests from the Cucumber Test Suite Class or command line to see the details of the test results rather than the feature file. 

I also learnt to "Ctrl + Click" with a cursor over a Class or method etc. to jump to the relevant details. "Ctrl + Click" is not just for navigating from feature files to the related step definitions I can also use it to locate all the references of when an item is used in the Java code.

At one point I got stuck getting my code to find a web element on a page. I learnt to put a break point on the code right before the failing step to check what the browser displays. With the help of a Coach from the Serenity Dojo we found that a random "@pending" comment in a feature file was the cause the problem. I removed the "@pending" from the feature file and the code was able to find the web element on the page.  

