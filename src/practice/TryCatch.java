package practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



    public class TryCatch{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int result=0;
            try{
                int x = scanner.nextInt();
                int y= scanner.nextInt();
                result = x/y;
            }
            catch (InputMismatchException e)
            {
                System.out.println("java.util.InputMismatchException");
                System.out.println(result);
            }

            catch(ArithmeticException e){
                System.out.println("java.lang.ArithmeticException: / by zero");
                System.out.println(result);
            }


        }
    }


