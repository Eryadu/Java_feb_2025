
## Refer Durga Videos
SCP (String Constant pool) introduced in Java 1.6 V under Method Area/ PERMGEN
In Java 1.7 V SCP came under heap due to memory flexibility.

1. Example how SCP and Heap Work
-- SCP store String Literal/ Constant i.e "Yad"
1.String A = new String ("Yad");
2.s.concat("Software");
3.s = s.concat("Solution");

## Most Important
## Heap.                        SCP 
line 1 : Object created in heap for (Yad) , and it created a copy in SCP as well for future use.
line 2 : "Software" is String Literal , so it create a copy in SCP and s.concat("Software") is creating a new object
       (YadSoftware)at RUNTIME under heap that has no reference so it will be picked up by GC.
line 3 : "Solution" is String Literal , so it create a copy in SCP and s.concat("Software") is creating a new object
       (YadSolution)at RUNTIME under heap that has referenced to "s" and previous reference will be deleted.
(Total 3 objects in heap (Yad, YadSoftware, YadSolution) and three in SCP(Yad, Software, Solution))

2. Example 

1.String s1 = new String ("Spring");
2.s1.concat("Fall");
3.String s2 = s1.concat("Winter");
4.s2.concat("Summer");
sout(s1); // Spring
sout (s2); SpringWinter

         Heap                SCP (in Heap total 4 object and SCP 3 objects)
line 1 : Object created in heap for (Spring) , and it created a copy in SCP as well for future use.
line 2 : "Fall" is String Literal , so it create a copy in SCP and s.concat("Fall") is creating a new object
      (SpringFall)at RUNTIME under heap that has no reference so it will be picked up by GC.
line 3 : Object created in heap for ("SpringWinter") referenced to s2.
line 4 : "Summer" is String Literal , so it create a copy in SCP and s.concat("Summer") is creating a new object
       (SpringWinterSummer)at RUNTIME under heap that has no reference so it will be picked up by GC.

3. Example

1.String s1 = new String ("You cannot Change me ");
2.String s2 = new String ("You cannot Change me ");
sout (s1==s2); // false
3.String s3 = "You cannot Change me ";
sout (s1==s3); // false
4.String s4 = "You cannot Change me ";
sout (s3==s4); // true
5.String s5 = "You cannot" + "Change me "; // at compile time, JVm combine constant /Literal string with constant /Literal string
                                            // so it treat as single object "You cannot Change me"
6.String s6 = "You cannot";
7.String s7 = s6 + "Change me "; // it combine by JVM at RunTime and create instance in heap
sout (s4==s7); // false
8.final String s8 = "You cannot";
9.String s9 = s8 + "Change me "; // at compile time, JVm combine constant /Literal string with constant /Literal string
                                // so it treat as single object "You cannot Change me"
sout (s4==s9); // true

      Heap      SCP
s1 -> UCCme     UCCme -> s3,s4,s5,s9
s2 -> UCCme     you cannot -> s6,s8
s7 -> UCCme     Changeme


## Imprtant Constructor of String class
1. String s = new String (); // Empty String object
2. String s = new String (String literal);
3. String s = new String (StringBuffer sb);
4. String s = new String (StringBuilder sb);
5. String s = new String (Char[] ch);
6. String s = new String (Byte[] b); //. [10,20,30,...]

## String s = "Yad";
   s.length() //3 --- > length() is method of String Class

   s.length // 3 ---> length is property of Array.
   
## String s = new String ("Yad");
   String s1 = s.toUpperCase();
   String s2 = s.toString();
   String s3 = s.toLowercase(); // no change in output
   sout (s == s2); //True   
   sout (s1== s); // false
   sout (s1==s3); // true // if there is no change than it refer to same SCP object
   
## Internal implementation of every String method
class Test
{
private int i ;
Test(){
this i =i ;
}

public Test modify(int i){
if (this i == i){
return this; // current object
}
else{
return new Test(i);
}
}

Test t1 = new Test(10);
Test t2 = t1.modify(10);
Test t3 = t1.modify(100);
sout (t1==t2); // true // no change
sout (t1==t3); // false

## Final vs immutability

class Test{
main
{
final StringBuffer sb = new StringBuffer("Yad");
sb.append("Software");
sout(sb); // YadSoftware 
sb = new StringBuffer("Gup"); // Compile time error, cause sb is final variable we cannot reassign it.
}

## final keyword is used for variables only not for objects
Which of the following are meaningful?
1. final variable // true
2. final object // false
3. Immutable variable // false
4. Immutable object // true

## length vs capacity
length -- > how many elements it contains
capacity -- > how many elements it can contain, capacity can change according to size
capacity formula : (cc(current capacity) + 1)*2 
                 :i.e. (16+1)*2 = 34..
## by default capacity of StringBuffer is 16 

## StringBuffer sb = new StringBuffer(String s);
capacity = s.length() +16; 

## Constructor of StringBuffer 
StringBuffer sb = new StringBuffer();
StringBuffer sb = new StringBuffer(int initialCapacity);

## sb.append( String s), sb.append( int s), sb.append( long l), sb.append( float f)

## SB sb  = new SB (1000);
 sb.append("ABC"); // only three char
sout(sb.capacity); //1000
## sb.trimToSize(); // this method is used to delete remaining empty memory
sout(sb.capacity); // 3

## public void setlength(int length);
## public void ensureCapacity(int capacity);
## public void trimToSize();

## StringBuffer vs StringBuilder
1. Every method present in StringBuffer is synchronized    1. Not synchronized
2. At a time only one thread allow to operate on object    2. Not thread safe, multiple thread can operate on object
   hence threadSafe.
3. Threads are required to wait to operate on object.      3. Threads don't need to wait, performance fast
   hence relatively performance is slow
4. Introduce in Java v 1.0                                 4. Java v 1.5

## method chaining
when method return the same type as method and that return use as input to another method that's called method chain.
i.e. StringBuilder sb = new StringBuilder();
     sb.append("Yad").append("Gup").reverse().insert(2."aa") // method chaining
    // sb.append return StringBuilder type output that used in other method of StringBuilder.
 
