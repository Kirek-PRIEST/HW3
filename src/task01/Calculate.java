package task01;

public class Calculate {

    public static <T extends Number> double sum(T first, T second) {
        return first.doubleValue() + second.doubleValue();
    }

    public static <T extends Number> double multiply(T first, T second) {
        return first.doubleValue() * second.doubleValue();
    }
    public static <T extends Number> double divide(T first, T second){
        if (second.doubleValue() == 0){
            System.out.println("Делить на ноль нельзя");
            return 0;
        }
        return first.doubleValue() / second.doubleValue();
    }
    public static <T extends Number> double subtract(T first, T second){
        return first.doubleValue() - second.doubleValue();
    }


}
