# Spring Boot + GitHub Actions Demo 🚀

This is a **test repository** for experimenting with **Spring Boot** and **GitHub Actions** integration. The primary goal of this project is to set up and test a CI/CD pipeline using GitHub Actions to automate code linting with Checkstyle.

## 📋 Project Details

- **Framework:** [Spring Boot](https://spring.io/projects/spring-boot)
- **Language:** Java (JDK 21)
- **Build Tool:** Maven
- **Purpose:** Testing CI/CD with GitHub Actions

## ⚙️ Features

1. **Spring Boot Application:**
    - A basic Spring Boot application for demonstration purposes.
2. **GitHub Actions Integration:**
    - Automates the linting process with Checkstyle on every `push` and `pull request` to the `main` branch.
3. **Linting with Checkstyle:**
    - Ensures code quality by checking for coding standard violations.

## 🚀 GitHub Actions Workflow

The repository includes a GitHub Actions workflow that:
- **Triggers on:**
    - Push events to the `main` branch.
    - Pull requests targeting the `main` branch.
- **Runs:**
    - Maven commands to check for code quality using Checkstyle.

### Workflow Configuration

Check the `.github/workflows/checkstyle.yml` file for the workflow configuration.

### Maven Commands Used

- **Run Checkstyle locally:**
  ```bash
  mvn checkstyle:check -P checkstyle
