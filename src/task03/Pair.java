package task03;

public class  Pair <T, U> {
    T first;
    U second;
    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public U getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return "First = " + first + ". Second = " + second;
    }
}
