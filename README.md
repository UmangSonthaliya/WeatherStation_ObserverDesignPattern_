
# Weather Station Observer Design Pattern

This project demonstrates the **Observer Design Pattern** using a **Weather Station** example. In this example, the Weather Station gathers weather data (temperature, humidity, and pressure) and notifies multiple display devices when new weather updates are available.

## Table of Contents
- [Overview](#overview)
- [Design Pattern](#design-pattern)
- [Project Structure](#project-structure)
- [Classes](#classes)
- [Getting Started](#getting-started)
- [Usage Example](#usage-example)
- [Dependencies](#dependencies)
- [License](#license)

## Overview

The **Weather Station** project simulates a system where multiple display devices (observers) subscribe to weather updates from a central Weather Station (subject). Whenever the weather data changes, all subscribed display devices are automatically notified and updated.

## Design Pattern

The **Observer Design Pattern** is a behavioral design pattern in which a **subject** (the Weather Station) maintains a list of **observers** (display devices) that are notified whenever the subject's state changes. This pattern is commonly used in event handling systems and allows for loose coupling between components.

## Project Structure

- `Observer` Interface: Declares the `update` method, which is called by the subject to notify observers of changes.
- `Subject` Interface: Declares methods for adding, removing, and notifying observers.
- `WeatherStation` Class: The concrete subject that holds the weather data. When the data changes, it notifies all observers.
- `CurrentConditionsDisplay` Class: A concrete observer that displays the current weather conditions.
- `StatisticsDisplay` Class: A concrete observer that displays statistical data (average, min, and max temperatures).

## Classes

1. **Observer Interface**: Defines the `update` method that each observer implements to receive updates.
2. **Subject Interface**: Defines methods to add, remove, and notify observers.
3. **WeatherStation (Subject)**: Holds weather data and notifies observers when data changes.
4. **CurrentConditionsDisplay (Observer)**: Displays the latest temperature and humidity.
5. **StatisticsDisplay (Observer)**: Tracks and displays statistical information, such as average, max, and min temperatures.

## Getting Started

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/UmangSonthaliya/WeatherStation_ObserverDesignPattern_
    cd WeatherStation_ObserverDesignPattern_
    ```

2. **Compile and Run**:
   - Compile the Java files:
     ```bash
     javac *.java
     ```
   - Run the main program:
     ```bash
     java WeatherStationDemo
     ```

## Usage Example

Here’s how the Observer Pattern works in this Weather Station example:

1. A `WeatherStation` object is created to act as the subject.
2. Two display devices (`CurrentConditionsDisplay` and `StatisticsDisplay`) are created and registered as observers with the `WeatherStation`.
3. When the `WeatherStation` updates its weather data, all registered observers are notified and display the updated information.

Example output:
First Update: Current conditions: 80.0F degrees and 65.0% humidity Avg/Max/Min temperature = 80.0/80.0/80.0

Second Update: Current conditions: 82.0F degrees and 70.0% humidity Avg/Max/Min temperature = 81.0/82.0/80.0

Third Update: Current conditions: 78.0F degrees and 90.0% humidity Avg/Max/Min temperature = 80.0/82.0/78.0


## Dependencies

- **Java 8** or higher

## License

This project is open-source and available under the [MIT License](LICENSE).
"""

# Writing to README.md file
with open("/mnt/data/README.md", "w") as file:
    file.write(readme_content)

"/mnt/data/README.md"

