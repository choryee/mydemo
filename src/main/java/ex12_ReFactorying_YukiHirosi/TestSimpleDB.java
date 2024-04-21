package ex12_ReFactorying_YukiHirosi;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class TestSimpleDB {
    public static void main(String[] args) {
        try {
//            final Path path = Paths.get("C:\\Spring\\bank-data-simple.csv");
//            final List<String> lines = Files.readAllLines(path);

            SimpleDatabase db = new SimpleDatabase(new FileReader("C:\\myprojects\\pattens\\patten\\src\\Factorying_YukiHirosi\\dbfile.txt"));
            Iterator<String> it = db.iterator();
            System.out.println("it : "+it.toString());
            while (it.hasNext()) {
                System.out.println();
                String key = it.next();
                System.out.println("KEY: \"" + key + "\"");
                System.out.println("VALUE: \"" + db.getValue(key) + "\"");
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
