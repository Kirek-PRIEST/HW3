package task2;

import java.util.Objects;

public class CompareArrays {
    public <T> boolean compareArrays(T[] arr1, T[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].getClass().getName() != arr2[i].getClass().getName()){
                    return false;
                }
            }
            return true;
        }
        return  false;
    }
}
