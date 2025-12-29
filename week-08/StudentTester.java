public class StudentTester{
    //attributes
    String Name;
    int StudentId;
    int age;
    double grade;
    String Course;
    //Constructors to initialize all attriutes
    public StudentTester(String Name, int StudentId, int age, double grade, String Course){
        this.Name = Name;
        this.StudentId = StudentId;
        this.age = age;
        this.grade = grade;
        this.Course = Course;
    }
    //Using overloaded constructor (name + StudentId + age + Course)
    public StudentTester(String Name, int StudentId, int age, String Course){
        this.Name = Name;
        this.StudentId = StudentId;
        this.age = age;
        this.Course = Course;
        //default grade
    }
    //Using overloaded constructor (name + StudentId + Course)
    public StudentTester(String Name, int StudentId, String Course){
        this.Name = Name;
        this.StudentId = StudentId;
        this.Course = Course;
        //default age and grade
    }
    //Method : displayInfo(), display student details
    public void displayInfo(){
        System.out.println("Student Name : " +Name);
        System.out.println("Student ID : " +StudentId);
        System.out.println("Age : " +age);
        System.out.println("Grade : " +grade);
        System.out.println("Course : " +Course);
    }
    //Method : isAdult(), return true if age >= 18
    public boolean isAdult(){
       return age >= 18; 
    }
    //Method: updateGrade(double grade), adds grade to student
    public void updateGrade(double grade){
        this.grade = grade;
    }
    //Override toString()
    public String toString(){
        return "Student {Name ='" +Name + "', age=" +age + ", grade=" +grade + "}";
    }
    public static void main(String[] args){
        //Using full constructor (name, StudentId, age, grade, Course)
        StudentTester S1 = new StudentTester("Gerard", 167, 21, 2.99, "Chemistry");
        
        //Using Overloaded Constructor (name + StudentId + age + Course) 
        StudentTester S2 = new StudentTester("Ronaldo", 107, 25, "Science"); //default grade = 0.0
        
        //Using Overloaded Constructor (name + StudentId + Course)
        StudentTester S3 = new StudentTester("Jinx", 196, "History"); //default age = 0, grade = 0.0
        
        //Test displayInfo()
        System.out.println("==================Display Info==================");
        S1.displayInfo();
        S2.displayInfo();
        S3.displayInfo();
        
        //  Test isAdult()
        System.out.println("\n================== Update Grade ==================");
        System.out.println("Student is Adult : " +S1.isAdult());
        System.out.println("Student is Adult : " +S2.isAdult());
        System.out.println("Student is Adult : " +S3.isAdult());
        
        //Test updateGrade()
        System.out.println("\n================== Updated Grade ==================");
        S2.updateGrade(3.45);
        S2.displayInfo();
        
        //Test toString()
        System.out.println("\n================== toString() Output ==================");
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        
    }
}