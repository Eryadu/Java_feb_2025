package practice.genericClass.Interface;

interface MutliPara <K,V>{
        K getKey();
        V getValue();

    }
public class MultiParameterInterface<K,V> implements MutliPara<K,V> {

    private K key;
    private V value;

    public MultiParameterInterface(K key, V value) {
        this.key = key;
        this.value = value;
    }


    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MultiParameterInterface{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        MultiParameterInterface<Integer, Integer> multi = new MultiParameterInterface<>(12,10);
        System.out.println(multi);
    }
}
