package practice.functionalInterfaceLambda.InterfaceExtendsNonFun;

// The compiler throws an exception, as the BookStore interface has 3 abstract methods.
// Thus, the Library interface can't extend BookStore.
/*public interface BookStore {
    int sell();
    int buy();
    List<String> customers();
    //boolean issue_book();
}*/

/*@FunctionalInterface
interface Library extends BookStore{
    boolean issue_book();*/
    /*----------------------------------------------------------------*/

// The BookStore interface can extend Library as BookStore is a normal Interface. There is no compilation error.
/*@FunctionalInterface
   interface Library {
    boolean issue_book();
}

interface BookStore extends Library{
    int sell();
    int buy();
    List<String> customers();
    boolean issue_book();

}*/
/*----------------------------------------------------------------*/

// In case, BookStore has only one method same as Library issue_book or no method, then BookStore can extend Library.
@FunctionalInterface
interface Library {
    boolean issue_book();
}
@FunctionalInterface
interface BookStore extends Library{
    boolean issue_book();

}