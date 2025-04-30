package april29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
        // print the 3 character name list
        System.out.println("List of 3 Characters name is :" + names1);
        System.out.println("Set of 3 Character name is : " + names2);
        System.out.println("List of name start with T is : " + names3);
        System.out.println("List of name using map is : " + names4);

        }
    }

