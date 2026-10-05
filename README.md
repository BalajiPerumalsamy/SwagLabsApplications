# Swag Labs Test Automation Framework

An end-to-end UI test automation framework for the [Swag Labs demo application](https://www.saucedemo.com/), built with **Java**, **Selenium WebDriver**, **TestNG** and **Maven**, following the **Page Object Model (POM)** design pattern.

---

## Table of Contents

- [Tech Stack](#tech-stack)
- [Features](#features)
- [Modules Covered](#modules-covered)
- [Test Coverage](#test-coverage)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup & Execution](#setup--execution)
- [Reports](#reports)
- [Author](#author)

---

## Tech Stack

| Area | Tool / Library | Version |
|---|---|---|
| Language | Java | 17 |
| Build Tool | Maven | 3.x |
| Automation | Selenium WebDriver | 4.22.0 |
| Test Framework | TestNG | 7.9.0 |
| Data-Driven Testing | Apache POI (Excel) | 5.4.1 |
| Reporting | Extent Reports | 5.1.1 |
| Logging | SLF4J Simple | 2.0.9 |
| Browser | Google Chrome | Latest |

---

## Features

- Page Object Model (separate page classes and test classes)
- `BaseClass` for common browser setup and teardown
- Positive and negative test scenarios
- Data-driven testing using Excel (Apache POI)
- TestNG Listeners for test execution events
- Screenshots captured during execution
- Extent HTML reports for detailed results
- Reusable and maintainable code structure

---

## Modules Covered

| Page Class | Description |
|---|---|
| `LoginClass` | Login to the application |
| `ProductAddToCartClass` | Add products to the cart |
| `LogoutClass` | Logout from the application |

---

## Test Coverage

### Positive Tests

| Test Class | Scenario |
|---|---|
| `LoginPageTest` | Login with valid credentials |
| `ProductAddToCartPageTest` | Add a product to the cart |
| `LogoutPageTest` | Logout successfully |

### Negative Tests

| Test Class | Scenario |
|---|---|
| `InvalidLoginPageTest` | Login with invalid credentials |

---

## Project Structure

```
SwagLabsApplications
├── screenshots                         # Screenshots captured during execution
├── src
│   ├── main
│   │   ├── java/com
│   │   │   ├── BasePage
│   │   │   │   └── BaseClass.java      # Browser setup and teardown
│   │   │   ├── swagLabsPages           # Page Object classes
│   │   │   │   ├── LoginClass.java
│   │   │   │   ├── LogoutClass.java
│   │   │   │   └── ProductAddToCartClass.java
│   │   │   └── utils
│   │   │       └── ExcelUtils.java     # Excel read/write helper
│   │   └── resources
│   │       └── Input_Data              # Excel test data
│   └── test/java/com
│       ├── Listeners
│       │   └── MyListener.java         # TestNG listener
│       ├── negativeTests
│       │   └── InvalidLoginPageTest.java
│       ├── positiveTests
│       │   ├── LoginPageTest.java
│       │   ├── LogoutPageTest.java
│       │   └── ProductAddToCartPageTest.java
│       └── reports
│           └── ReportManager.java      # Extent report setup
├── ExtentReport.html                   # Generated execution report
├── Testng.xml                          # TestNG suite file
├── pom.xml
├── .gitignore
└── README.md
```

---

## Prerequisites

- JDK 17 or higher
- Maven 3.x
- Google Chrome (latest). Selenium 4.22 manages the ChromeDriver automatically via Selenium Manager
- An IDE such as IntelliJ IDEA or Eclipse

---

## Setup & Execution

1. **Clone the repository**
   ```bash
   git clone https://github.com/BalajiPerumalsamy/SwagLabsApplications.git
   cd SwagLabsApplications
   ```

2. **Install dependencies**
   ```bash
   mvn clean install -DskipTests
   ```

3. **Run the tests**
   - From the IDE: right-click `Testng.xml` and choose **Run as TestNG Suite**.
   - From the command line:
     ```bash
     mvn test
     ```
     This runs the suite defined in `Testng.xml` through the Maven Surefire plugin.

---

## Reports

- After execution, the Extent HTML report is generated as `ExtentReport.html` in the project root. Open it in any browser to view pass/fail status and details for each test.
- Screenshots are saved in the `screenshots` folder.

---

## Author

- **Name:** Balaji Perumalsamy
- **Role:** QA Engineer (Fresher)
- **GitHub:** [BalajiPerumalsamy](https://github.com/BalajiPerumalsamy)
