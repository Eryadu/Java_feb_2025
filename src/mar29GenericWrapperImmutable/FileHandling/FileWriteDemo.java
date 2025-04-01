package mar29GenericWrapperImmutable.FileHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

        public static void main(String[] args) {
            // writeToFile();
            writeToFileWithResources();
            readFromFile();
        }

        public static void writeToFileWithResources(){

            // try with resources
            try(FileWriter fileWriter = new FileWriter("Test.txt")){
                fileWriter.write("Test1234");
                System.out.println("File has been written");

            }catch (IOException e){
                e.printStackTrace();
            }
        }

        public static void writeToFile(){

            try {
                FileWriter fileWriter = new FileWriter("Demo.txt");
                fileWriter.write("Hello, I am learning Java!");
                System.out.println("File has been written");
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        public static void readFromFile(){
            try {
                FileReader fileReader = new FileReader("Test.txt");

                int characters;
                while((characters = fileReader.read()) != -1){
                    System.out.print((char) characters);
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }


    /*
    Java 9
    try with resources


     */


    }
