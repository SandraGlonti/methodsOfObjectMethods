package pl.kurs.homeworkWithExceptions.model;

public class Car {
    private String producer;
    private String model;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;

    }

    @Override
    public String toString() {
        return producer + " " + model;
    }

    public boolean equals (Object o){
        if (this == o) return true;
        if( o == null || getClass() !=o.getClass()) return false;
        Car car = (Car) o;
        return producer.equals(car.producer) && model.equals(car.model);
    }
}
