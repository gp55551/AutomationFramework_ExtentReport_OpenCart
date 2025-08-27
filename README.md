# Selenium TestNG Project with jenkins

This is a demo project for Selenium Page Object Model with Extent reporting ans Jenkins setup.

### Pre-requisites
* Java
* Maven
* IntelliJ IDEA
* Extent reoport libraries

### Steps
1. Clone this project
2. Open the project in Intellij IDEA
3. Add Chaintest library, properties file, annotations in tests.
4. Run through maven with command -> clean test -DXmlFile=TestNG.xml
5. Find results in report/Index.html

### Jenkins Steps - 
1. Start server - java -jar C:\Users\rajde\Downloads\jenkins.war.
2. navigate - http://localhost:8080, Setup credentials.
3. add Maven and Java home path in Mangae Jenkins.
4. create item + add git url = add build actions steps.
5. Build job.
6. Check console.
   
### Report -

<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/1fb86006-60c3-4dbe-a90d-c233563ace26" />

