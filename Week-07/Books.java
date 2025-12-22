class Books{
    //declaring attribute or instance variable
    String title;
    String author;
    String ISBN;
    int publicationYear;
    String genre;
    boolean availabilityStatus;
    
    //constructor
    Books(String title, String author, String ISBN, int publicationYear, String genre, boolean availabilityStatus){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.publicationYear=publicationYear;
        this.genre=genre;
        this.availabilityStatus=availabilityStatus;
        
    }
    //method
    public void DisplayData(){
        System.out.println("Title: " +title);
        System.out.println("Author: " +author);
        System.out.println("ISBN: " +ISBN);
        System.out.println("Publication Year: " +publicationYear);
        System.out.println("Genre: " +genre);
        System.out.println("Availability Status: " +availabilityStatus);
        
    }
    public static void main(String[] args){
      //creating object of Book class
      Books b1=new Books("Harry Potter", "J.K. Rowling", "0747532743", 1997, "Fantasy", true);
      Books b2=new Books("Musicophilia", "Oliver Sacks", "0676974735", 2007, "Non-Fiction / Science / Music", false);
      Books b3=new Books("Attack on Titan", "Hajime Isayama", "1612620244", 2009, "Manga / Action / Dark Fantasy", true);
      //Display all books information
      System.out.println("ALL BOOKS: ");
      System.out.println("------------------------------------------");
      b1.DisplayData();
      System.out.println("------------------------------------------");
      b2.DisplayData();
      System.out.println("------------------------------------------");
      b3.DisplayData();
      System.out.println("------------------------------------------");
      
      //Display available books
      System.out.println("AVAILABLE BOOKS: ");
      System.out.println("------------------------------------------");
      if(b1.availabilityStatus) b1.DisplayData();
      System.out.println("------------------------------------------");
      if(b2.availabilityStatus) b2.DisplayData();
     
      if(b3.availabilityStatus) b3.DisplayData();
      System.out.println("------------------------------------------");
      
      //Display Unavailable books
      System.out.println("UNAVAILABLE BOOKS: ");
      System.out.println("------------------------------------------");
      if(!b1.availabilityStatus) b1.DisplayData();
     
      if(!b2.availabilityStatus) b2.DisplayData();
      System.out.println("------------------------------------------");
      if(!b3.availabilityStatus) b3.DisplayData();
      
      
      // Display available books published after 2000
        System.out.println("AVAILABLE BOOKS PUBLISHED AFTER 2000:");
        System.out.println("------------------------------------------");
        if (b1.availabilityStatus && b1.publicationYear > 2000) b1.DisplayData();
       
        if (b2.availabilityStatus && b2.publicationYear > 2000) b2.DisplayData();
        
        if (b3.availabilityStatus && b3.publicationYear > 2000) b3.DisplayData();
        System.out.println("------------------------------------------");

    }
}

