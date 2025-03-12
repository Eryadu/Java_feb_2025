package Mar11Encapsulation;

import java.util.Scanner;

public class MainPermission {
    public static void main(String[] args) {
        FilePermission filePermission = new FilePermission(".pdf",".docs");
        System.out.println("File type to read only is :" + filePermission.getIsReadOnly());
        System.out.println();
        System.out.println("File type to read and write is :" + filePermission.getIsWriteOnly());
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file type : ");
        String str = scanner.next();
        filePermission.accessPermission(str);

       filePermission.setIsWriteOnly(".txt");
       filePermission.accessPermission(str);
    }
}
