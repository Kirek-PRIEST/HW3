package task2;

import java.util.Objects;

public class CompareArrays {
    public <T, U> boolean compareArrays(T[] arr1, U[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].getClass().getName().equals(arr2[i].getClass().getName())){
                    return false;
                }
            }
            return true;
        }
        return  false;
    }
}
