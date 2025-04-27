package studyMaterial.String.stringBuilder.Immutable;

public class Student implements Cloneable{
    private String studentName;
    private int studentRollNo;

    public Student(String studentName, int studentRollNo) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNo=" + studentRollNo +
                '}';
    }
}
