package pl.kurs.homeworkWithExceptions.exception;

public class CarIsNullException extends Exception{
    public CarIsNullException() {
    }

    public CarIsNullException(String message) {
        super(message);
    }
}
