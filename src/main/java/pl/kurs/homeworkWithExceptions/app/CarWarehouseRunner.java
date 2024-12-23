package pl.kurs.homeworkWithExceptions.app;

import pl.kurs.homeworkWithExceptions.exception.CarIsNullException;
import pl.kurs.homeworkWithExceptions.exception.NotEnoughSpaceException;
import pl.kurs.homeworkWithExceptions.model.Car;
import pl.kurs.homeworkWithExceptions.service.CarWarehouse;

public class CarWarehouseRunner {
    public static void main(String[] args) throws NotEnoughSpaceException, CarIsNullException {
        CarWarehouse wareHouse = new CarWarehouse(3);

        Car car1 = new Car("Ferrari", "Purosangue");
        Car car2 = new Car("BMW", "M3");
        Car car3 = new Car("Ferrari", "Purosangue");
        Car car4 = new Car("Audi", "RS5");

        try {
            wareHouse.addCar(car1);
            wareHouse.addCar(car2);
            wareHouse.addCar(car3);
            wareHouse.addCar(car4);
        } catch (NotEnoughSpaceException | CarIsNullException e) {
            System.out.println(e.getMessage());
        }
        try {
            wareHouse.searchCar(car1);
            wareHouse.searchCar(null);
        } catch (CarIsNullException e){
            System.out.println(e.getMessage());
        }
        Car[] storedCars = wareHouse.getCars();
        System.out.println("Samochody w magazynie");
        for (Car car : storedCars) {
            System.out.println(car);
        }
    }
}
