package practice.GenericClass;

public class Generic<T,K> {
   private T name;
   private K id;

    public Generic(T name, K id) {
        this.name = name;
        this.id = id;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public K getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Generic<String,Integer> gen = new Generic<>("ABC", 123);
        System.out.println(gen.getId());
        System.out.println(gen);
        gen.setName("CDE");
        System.out.println(gen.getName());
        System.out.println(gen);

    }
}
