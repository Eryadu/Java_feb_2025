package practice;

public final class GenericClass1 <T>{
    private final T value; // immutable value type T

    public GenericClass1(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericClass1<Integer> generic = new GenericClass1<>(1);
        System.out.println(generic.getValue());

    }
}
