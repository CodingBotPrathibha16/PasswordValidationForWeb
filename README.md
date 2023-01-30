# PasswordValidationForWeb

# Introduction to the file
This file provides the detailed steps to configure the Framework setup. Following all the steps will ensure that your framework has been configured properly.

# Steps 

1. Install the latest stable JDK. We are using Java 8 (1.8) https://www.oracle.com/uk/java/technologies/javase/javase8-archive-downloads.html
2. Download and install git(if it is not present in the system) from official site 'https://git-scm.com/downloads'.
3. Download and install Chrome browser.
4.Download the Eclipse https://www.eclipse.org/downloads/packages/release/photon/r/eclipse-ide-java-and-dsl-developers

#Environment used:
JDK 1.8
Eclipse 2022.xx
Windows 10 operating system


# JUnit Run 
Launch Eclipse IDE.
Click on Create a Java Project link in the Package Explorer.
Enter the Project name.
Click on the Next> button.
Click on the Finish button.
To add JUnit5 library
Right Click on the Project >> Build Path >> Java Build Path.
Choose Libraries tab >> Add Library…
Select JUnit.
Click on the Next> button.
Choose Library version: JUnit 5
Click on Finish button >> Apply and Close button.
You can verify that the JUnit 5 library got added to your project.


#Acceptance Test
•	Must have a minimum length of 8 characters
•	Must contain at least one number
•	Must contain at least one special character.
•	Passwords must be ASCII characters.( Must contain at least one capital letter and must contain at least one lowercase letter)
•	New and Old password cannot be the same.
•	Must contains no white space.
When the user enters a password and the criteria is not met, the following will happen:
•	Message will appear telling the user that the password entered does not meet the minimum requirements 
•	The message shall describe the minimum requirements
•	The Submit button is disabled.
When the user enters a password and the criteria is met, the following will happen:
•	The Submit button is enabled.
•	The password is stored and used to login in with.
