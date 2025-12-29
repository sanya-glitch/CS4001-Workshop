  public class Student{
//attributes
int StudentId;
String Name;
int age;
double grade;
//Constructor to initialize all attributes
Student(int StudentId, String Name, int age, double grade){
    this.Name = Name;
    this.StudentId = StudentId;
    this.age = age;
    this.grade = grade;
}
//Method: displayInfo(), displays student details
public void displayInfo() {
    System.out.println("Name : " +Name);
    System.out.println("StudentID : " +StudentId);
    System.out.println("Age : " +age);
    System.out.println("Grade : " +grade);
}
//Method: isAdult(), returns true if age >= 18
public boolean isAdult(){
    return age >=18;
}
//Method: updateGrade(double grade), adds grade to student
public void updateGrade(double grade){
    this.grade = grade;
    System.out.println("Updated Grade : " +this.grade);
}
//Ovrride toString() method
public String toString(){
  return "Name: " +Name + "\nAge: " +age + "\nGrade: " +grade;  
}
public static void main(String[] args){
//Create a student object
    Student S1 = new Student(131, "Sanya Chaudhary", 19, 3.19);
//Display student info
    S1.displayInfo(); // Output: Name:Sanya  Chaudhary, StudentId: 117, age: 19, grade: 3.19
    System.out.println("Student is adult : " +S1.isAdult()); //check if student is adult
    S1.updateGrade(3.19); //Updates the student's grade from previous grade to new value assigned
    System.out.println();
//Use toString()
System.out.println("toString() : " +S1); 
}
}
