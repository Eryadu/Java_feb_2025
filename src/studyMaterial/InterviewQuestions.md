1. String vs StringBuilder vs StringBuffer
2. Singleton class
3. throw vs throws
4. method overloading vs overriding
5. runtime polymorphism vs compile time
6. checked vs unchecked exceptions
7. Final v/s Finally v/s Finalize()
8. equals() and hashcode()
9. How to make immutable class?
10. Internal implementation of hashmap
11. Collection - Most important (60% interview)
12. Put and Patch difference
13. HTPPs response Code (https://www.w3schools.com/tags/ref_httpmessages.asp)
14. Difference between Comparator and Comparable
15. Internal implementation of Hashmap?
16. Internal implementation of HashSet?
16. Equal and Hashcode contract?
17. Focus on how put() and get() will work?
18. Why we need to override Equal() and Hashcode() method ? check April22 readme
16. Why we need map instead of list or set?
17. For interview purpose always check version first for projects i.e.Current version?
    Care about Version? Maven version? JUnit Macitos?
    Craft which version depend on which ?
18. CI/CD pipeline ? Why use jenkins? Jenkins file? what type of file jenkins create?
19. Why we use Concurrent collections?
20. Why SCP concept is available only for String object but not for StringBuffer ? // Refer String notes(StudyMaterial)
   because all literal/constant store in SCP, and all mutable object store in Heap
21. Why String Objects are immutable whereas StringBuffer objects are mutable?
   Because if 1000 objects reference to same SCP, and if change reference of any one object then it effect all other object
   reference that's why Strings are immutable so there reference can't be changed.
22. In addition to String Objects, any other objects are immutable in Java ?
   All Wrapper class are immutable too.
