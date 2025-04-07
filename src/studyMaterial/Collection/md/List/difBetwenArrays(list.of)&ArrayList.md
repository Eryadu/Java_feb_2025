## What is the Difference Between List.of and Arrays.asList?
1. Mutability –
   Arrays.asList is immutable which means that you cannot add or remove elements from the list.
   However, you can modify the existing elements in the list.
   Example –

        String[] array = {"apple", "banana", "cherry"};
        List<String> list = Arrays.asList(array); // Converting to asList mean convert to collections
        list.set(0, "orange"); // Changes "apple" to "orange"
        List.of is immutable, meaning you cannot add, remove or modify elements in the list.
    If you try to modify the list, you will get an UnsupportedOperationException
    
    Example – Creates a new instance of the List interface.
    List<String> list = List.of("apple", "banana", "cherry");
    list.set(0, "orange"); // Throws UnsupportedOperationException

-- ArrayList is mutable, you can add and remove elements.
   Example
   List<String> list = new ArrayList<>(Arrays.asList(array))

   2. Null Element –
      Arrays.asList Allow null Element
      Example –

       String[] array = {"apple", null, "cherry"};
       List<String> list = Arrays.asList(array); // Allowed
    
   List.of does not Allow Null Element
   Example –
   List<String> list = List.of("apple", null, "cherry"); // Throws NullPointerException