# Setup

To run this project you will need:

- Android Studio 3.5.3
- Appium 1.15.1 (1.15.1.20191013.2)

## Android Studio
On SDK Manager
- SDK Platform - Android Q 10.0
- SDK Tools
    - Android SDK Build-Tools
    - Android Emulator 29.3.0
    - Android SDK Platform-Tools 29.0.5
    - Android SDK Tools 26.1.1

- Create a virtual device:
    - Pixel 3a 5.6 1080x2220 xxhdpi
    - Android Q 10.0 x86
    - Portrait mode

- Install apk on the virtual device
    - Open a terminal window
    - Go to the Android Studio project folder
    - Run adb install -t `Path to the monefy.apk in this project`

## Appium
Start a session on:

- Host 0.0.0.0
- Port 4724

## IntelliJ
Libraries needed:

- Gradle: junit:junit:4.12
- Gradle: org.hamcrest:hamcrest-core:1.3
- io.appium:java-client:6.1.0
- org.seleniumhq.selenium:selenium-server:2.45.0

# Usage

import the project into IntelliJ IDEA

Update the path to the monefy.apk in the ExpenseManagement.java file

With the virtual device opened in the home screen
In the test folder run the file 'ExpenseManagement.java'

The following scenarios should run:
- Add an expense and check the balance
- Add an income and check the balance
- Delete the expense added

