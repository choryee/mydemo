package ex10_Refactorying_Java.Movie;

import java.util.Iterator;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        this._name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        //Iterator 객체 생성: 먼저, 컬렉션 객체의 iterator() 메서드를 호출하여 Iterator 객체를 생성합니다.
        Iterator it = _rentals.iterator(); //빈 자료 객체선언을 받음.
        String result = getName() + " 고객님의 대여기록\n";
        //요소 접근: hasNext() 메서드를 사용하여 다음 요소가 있는지 확인하고, next() 메서드를 사용하여 다음 요소에 접근합니다.
        Rental each = (Rental) it.next(); //it.next(); 받은 요소 형태가 Rental임.
        double amount=0;

        while (it.hasNext()) {
            switch (each.getMovie().get_priceCode()) {
                case  Movie.REGULAR:
                    amount+=2;
                    if(each.getDaysRented() > 2){
                        amount+=(each.getDaysRented())*1.5;
                    }
                case Movie.NEW_RELEASE:
                    amount+=5;
                case Movie.CHILDREN:
                    amount+=3;
            }
        }
        //이번에 대여한 비디오 정보와 대여료를 출력

        return result;
    }
}
