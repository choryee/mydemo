package ex12_RealWorld;//package RealWorld;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//
//public class BankTransactionAnalyzerSimple1 {
//    private static final String RESOURCES = "src/main/resources/";
//
//
//    public static void main(final String... args) throws IOException{
//   // public static void main(final String[] args) throws IOException{
//        //Path pt1 = Paths.get("C:\\JavaStudy\PathDemo.java");
//       // final Path path = Paths.get(RESOURCES + args[0]);
//        final Path path = Paths.get("C:\\Spring\\bank-data-simple.csv");
//      //  System.out.println("path: " + path);
//        final List<String> lines = Files.readAllLines(path);
//        for (int i=0; i<lines.size(); i++){
//
//        System.out.println("lines: "+lines);
//        }
//        // lines[30-01-2017,-100,Deliveroo, 30-01-2017,-50,Tesco, 01-02-2017,6000,Salary, 02-02-2017,2000,Royalties, 02-02-2017,-4000,Rent, 03-02-2017,3000,Tesco, 05-02-2017,-30,Cinema]
//        double total = 0d;
//        for (final String line : lines) {
//            final String[] columns = line.split(",");
//            //String line = "John,Doe,1000.50";
//            //String[] columns = { "John", "Doe", "1000.50" };
//
//                System.out.println("columns[1] : "+columns[1]);
//
//
//            final double amount = Double.parseDouble(columns[1]);
//            total += amount;
//        }
//        System.out.println("총 거래금액 :" + total);
//    }
//}