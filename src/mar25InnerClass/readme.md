## Inner class / Nested Class
   When a class defined inside another class. It's used as Encapsulation.
   
1. Local Inner class
2. Member Inner class
3. Static Inner class - used ofently V.Imp
4. Anonymous Inner class - V.Imp


Static??
1. variable
2. method
3. class
4. block

## Anonymous Inner class - class without name.We use anonymous class to implement interface with one or two method and
   we don't want to create separate class.
-- By using Anonymous class we can also implement Abstract Class. 
   -- Created by new keyword following Interface/class name.
-- Java 8 Lambda - does not have name
-- Lambda - AWS - serverless server

Note : We can create Inner class in Anonymous class but problem is that, when try to access the members of Inner class
       we need to create object of inner class (either by Local inner class method/ Static Inner Class), but we don't have 
       Outer class name as Outer class is Anonymous. So we can create Inner class in method of Anonymous class.

## We can create the class inside method as well

Note : Method Local inner classes can’t use a local variable of the outer method until that local variable is not 
       declared as final. 