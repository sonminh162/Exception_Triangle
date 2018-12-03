public class IllegalTriangleException extends Exception{
    String errorMessage;
    public IllegalTriangleException(String errorMessage){
        this.errorMessage = errorMessage;
    }
    public String getString(){
        return errorMessage;
    }
}
