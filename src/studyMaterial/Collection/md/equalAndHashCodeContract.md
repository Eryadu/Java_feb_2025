## hashCode() and equals() Contract in Java
   The relationship between hashCode() and equals() is governed by a critical contract that all Java objects must follow 
   when these methods are overridden.

## return type of equal is boolean and hashCode is integer
## The Contract Rules

1. Consistency:
   If a.equals(b) returns true, then a.hashCode() must equal b.hashCode()
   However, the reverse is not required - two objects with the same hash code don't have to be equal
2. Invariance:
   An object's hash code must remain consistent across multiple invocations (unless the object is modified in ways that 
   affect equality comparisons)
3. Default Behavior:
   If equals() is not overridden, the default implementation (from Object class) uses reference equality (==)
   The default hashCode() implementation typically converts the memory address to an integer

## Why This Contract Matters
   This contract is crucial for correct behavior when objects are used in hash-based collections like:
-- HashMap
-- HashSet
-- Hashtable

## Implementation Guidelines

1. When overriding equals():
-- Make it reflexive: x.equals(x) should be true
-- Make it symmetric: x.equals(y) iff y.equals(x)
-- Make it transitive: if x.equals(y) and y.equals(z), then x.equals(z)
-- Make it consistent: multiple calls should return the same result
-- Handle null: x.equals(null) should be false

2. When overriding hashCode():
-- Use the same fields used in equals()
-- For primitive fields, use their values directly
-- For object fields, use their hashCode()
-- For arrays, use Arrays.hashCode()
-- Combine values using a formula like 31 * previous + current

Example Implementation

public class Person {
private String name;
private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

## Common Pitfalls

-- Violating the contract: Different hash codes for equal objects
-- Mutable hash keys: Changing an object's hash-relevant fields after adding to a hash collection
-- Inconsistent equality: Different results from equals() for the same objects
-- Ignoring null: Not properly handling null fields

## Best Practices
-- Always override both methods together
-- Use IDE-generated methods or java.util.Objects helpers
-- Make objects immutable when used as hash keys
-- Document your equality semantics
-- Consider using records (Java 16+) which provide automatic implementations
## This contract ensures proper functioning of hash-based collections and maintains the integrity of Java's object model.

------------------------------------------------------------------------------------------------------------------

## Notes by Durga:
## Relation b/w equal() method and == operator
1. if r1 == r2 is true then r1.equal(r2) is always true
2. if r1 == r2 is false then r1.equal(r2) may be True or false
3. if r1.equal(r2) is true, then r1==r2 may be true or false
4. if r1.equal(r2) is false, then r1==r2 is always false

## Difference b/w == operator and equal() method
-- if there is no relation between argumental type, .equal() method would not rise any compile or run time error, it 
   always returns FALSE, and == always rise Compile time error i.e. incomparable type java.lang.String and java.lang.StringBuffer
String s1 = new String("Yad");
String s2 = new String("Yad");
StringBuffer sb1 = new StringBuffer("Yad");
StringBuffer sb2 = new StringBuffer("Yad");
sout(sb1.equal(sb2))-->False
sout(s1==sb1)-->CE
sout(s1.equals(sb1))-->False

## Operator(==)                                             Equal()
1. It is operator, applicable for.                        1. Only applicable for objects i.e. r1.equals(r2) 
   both primitive type( int, float ...)
   and object type. i.e. r1 == r2; , 
   10==20.
2. In case of obj reference, == meant for ref comp.        2. Present in object class, also used for ref check, by default
   (address) comp only                                     equal method present in object clas also meant for Reference comp.
3. We can't override == operator for contents.             3. Can override
4. CE if incomparable type                                 4. Return False

## for any object r1:  r1==null -->False
                       r1.equal(null) --> False
## Hashing related data structure (HashMap, HashSet, HashTable) following fundamental rules:
-- Two equivalent objects should be placed in same bucket
-- but all the obj present in the same bucket need not be equal.
-- i.e. if two objects are equal, they should have same hashcode
-- i.e. if two objects have same hashcode, they may not be equal .

## Contract b/w Equal and HashCode
-- If two objects are equal by .equal method then, the hashcode must be equal.i.e, two equivalent objects should have
   same hashcode. if r1.equal(r2) is True, then r1.hashcode==r2.hashcode
-- If we are override .Equal() method, then to satisfy the contract, compulsory, we should override hashcode method
   to ensure that two equal objects have equal hashcode
2. If two object are not equal by .Equal(), then it is not restricted on hashcode may be True or False
3. If Hashcode of Two objects are equal, we cannot conclude anything about .Equal(), it may be True or false
4. If Hashcode of two objects are not equal, then objects are always not equal by .Equal().

## In String class under all collections , under Wrapper class .Equal() is Override for content comparison, hence it is
   highly recommended to override equal method in our class for content comparison. But in StringBuffer, we cannot override .Equal
   method, it returns false always
   
## In String class .equal() is override for content comp, hence Hashcode() is override to generate HC based on content
 String s1 = new String ("Yad");
 String s2 = new String ("Yad");
 sout(s1.equals(s2)) --> True
 sout(s1.hashCode)-->9595420
 sout(s2.hashCode)-->9595420
 ## In StringBuffer .equal() is not override for content comp hence hashCode() is also not override
StringBuffer sb1 = new StringBuffer ("Yad");
StringBuffer sb2 = new StringBuffer ("Yad");
sout(sb1.equals(sb2)) --> False
sout(s1.hashCode)-->9595421
sout(s2.hashCode)-->9593456 // both different

Example :
Class Person{
          ......
{
  public boolean equal(Object obj)
  {
   if(obj instanceOf Person)
   {
     Person p = (Person) obj;
     if(name.equal(person.name) && age == p.age)
     { return true;
     }
      else{
      return false;
      }
   }
  else
  { return false;
  }                                name   age    SSN
}.                      i.e. p1     yad   30     30
                             p2     yad   30     60

Q: which of the following HashCode method appropriate for this Person class?
1. public int hashCode()
{ return 100; // for every name or age hashcode should be different, not always same
}

2. public int hashCode()
{ return age + ssn;  // .equal() returns True , name and age match but hashcode diff due to diff ssn.
}

3. public int hashCode()  // .equal () use name and age parameters
{ return name.hashCode + age;
}

4. no restriction

Answer is 3. // based on which parameter uses in .equal() method, it is highly recommended to use the same parameter
                to override the hashCode(), so it gave correct implementation



  