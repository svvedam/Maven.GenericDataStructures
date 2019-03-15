package Pair;

import java.util.*;
import java.util.function.Function;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays{

   //firstlast method returns first and last values in the array list
   public static <E extends Comparable> Pair<E> firstLast(List<E> inputArray) {
       Pair<E> firstLastPair = new Pair<E>(inputArray.get(0),
               inputArray.get(inputArray.size()-1));
       return firstLastPair;

   }

   //min method returns smallest item in the array list
   public static <E extends Comparable> E min(List<E> arrayList) {
       Collections.sort(arrayList);
      return arrayList.get(0);
   }

    //max method returns largest item in the array list
    public static <E extends Comparable> E max(List<E> arrayList) {
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size()-1);
    }
   //minmax method returns a pair containing the largest and smallest items in the array list
   public static <E extends Comparable> Pair<E> minMax(List<E> arrayList) {
       Collections.sort(arrayList);
       E element1 = (E) min(arrayList);
       E element2 = (E) max(arrayList);
       Pair<E> minMaxPair = new Pair<E>(element1, element2);
       return minMaxPair;
   }
}
