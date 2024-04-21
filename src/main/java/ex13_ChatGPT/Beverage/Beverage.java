package ex13_ChatGPT.Beverage;

public enum Beverage {
    COLA("콜라"), //private static final String COLA="콜라"; 와 동일.
    CIDER("사이다"),
    ORANGE_JUICE("오렌지 주스");

    private String name; // COLA("콜라"), 의 콜라가 name임.
    private int quantity;

    Beverage(String name) {
        this.name = name;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantity(int quantity){
        if(this.quantity < quantity ){
            this.quantity-=quantity;
        }else {
            System.out.println(name + " 재고가 부족합니다.");
        }
    }
    
}
