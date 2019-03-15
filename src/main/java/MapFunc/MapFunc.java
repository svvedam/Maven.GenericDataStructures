package MapFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,ReturnType>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc {

    public static <InputType, ReturnType> List<ReturnType> map(List<InputType> array, Function<InputType, ReturnType> function) {
        List<ReturnType> list = new ArrayList<>();
        for (InputType inputValue : array) {
            ReturnType returnType = function.apply(inputValue);
            System.out.println(returnType);
            list.add(returnType);
        }
        return list;
    }
    /*
    * public static ArrayLlist map(ArrayList arrayList, Function<Integer,Object>function){
    * return(ArrayList) arrayList.stream().map(function).collect(Collectors.toCollection(ArrayList::new))}*/
}
