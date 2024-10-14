package ExceptionValidation;

public class InvalidProducQuantityException extends RuntimeException{
    public InvalidProducQuantityException(){;}
    public InvalidProducQuantityException(String message){
        super(message);
    }
    public InvalidProducQuantityException(String message, Throwable cause){
        super(message, cause);
    }
}
