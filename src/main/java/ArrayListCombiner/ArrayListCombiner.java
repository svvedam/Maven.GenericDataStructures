package ArrayListCombiner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner {

    public static <E> List<? extends E> extendCombiner(ArrayList<E> a, ArrayList<? extends E> b) {
        a.addAll(b);
        return a;
    }
    public static <E> List<? super E> superCombiner(ArrayList<? super E> a, ArrayList<E> b) {
        a.addAll(b);
        return a;
    }

}
