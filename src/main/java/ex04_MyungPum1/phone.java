package ex04_MyungPum1;

import java.util.Scanner;

public class phone {
    private String name, phone;

    phone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름과 전화번호 입력 >>" + sc.next() + sc.nextInt());
        String inputName = sc.next();
        // int getInt = sc.nextInt();
        String inputInt = Integer.toString(sc.nextInt());

        phone ph = new phone(inputName, inputInt);
        System.out.println(ph.getName() + "  " + ph.getPhone());
    }

}
