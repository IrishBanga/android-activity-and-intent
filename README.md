# Android Registration App

## Overview

This repository contains the source code for an Android application that implements a user registration flow. The app guides users through registration, validates input, and navigates between screens for registration, confirmation, and completion. It includes all necessary Android project files, Gradle configuration, source code for activities, resource files, and IDE setup.

## Features

- **Registration Flow:**  
  Users can enter their details in the Registration screen. Input validation ensures data integrity before proceeding.

- **Navigation:**  
  The app transitions between `MainActivity`, `RegistrationActivity`, and `ThankYouActivity` to guide users through the registration process.

- **Resource Management:**  
  Utilizes Android resource files for layouts, images, and strings to provide a responsive and localized user interface.

## Tech Stack

- **Language:** Kotlin
- **Build System:** Gradle (Kotlin DSL)
- **Android SDK:** Targeted for modern Android devices
- **Testing:** JUnit (unit tests), Android Instrumentation (UI tests)
- **Proguard:** Used for code obfuscation and optimization
- **Version Control:** Git

### Key Components

- **Main Application (`src/main/java/`)**  
  Contains the core logic, including `MainActivity`, `RegistrationActivity`, and `ThankYouActivity`.

- **Resources (`src/main/res/`)**  
  Includes layouts, images, strings, colors, and other UI assets.

- **Manifest (`src/main/AndroidManifest.xml`)**  
  Declares app components, permissions, and configuration.

- **Gradle Build Scripts (`build.gradle.kts`)**  
  Manages dependencies, build variants, and project configuration.

- **Proguard Rules (`proguard-rules.pro`)**  
  Ensures code security and optimizes release builds.

## Build & Run

The project is designed to be opened and run directly in IntelliJ IDEA or Android Studio. All dependencies and configurations are managed via Gradle.
