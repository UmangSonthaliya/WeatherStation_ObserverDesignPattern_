import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private float temp;
    private float humidity;
    private float pressure;

    public void setMeasurement(float temp,float humidity,float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer obj) {
        observers.add(obj);

    }

    @Override
    public void removeObserver(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for(Observer obj : observers){
            obj.update(temp,humidity, pressure);
        }
    }
}
