package ex12_RealWorld;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class TestParser {
    public static void main(String[] args) throws IOException {
        BankStatementCSVParser bankStatementParser=new BankStatementCSVParser();
        final Path path = Paths.get("C:\\Spring\\bank-data-simple.csv");
        final List<String> lines = Files.readAllLines(path);
        List<BankTransaction> bankTransactions=bankStatementParser.parseLinesFromCSV(lines);
        
        System.out.println("bankTransactions"+bankTransactions);
        System.out.println("총 합 : "+ bankStatementParser.calcTotalAmount(bankTransactions));
        System.out.println("선택한 달 : "+bankStatementParser.selectInMonth(bankTransactions, Month.JANUARY));
        System.out.println("4월 금액:"+bankStatementParser.calcTotalAmountByMonth(bankTransactions, Month.JANUARY));

       // Object BankTransaction;
        BankStatementProcessor bankStatementProcessor=new BankStatementProcessor(bankTransactions);
        System.out.println("3월 금액:"+bankStatementProcessor.calcTotalInMonth(Month.MARCH));

        System.out.println("category :" + bankStatementProcessor.calcTotalForCategory("Tesco"));
        System.out.println("findTransactionsGreaterThanEqual : "+bankStatementProcessor.findTransactionsGreaterThanEqual(100));

       //BankStatementProcessor.BankTransactionFilter bankTransactionFilter = null;
      //  System.out.println("bankTransactionFilter : "+ bankStatementProcessor.findTransaction(bankTransactionFilter));

    }
}

