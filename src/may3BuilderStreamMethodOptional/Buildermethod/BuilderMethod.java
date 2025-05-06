package may3BuilderStreamMethodOptional.Buildermethod;


import java.util.stream.Stream;

final class Student1 {

    // final instance fields
    private final int id;
    private final String name;
    private final String address;

    public Student1(Builder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

    // Static class Builder
    public static class Builder {

        // instance fields
        private int id;
        private String name;
        private String address;

        public static Builder newInstance()
        {
            return new Builder();
        }

        private Builder() {}

        // Setter methods
        public Builder setId(int id)
        {
            this.id = id;
            return this;
        }
        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }
        public Builder setAddress(String address)
        {
            this.address = address;
            return this;
        }

        // build method to deal with outer class
        // to return outer instance
        public Student1 build()
        {
            return new Student1(this);
        }
    }

    @Override
    public String toString()
    {
        return "id = " + this.id + ", name = " + this.name +
                ", address = " + this.address;
    }
}

public class BuilderMethod {
    public static void main(String[] args) {

        Student1 student = Student1.Builder
                .newInstance()
                .setId(2)
                .setName("ABC")
                .setAddress("XYZ")
                .build();

        System.out.println(student);

        Student1 student1 = Student1.Builder
                .newInstance()
                .setId(3)
                .setAddress("XYZ")
                .build();
        System.out.println(student1);
    }
}
