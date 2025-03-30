## Wrapper classes

Autoboxing --> automatic conversion between primitive types to objects
Unboxing --> Object type to primitive

-- > Collection don't work with primitive data types that's why use wrapper class.

convert one type to another type

int -> float

automatic conversion between primitive types to Object

int             --  Integer
float           --  Float
long            -- Long
double          -- Double
char            -- Character
boolean         -- Boolean

## Immutable class
Can't modify

-- all the field should be final and private
-- class should be final
-- class should be no setter method
-- we should override equals and hashcode method

## equal() and hashcode()
if two objects are equal they must have the same hashcode

Object 1  -- xtv12sd
Object 2  -- xtv12sd
Internal implemention of HashMap  -- [Important question for interview]

## Collections

Data Structure : how we structure our data for efficient access or storage of data

Its framework for modifying/manipulating objects
It has set of interfaces and classes which are already defined for us

                Iterable 
                    |
                    Collection [I] 
    |               |
List[I]             Set[I]                  Queue[I]               
|                   |                       |
ArrayList           HashSet                    PriorityQueue
LinkedList          TreeSet
LinkedHashSet

    Map [I]
     |
HashMap

TreeMap  , LinkedHashMap, ConcurrentHashMap


Stack

utitility classes
1. Arrays [C]
2. Collections [C]

## Generics
   Type safety ??
   generics introduced to have type safety in Java collection

Generic --> General form of something, not specific
Advantage of generic
1. type safety
2. flexibility of choosing a collection type/ object type

generic class represent by angular brackets <> with any type of datatypes to provide type safety and flexibility

generic introduced to have type safety in Java collections.


## Maven  given option to work with LOBBoK and AutoValue library
It is build tool, project management tool

LOMBOK? library
boiler plate code
Autovalue? library

Maven?
Gradle?

## File Handling

working with files and adding/removing , manupulating files
FileWriter class
try with resources // no need to close the resource
try without resource // need to close every time 

FileReader class

io path
nio path






































