package mar11Encapsulation;

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
        if ( this.isReadOnly.equalsIgnoreCase(str))
        {
            System.out.println("User can read only." );
        }
        else if (this.isWriteOnly.equalsIgnoreCase(str)){
            System.out.println("User can read and write.");
        }

    }
}
