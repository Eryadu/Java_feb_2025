Optional ?
Atomic Class ?
Atomic Integer ?
Why we can't modify the local variable in lambda ? // Stack memory?
We can use local variable inside lambda, but we can't change it. We can modify instance variable inside lambda.

Streams API ?
## foreach() methode return void, so we cannot write any method after foreach() and foreach() only accept Consumer Functional 
   Interface
   
## Collectors in stream??

## Steam never ever modify original collections.
-- Stream is an Interface.

1. Intermediate - Which return streams object i.e. filter().filter()...
   we can extend further because it returned stream objects. filter() return stream which uses in other filter() method.
   we can extend pipeline, or chain of methods
2. Terminator - doesn't return any stream object
   i.e. filter(n -> n % 11 == 0).collect(Collectors.toList();
   it doesn't return any stream object further 
   we can't extend pipeline

## In map() we just take one input and one output, in between we can apply any logic.