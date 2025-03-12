package Mar11Encapsulation;

import java.sql.Struct;

public class FilePermission {
   private String isReadOnly;
   private String isWriteOnly;

    public FilePermission(String isReadOnly, String isWriteOnly) {
        this.isReadOnly = isReadOnly;
        this.isWriteOnly = isWriteOnly;
    }

    public String getIsReadOnly() {
        return isReadOnly;
    }

//    public void setIsReadOnly(String isReadOnly) {
//        this.isReadOnly = isReadOnly;
//    }

    public String getIsWriteOnly() {
        return isWriteOnly;
    }

    public void setIsWriteOnly(String isWriteOnly) {
        this.isWriteOnly = isWriteOnly;
    }

    public void accessPermission(String str){
        if ( this.isReadOnly == str)
        {
            System.out.println("User can read only." );
        }
        else if (this.isWriteOnly == str){
            System.out.println("User can read and write.");
        }

    }
}
