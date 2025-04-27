package studyMaterial.String.stringBuilder.Immutable;

// 1. Don't allow other classes to override the methods
//2. Don't allow to create subclass
public final class CustomImmutableDemo {

    //3. All fields should be Private and Final

    private final  String schoolName;
    private final Integer studentStrength;
    private final Student student;

    // 4. Use Parameterized constructor to initialize fields
    public CustomImmutableDemo(String schoolName, Integer studentStrength, Student student) throws CloneNotSupportedException{
        this.schoolName = schoolName;
        this.studentStrength = studentStrength;

        // 5. Don't allow direct access to Mutable Instance variables
        this.student = (Student) student.clone();
    }

    // 6. Don't provide methods to update fields (like setter methods)

    public String getSchoolName() {
        return schoolName;
    }

    public Integer getStudentStrength() {
        return studentStrength;
    }

    // 5. Don't allow direct access to Mutable Instance variables
    public Student getStudent() throws CloneNotSupportedException{
        return (Student) student.clone();
    }

    @Override
    public String toString() {
        try{
            return "{" +
                    "schoolName='" + this.getSchoolName() + '\'' +
                    ", studentStrength=" + this.getStudentStrength() +
                    ", student=" + this.getStudent()+
                    '}';
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        } return super.toString();
    }
}
