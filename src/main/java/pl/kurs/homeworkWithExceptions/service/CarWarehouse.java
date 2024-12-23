package pl.kurs.homeworkWithExceptions.service;


import pl.kurs.homeworkWithExceptions.exception.CarIsNullException;
import pl.kurs.homeworkWithExceptions.exception.NotEnoughSpaceException;
import pl.kurs.homeworkWithExceptions.model.Car;

public class CarWarehouse {
    private Car[] cars;
    private int capacity;
    private int counter;

    public CarWarehouse(int capacity){
        this.capacity = capacity;
        this.cars = new Car[capacity];
        this.counter = 0;
    }


    public void addCar(Car car) throws NotEnoughSpaceException, CarIsNullException {
        if(car == null){
            throw new CarIsNullException("Nie ma takiego pojazdu");
        }

        if (counter >= capacity){
            throw new NotEnoughSpaceException("Brak miejsca w magazynie.");
        }else {
            cars[counter] = car;
            counter++;
            System.out.println("Został dodany następujący samochód: " + car);
        }
    }


    public void searchCar(Car car)throws CarIsNullException{
        if(car == null){
            throw new CarIsNullException("Nie ma takiego pojazdu!");
        }

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
