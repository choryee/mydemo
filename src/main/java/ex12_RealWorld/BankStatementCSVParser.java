package ex12_RealWorld;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser {

    DateTimeFormatter DATE_PATTERN=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private BankTransaction parseFromCSV(String line){ // 먼저 파싱.
        String[] columns=line.split(",");
        LocalDate date=LocalDate.parse(columns[0], DATE_PATTERN); //날짜 파싱
        // System.out.println("date : "+date);
        double amount=Double.parseDouble(columns[1]); // 금액 파싱
        String description=columns[2];

        return new BankTransaction(date, amount, description);
    }

    public List<BankTransaction> parseLinesFromCSV(List<String> lines){
        List<BankTransaction> bankTransactions=new ArrayList<>();
        for ( String line : lines){
            bankTransactions.add(parseFromCSV(line));
        }
        return bankTransactions;
    }

    public double calcTotalAmount(List<BankTransaction> bankTransactions){
        double total=0d;
        for ( BankTransaction bankTransaction : bankTransactions){
            total+=bankTransaction.getAmount();
        }
        return total;
    }

    public double calcTotalAmountByMonth(List<BankTransaction> bankTransactions, Month month) {
        // BankTransaction bankTransaction1=new BankTransaction()
        double totalAmount=0d;
        List<BankTransaction> bankTransactionsByMonth = selectInMonth(bankTransactions, month);
        for (BankTransaction bankTransaction : bankTransactionsByMonth) {
            double amount = bankTransaction.getAmount();
            totalAmount+=amount;
        }
        return totalAmount;
    }

    public List<BankTransaction> selectInMonth(List<BankTransaction> bankTransactions, Month month){
        List<BankTransaction> bankTransactionsInMonth=new ArrayList<>(); // bankTransactionsInMonth 비어있음.
        for( BankTransaction bankTransaction : bankTransactions){ // 저장할 타입 : for문 돌릴 것.
           if(bankTransaction.getDate().getMonth() == month) {
               bankTransactionsInMonth.add(bankTransaction); //위 if문 해당 되는 객체만 추가/저장함.
           }
        }
        return bankTransactionsInMonth; // List<BankTransaction>
    }

}
