# asianUserSystem
### I used Java as my programming language.
I used Maven as a build automation tool. Maven has pom.xml file allows me to manage my dependencies/versions easily.
I used Selenium in order to automate my browsers.
I used Page Object Model to simplify managing and maintaing my framework for myself and my team.
This design pattern allows me to locate web elements only once, in their respective classes so that if there are any problems with any web elements, 
I know exactly where to go and how to fix it.
I created Singleton Design Pattern to allow my framework to pass the same instance of my webdriver in one session.
I created a configuration.properties type of file where I keep the important test data about my framework. 
I keep Test data that can change the running flow of the whole framework, such as:browser, username/password, url.
I created utility class from existing java library to read from properties type of file. (ConfigurationReader)
I implemented BDD approach to simplify reading and understanding my framework for the non-technical teammates in my team.
I wrote my test cases as if they are scenarios from the end users perspective in Gherkin language in my feature files.
I implemented the actual coding logic with JAVA-SELENIUM-JUNIT... inside of my step_definitions package and it their own respective/related classes
I triggered my framework from my runner class.
Runner class allows me to run different types of testing suites that I created with my tags.
I had different types of reports. But mainly I use "maven-cucumber-reporting" which is a very detailed reporting tool that has pie-charts, matrixes on which tests are passing and failing.
Hooks class, where I implemented some cucumber annotations such as Before, After, beforestep, afterstep to create outline for my scenarios.
I also implemented a logic where my framework is taking a screenshot and attaching it to my report if a scenario is failing.
