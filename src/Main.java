//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create WeatherStation (Subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create Display Devices (Observers)
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        // Register Displays with WeatherStation
        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(statisticsDisplay);

        // Update measurements (simulating weather updates)
        System.out.println("First Update:");
        weatherStation.setMeasurement(80, 65, 30.4f);

        System.out.println("\nSecond Update:");
        weatherStation.setMeasurement(82, 70, 29.2f);

        System.out.println("\nThird Update:");
        weatherStation.setMeasurement(78, 90, 29.2f);
    }
}