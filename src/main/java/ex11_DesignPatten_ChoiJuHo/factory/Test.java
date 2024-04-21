package ex11_DesignPatten_ChoiJuHo.factory;

public class Test   {
    public static void main(String[] args) {
//        MariaDB mariaDB=new MariaDB();
//        // mariaDB.setUrl("http:// localhost..");
//        mariaDB.execute("select");
//
//        DB db=new OracleDB();
//        db.setUrl("http://aa.bb");

        DBFactory dbFactory=new DBFactory();
        DB db= dbFactory.createDB("maria");
        db.execute("select");


    }
}
