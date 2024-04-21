package ex13_ChatGPT.DesignPatten.Chain;

interface Handler{
    void handleRequest(String request);
}

class ConcreteHandlerA implements Handler{
    private Handler nextHandler; // interface를 자기(ConcreteHandlerA)의 변수로 가짐.

    @Override
    public void handleRequest(String request) {
        if(request.equals("A")){
            System.out.println("Handled by ConcreateHandlderA");
        } else if (nextHandler !=null ) {
            nextHandler.handleRequest(request);
        }
    }
    public void setNextHandler(Handler handler) {
        nextHandler = handler;
    }
}


class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("Handled by ConcreteHandlerB");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    public void setNextHandler(Handler handler) {
        nextHandler = handler;
        }
    }

public class ChainEx {
    public static void main(String[] args) {
        ConcreteHandlerA handlerA =new ConcreteHandlerA();
        ConcreteHandlerB handlerB =new ConcreteHandlerB();

        handlerA.setNextHandler(handlerB);
        handlerA.handleRequest("A");
    }
}
