package Model.Exceptions;

public class DataException extends Exception {
    private String message;

    public DataException(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + message;
    }
}
