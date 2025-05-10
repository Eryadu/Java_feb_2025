package april29Streams.Sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
        Stream sorting tends to be slightly slower due to overhead from stream processing and object creation.
        For readability and functional style, streams are great.
		For maximum performance, traditional sorting (especially on primitive arrays) is faster.

		What’s New?
	•	The parallelStream() version can take advantage of multi-core CPUs.
	•	May perform better on larger datasets or on multi-core machines, but has overhead due to thread coordination.

	•	Collections.sort() – fastest for most small-to-mid sized data.
	•	.stream().sorted() – slower due to functional overhead.
	•	.parallelStream().sorted() – may be faster than regular stream when cores and data size justify it.
*/

public class PerformanceSorted {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for(int i = 100000 ; i > 0 ; i--){
            numbers.add(i);
        }

        // Tradition Sort by Collections
        long Start = System.nanoTime();
        Collections.sort(numbers);
        long End = System.nanoTime();
        System.out.println("Tradition Sort : " + (End-Start)/100000 + "ms");

        // By Stream Sort method
        long Start1 = System.nanoTime();
        List<Integer> list = numbers.stream().sorted().collect(Collectors.toList());
        long End1 = System.nanoTime();
        System.out.println("Stream Sort : " + (End1-Start1)/100000 + "ms");

        // By ParallelStream Sort method
        long Start2 = System.nanoTime();
        List<Integer> listParallel = numbers.parallelStream().sorted().collect(Collectors.toList());
        long End2 = System.nanoTime();
        System.out.println("Parallel Stream Sort : " + (End2-Start2)/100000 + "ms");
    }
}
