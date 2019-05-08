# ENVIRONMENT CONFIGURATION

##   JDK 8

##   IDE:
	Eclipse or Spring Tool Suite

##   Junit:
	Download junit 4.12 and locate at C:\Users\xxxxx\.m2\repository\junit\junit	

##   Selenium chrome driver:
	Download selenium chrome driver 3.141.5 artifact and locate at C:\Users\xxxxx\.m2\repository\org\seleniumhq\selenium\selenium-chrome-driver

##   Selenium java:
	Download selenium java 3.141.5 artifact and locate at C:\Users\xxxxx\.m2\repository\org\seleniumhq\selenium\selenium-java

##   For web testing
	Download appropriate WebDriver for your browser and locate on D:/drivers
	Chrome http://chromedriver.chromium.org/downloads
	
# TEST DATA
##   BaseTest.java
	Update customer email in addNewCustomer each running time
	
# TEST USER GUIDE
##   Build
	mvn clean verify -DskipTests
	
	
