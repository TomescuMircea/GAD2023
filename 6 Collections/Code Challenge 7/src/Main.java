public class Main {
    public static void main(String[] args) {
        MyHashTable myHashTable=new MyHashTableImpl();
        myHashTable.put("key1","value1");
        myHashTable.put("key2","value2");
        myHashTable.put("key3","value3");
        System.out.println(myHashTable.size());
    }
}
