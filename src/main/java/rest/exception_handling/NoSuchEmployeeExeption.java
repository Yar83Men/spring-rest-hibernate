package rest.exception_handling;

public class NoSuchEmployeeExeption extends RuntimeException{

    public NoSuchEmployeeExeption(String message) {
        super(message);
    }
}
