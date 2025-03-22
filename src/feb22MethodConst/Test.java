package feb22MethodConst;

public class Test {
    int modelYear;
    String modelName;

    public Test(int year , String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Test test = new Test(1998, "Maserati");
        System.out.println(test.modelYear + " " + test.modelName);
    }
}
