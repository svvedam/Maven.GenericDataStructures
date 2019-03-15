package Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E>{
    public final E first;
    public final E second;

    List<E> pairArrayList;

    public Pair(E key, E value){
        this.first = key;
        this.second= value;
        pairArrayList = new ArrayList<>();
        pairArrayList.add(first);
        pairArrayList.add(second);

    }
    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E min() {
        Collections.sort(pairArrayList, new Comparator<E>() {
           @Override
           public int compare(E element1, E element2) {
               return System.identityHashCode(element1) - System.identityHashCode(element2);

           }
       });
      return pairArrayList.get(0);

    }

    public E max() {
        Collections.sort(pairArrayList, new Comparator<E>() {
            @Override
            public int compare(E element1, E element2) {
                return System.identityHashCode(element1) - System.identityHashCode(element2);

            }
        });
        return pairArrayList.get(1);
    }
}
