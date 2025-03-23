package practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



    public class TryCatch{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try{
                int x = scanner.nextInt();
                int y= scanner.nextInt();
                int result = x/y;
                System.out.println(result);
            }
            catch (InputMismatchException e)
            {
                System.out.println("java.util.InputMismatchException");
            }

            catch(ArithmeticException e){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }


        }
    }


