import java.util.concurrent.Executors;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}
