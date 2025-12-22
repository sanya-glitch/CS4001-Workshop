class Students{
    
        //declaring attribute or instance variable 
        String name;
        String StudentId;
        int age;
        String course;
        
        //constructor
        Students(String name, String StudentId, int age, String course){
            this.name=name;
            this.StudentId=StudentId;
            this.age=age;
            this.course=course;
            //System.out.println("Name: " +name);
            
        }
        //method
        public void DisplayData(){
            System.out.println("Name: " +name);
            System.out.println("StudentId: " +StudentId);
            System.out.println("Age: " +age);
            System.out.println("Course: " +course);
        }
        public static void main(String[] args){
            //creating object of Student Class
            Students obj1=new Students("Gerard Way", "np05cp4a250031", 21, "BIT");
            Students obj2=new Students("Sanya  Chaudhary", "np05cp4a250039", 20, "BIT");
            Students obj3=new Students("Cristiano Ronaldo", "np05cp4a250088", 24, "BBA");
            obj1.DisplayData();
            obj2.DisplayData();
            obj3.DisplayData();
            
        }
        
    }
