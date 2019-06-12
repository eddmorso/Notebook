package Model.Exceptions;

public class DataException extends RuntimeException {
    String message;

    public DataException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + message;
    }
}
