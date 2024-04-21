package ex13_ChatGPT.DesignPatten.Chain1;

interface WithdrawalHandler{
    void setNextHandler(WithdrawalHandler handler);
    void handleWithdrawal(int amount);
}

class Banknote50Handler implements WithdrawalHandler{
    private WithdrawalHandler nextHandler;

    @Override
    public void setNextHandler(WithdrawalHandler handler) {
        nextHandler=handler;
    }

    @Override
    public void handleWithdrawal(int amount) {
        if(amount>=50){
            int numBanknotes=amount/50;
            System.out.println("Dispensing "+numBanknotes+"banknote of 50");
        }else if(nextHandler !=null){
            nextHandler.handleWithdrawal(amount);
        }else {
            System.out.println("cannot process the withdrawal request");
        }
    }
}

class Banknote20Handler implements WithdrawalHandler {
    private WithdrawalHandler nextHandler;

    @Override
    public void setNextHandler(WithdrawalHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleWithdrawal(int amount) {
        if (amount >= 20) {
            int numBanknotes = amount / 20;
            System.out.println("Dispensing " + numBanknotes + " banknotes of 20");
        } else if (nextHandler != null) {
            nextHandler.handleWithdrawal(amount);
        } else {
            System.out.println("Cannot process the withdrawal request");
        }
    }
}

public class ChainExample {
    public static void main(String[] args) {
        Banknote50Handler banknote50Handler=new Banknote50Handler();
        Banknote20Handler banknote20Handler=new Banknote20Handler();

        banknote50Handler.setNextHandler(banknote20Handler);
        banknote50Handler.handleWithdrawal(20);

    }
}
