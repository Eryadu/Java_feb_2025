
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

