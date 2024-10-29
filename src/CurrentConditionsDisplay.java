public class CurrentConditionsDisplay implements Observer{
    private float temp;
    private float humidity;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("Current condition: " + temp + "F degree and" + humidity + "% humidity");

    }
}
