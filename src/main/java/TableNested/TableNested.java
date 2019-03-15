package TableNested;

import Table.Entry;

import java.util.ArrayList;
import java.util.Map;

/**
 * All you need to do for this microlab is take the Table and Entry
 * from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    //Access the Entry class below to complete the Table Nested class
    TableNested(){
        entries = new ArrayList<Entry>();
    }
    public V get(K key){
        V value = null;
        if(entries.isEmpty())
            return null;
        for(Entry entry: entries){
            if((entry.getKey()).equals(null))
                return null;
            else {
                value = (V) entry.getValue();
            }
        }
        return value;
    }

    public void put(K key, V value){
        Entry myEntry = null;
        myEntry = new Entry(key,value);
        entries.add(myEntry);
    }
    public void remove(K key){
        Entry removeEntry = null;
        for(Entry entry: entries){
            if(entry.getKey().equals(key))
                //removeEntry = new Entry(entry.getKey(), entry.getValue());
                removeEntry = entry;
        }
        entries.remove(removeEntry);
    }




    public class Entry {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

    }

}
