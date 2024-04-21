package ex13_ChatGPT.CollectionPractice.map1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class MapTest<K,V>{ //필드에 제넥릭타입을 게속 쓰고 싶으면, 그것을 품고 있는 클래스 MapTest이것도, MapTest<K,V>해줘야.
   // Entry<String,String> entry; // Entry<String, String> entry;
   // List<Entry<String,String>> entries;
    List<Entry<K,V>> entries;

    MapTest(){
        entries=new ArrayList<>();
    }

    public void put( Entry<K,V> entry){
        entries.add(entry);
    }

    public void getKeys(){
        for(Entry entry : entries){
            System.out.println(entry.getKey());
        }
    }

    public List<Entry<K,V>> getAll(){
        for (Entry entry : entries){
            System.out.println(entry);
        }
        return entries;
    }

    public void getValue(){
        for(Entry entry : entries){
            System.out.println(entry.getValue());
        }
    }

    public boolean isContain(Entry<K,V > entry){
        boolean isContained=false;
        for(Entry entry1 : entries){
            if(entry1.getKey().equals(entry.getKey())){
                isContained=true;
            }
        }
        return isContained;
    }

    public int size(){
      return entries.size();
    }


}

class Entry<K,V>{
    K key; // String key;
    V value;

    Entry(K key, V value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key){
        this.key=key;
    }

    public V getValue(){
        return value;
    }

    public void setValue(V value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
public class map {
    public static void main(String[] args) {
        Entry entry1=new Entry("aa", "AA");
        Entry entry2=new Entry("bb", "BB");

        MapTest mapTest=new MapTest();
        mapTest.put(entry1);
        mapTest.put(entry2);

        mapTest.getKeys();

        mapTest.getAll();
        System.out.println(mapTest.size());
    }
}
