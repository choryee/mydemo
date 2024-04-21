package ex12_RealWorld;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "src/main/resources/";

    public static void main(final String... args) throws IOException{
        final Path path = Paths.get("C:\\Spring\\bank-data-simple.csv");
        final List<String> lines = Files.readAllLines(path);
        for (int i=0; i<lines.size(); i++){
        System.out.println("lines: "+lines);
        }
        // lines[30-01-2017,-100,Deliveroo, 30-01-2017,-50,Tesco, 01-02-2017,6000,Salary, 02-02-2017,2000,Royalties, 02-02-2017,-4000,Rent, 03-02-2017,3000,Tesco, 05-02-2017,-30,Cinema]
        double total = 0d;
        final DateTimeFormatter DATE_PATTERN=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (final String line : lines) {
            final String[] columns = line.split(",");
            //String line = "John,Doe,1000.50";
            //String[] columns = { "John", "Doe", "1000.50" };
            final LocalDate date= LocalDate.parse(columns[0], DATE_PATTERN);
            if(date.getMonth() == Month.JANUARY){
                final double amount=Double.parseDouble(columns[1]);
                total+=amount;
            }
        }
        System.out.println("총 1월 거래금액 :" + total);
    }
}