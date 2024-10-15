package ExceptionValidation;

public class InvalidProducNameException extends RuntimeException{
    public InvalidProducNameException(){;}
    public InvalidProducNameException(String message){
        super(message);
    }
    public InvalidProducNameException(String message, Throwable cause){
        super(message, cause);
    }
}
