package ex13_JavaCodingInterview.VendingMachine;

import java.util.List;
import java.util.Map;

public interface Selector {// 가격확인버튼, 동전넣기 버튼, 구매버튼, 환불버튼, 리셋버튼
    public int checkPriceBtn(Item item);
    public void insertCoinBtn(Coin coin);
    public Map<Item, List<Coin>> buyBtn();

    public List<Coin> refundBtn();
    public void resetBtn();
}
