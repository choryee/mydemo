package ex13_ChatGPT.DesignPatten.State;

interface State {
    void insertCoin(); //동전투입상태
    void selectCoffee(); //커피선택상태
    void dispense(); //커피 분배상태
}

class NoCoinState implements State{
    private CoffeeMachine coffeeMachine;  // CoffeeMachine은 state를 사용하려는 애.

    NoCoinState(CoffeeMachine coffeeMachine){
        this.coffeeMachine=coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("coin inserted");
        coffeeMachine.setState(coffeeMachine.getHasCoinState());
    }

    @Override
    public void selectCoffee() {

    }

    @Override
    public void dispense() {

    }
}

class HasCoinState implements State {

    @Override
    public void insertCoin() {

    }

    @Override
    public void selectCoffee() {

    }

    @Override
    public void dispense() {

    }
}

class CoffeeSelectedState implements State {

    @Override
    public void insertCoin() {

    }

    @Override
    public void selectCoffee() {

    }

    @Override
    public void dispense() {

    }
}
// Context 클래스
class CoffeeMachine {
    private State state;
    private State noCoinState; // class NoCoinState
    private State hasCoinState;
    private State coffeeSelectedState;

    public CoffeeMachine() {
        noCoinState = new NoCoinState(this); // this는 CoffeeMachine
        hasCoinState = new HasCoinState();
        coffeeSelectedState = new CoffeeSelectedState();
        state = noCoinState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getCoffeeSelectedState() {
        return coffeeSelectedState;
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void selectCoffee() {
        state.selectCoffee();
    }

    public void dispense() {
        state.dispense();
    }
}
public class StatePatternEx {
    public static void main(String[] args) {
        NoCoinState noCoinState=new NoCoinState(new CoffeeMachine());
        noCoinState.insertCoin();
    }
}
