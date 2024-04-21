package ex13_JavaCodingInterview.VendingMachine;


import java.net.CookieManager;
import java.util.List;
import java.util.Map;

public class VendingMachine implements Selector{
    //private final Inventory<Coin> coinInventory=new Inventory<>();
    //private final Inventory<Item> itemInventory=new Inventory<>();
    private final Inventory<Coin> coinInventory;
    private Inventory<Item> itemInventory;

    public VendingMachine( ){
        this.coinInventory=new Inventory<Coin>();
        this.itemInventory=new Inventory<Item>();
        initMachine();
    }

    private int totalSales;
    private int currentBalance;
    private Item currentItem;

//    public VendingMachine(){
//        initMachine();
//    }

    private void initMachine(){
        System.out.println("Initializing the vending machine...");
    }

    @Override
    public int checkPriceBtn(Item item) {// 가격확인 버튼
        return item.getPrice();
    }

    @Override
    public void insertCoinBtn(Coin coin) {//동전 삽입 버튼
    /*
    1.어느 동전인지 알아야 및 동전 합 구하기.
        //예를 들어, 동전을 특정 장치에 투입하고, 투입한 금액을 누적하거나 화면에 표시하는 등
    2. 그 수만큼 차감
    3. 총 합 보여주기
    */
      //  if(Coin.DIME.getDenomination()  )

    }

    @Override
    public Map<Item, List<Coin>> buyBtn() { // 구매 버튼
        /*
         1. 누른 상품 및 가격 알기
         2. 필요한 동전 리스트계산
         3. 동전이 그 만큼 차감.
        */

        return null;
    }

    @Override
    public List<Coin> refundBtn() {//환불버튼
        return null;
    }

    @Override
    public void resetBtn() {//리셋버튼

    }
}
