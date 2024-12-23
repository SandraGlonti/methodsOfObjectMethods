package pl.kurs.homeworkWithExceptions.exception;

public class NotEnoughSpaceException extends Exception{
    public NotEnoughSpaceException() {
    }

    public NotEnoughSpaceException(String message) {
        super(message);
    }
}
