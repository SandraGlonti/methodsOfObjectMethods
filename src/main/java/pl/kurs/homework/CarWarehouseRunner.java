package pl.kurs.homework;

public class CarWarehouseRunner {
    public static void main(String[] args) {
        CarWarehouse wareHouse = new CarWarehouse(3);

        Car car1 = new Car("Ferrari", "Purosangue");
        Car car2 = new Car("BMW", "M3");
        Car car3 = new Car("Ferrari", "Purosangue");
        Car car4 = new Car("Audi", "RS5");

        wareHouse.addCar(car1);
        wareHouse.addCar(car2);
        wareHouse.addCar(car3);
        wareHouse.addCar(car4);

        wareHouse.searchCar(car1);
        wareHouse.searchCar(car4);

        Car[] storedCars = wareHouse.getCars();
        System.out.println("Samochody w magazynie");
        for (Car car : storedCars){
            System.out.println(car);
        }
    }
}
