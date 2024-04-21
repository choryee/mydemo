package ex11_DesignPatten_ChoiJuHo.factory;

public class DBFactory {

    public DB createDB(String protocol){
        if(protocol.equals("maria")){
            return new MariaDB();
        }else if(protocol.equals("oracle")){
            return new OracleDB();
        }else{
            throw new NullPointerException("db driver 업슴돵...");
        }


    }
}
