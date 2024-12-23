package pl.kurs.homework;


public class CarWarehouse {
    private Car[] cars;
    private int capacity;
    private int counter;

    public CarWarehouse(int capacity){
        this.capacity = capacity;
        this.cars = new Car[capacity];
        this.counter = 0;
    }

    // Customowy wyjatek jezeli Car bedzie nullem
    public void addCar(Car car){
        if (counter >= capacity){
            System.out.println("Brak miejsca w magazynie.");
            // Customowy wyjatek zamiast sout jezeli nie ma miejsca + obsluga w runnerze
        }else {
            cars[counter] = car;
            counter++;
            System.out.println("Został dodany następujący samochód: " + car);
        }
    }

    // Customowy wyjatek jezeli Car bedzie nullem
    public void searchCar(Car car){
        int count = 0;
        for(Car storedCars : cars){
            if (car.equals(storedCars)){
                count++;
            }
        }
        System.out.println("Znaleziono: " + count + " takich samych aut");
    }
    public Car[] getCars(){
       return cars.clone();
    }

}
