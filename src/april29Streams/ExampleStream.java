package april29Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStream {
    public static void main(String[] args) {

        // Create a list with names of length 3,4,5,6 ...
        List<String> names = new ArrayList<>(Arrays.asList("bob","tom","tim","tom","tim","john","json","bson","peter",
                "donal","donald","pragra"));

        // filter the list which return only 3 character name and remove duplicate by using distinct()
        List<String> names1=names.stream()
                .filter(s -> s.length()==3)
                .distinct()
                .collect(Collectors.toList());

        List<String> names3=names.stream()
                .filter(s ->s.startsWith("t"))
                .collect(Collectors.toList());

        // filter the list which return only 3 character name and remove duplicate by using Set.
        Set<String> names2 =names.stream()
                .filter(s -> s.length()==3)
                .collect(Collectors.toSet());

        List<String> names4=names.stream()
                .filter(s ->s.startsWith("t"))
                .map(t -> t.concat("Test"))
                .map(r -> r.substring(2))
                .collect(Collectors.toList());


        List<Integer> numbers = Arrays.asList(1,2,4,5,6,7,8,10,12);
        int sum = numbers.stream()
                 .filter(n -> n%2==1)
                 .map(n -> n*n)
                 //.reduce(0, (n1, n2)-> n1+n2);
                 .reduce(0, Integer::sum); // Two ways to declare Reduce().It support BinaryOperator() Functional Interface

        // Other method to declare stream
       /* int sum = Stream.of(1,2,3,4,5,6)
                .filter(n -> n %2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);*/

        System.out.println("Sum is : " + sum);

        // print the 3 character name list
        System.out.println("List of 3 Characters name is :" + names1);
        System.out.println("Set of 3 Character name is : " + names2);
        System.out.println("List of name start with T is : " + names3);
        System.out.println("List of name using map is : " + names4);
        System.out.println("Sum is : " + sum);

        }
    }

