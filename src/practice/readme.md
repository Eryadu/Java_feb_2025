
## important point

// In Java, when you use nextInt(), it reads the integer input but does not consume the newline character that 
the user presses after entering the number. This is why when you try to use nextLine() immediately after nextInt(), 
nextLine() reads that leftover newline character (from pressing Enter after nextInt()), 
causing it to return immediately without allowing the user to enter new text.

Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt(); // Reads an integer
String text = scanner.nextLine(); // This will immediately consume the leftover newline
System.out.println("You entered: " + text);

// To fix this, you can add an extra scanner.nextLine() right after nextInt(). This will consume the leftover 
newline character so that the subsequent nextLine() call works as expected.

Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt(); // Reads an integer
scanner.nextLine(); // This consumes the leftover newline character
String text = scanner.nextLine(); // Now this works as expected
System.out.println("You entered: " + text);




