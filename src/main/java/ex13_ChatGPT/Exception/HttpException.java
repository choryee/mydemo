package ex13_ChatGPT.Exception;



public class HttpException extends Exception{

    private static final long serialVersionUID = -2343225567L;

    public HttpException(String message){
        super(message);
    }

    public HttpException(String message, Exception e){
        super(message, e);
    }
}
