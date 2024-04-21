package ex08_Java_ParkEunJong;

public class Bus {
    private int busNumber;
    private int passengerCount;
    public int money;

    Bus(int busNumber, int passengerCount, int money){
        this.busNumber=busNumber;
        this.passengerCount=passengerCount;
        this.money=money;
    }

    public void earnMoney(int rate, int passengerCount){
        int earning=rate*passengerCount;
        money=money+earning;
    }

    public void take(int money){
        this.money+=money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("버스"+busNumber+"번의 승객은"+passengerCount+
                "명이고, 수입은 "+money+"입니다.");
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                ", passengerCount=" + passengerCount +
                ", money=" + money +
                '}';
    }
}
