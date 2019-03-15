package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry> entries;
    Table(){
        entries = new ArrayList<Entry>();
    }

    //get which takes a key and returns either the entry from the ArrayList
    // with that key, or null if none is found.
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
    //put which takes a key and value and sets the value in the ArrayList to Entry(key, value);
    //Remember, a key point to exactly one value
    public void put(K key, V value){
        Entry myEntry = null;
        myEntry = new Entry(key,value);
        entries.add(myEntry);
    }
    //remove which takes a key and removes it from the ArrayList if it's in there.
    //It's a void method; no return type.
    public void remove(K key){
        Entry removeEntry = null;
        for(Entry entry: entries){
            if(entry.getKey().equals(key))
                //removeEntry = new Entry(entry.getKey(), entry.getValue());
                removeEntry = entry;
        }
        entries.remove(removeEntry);
    }
}
