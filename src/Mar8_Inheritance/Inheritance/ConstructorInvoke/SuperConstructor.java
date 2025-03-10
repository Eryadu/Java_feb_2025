package Mar8_Inheritance.Inheritance.ConstructorInvoke;

class SuperConstructor{
    int x;

    SuperConstructor(int x) {
        this.x = x;
    }

    public void getNumber(){
        System.out.println(" The value of X is :" + x );
    }
}
class Constructor extends SuperConstructor {
    Constructor(int x) {
        super(x);
    }
}
