POJO?
Plain Old Java Object , just add variable , getter setter, constructor but no business rule( no method)
## POJO stands for Plain Old Java Object.
-- DTO ?
-- Entity?
-- immutable class? by cloneable the objects


?? if we override hashcode() and don't equal() method then how put() will behave --> return null
?? if we override equal() and don't hashcode() method then how put() will behave --> return null
?? if we don't override equal() and hashcode() method then how put() will behave --> implement by-default method and return null
?? how to make class 100% immutable

immutable problem ? with final and without final class


It’s just a simple Java class that doesn’t extend or implement any special Java framework classes or interfaces —
it’s just a clean, straightforward object with fields, constructors, getters, and setters.

## Override equal() and hashcode() is must when we are taking any object instead of Wrapper class i.e.Map<Employee, Integer>
because equal() and hashcode() will use the same properties to calculate hashcode and match the key. If we don't override
then it will calculate by default method in object class. Example hashcode() calculate hashcode based on memory reference
and equal() by default use == instead of .equal().
-- To calculate the correct hash we always need to override the equal() and hashcode(), with the same parameter we want to 
   pass and want to calculate hashcode.