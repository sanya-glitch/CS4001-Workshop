class MenuItem{
    //Attributes
    String itemName;
    double price;
    String category;
    boolean isVegetarian;
    boolean isAvailable;
    String spiceLevel;
    
    //constructor
    public MenuItem(String itemName, double price, String category, boolean isVegetarian, boolean isAvailable, String spiceLevel){
        this.itemName=itemName;
        this.price=price;
        this.category=category;
        this.isVegetarian=isVegetarian;
        this.isAvailable=isAvailable;
        this.spiceLevel=spiceLevel;
    }
    //Display item info
    public void DisplayData(){
        System.out.printf("%-20s Rs. %-6.2f | %-12s | Veg: %-5b | Available: %-5b | Spice: %-6s\n", itemName, price, category, isVegetarian, isAvailable, spiceLevel);
    
    }
}

public class KhanaGharMenu{
    public static void main(String[] args) {
        //Create menu items
        MenuItem item1 = new MenuItem("Dal-Bhat Set", 120, "Dal-Bhat", true, true, "Medium");
        MenuItem item2 = new MenuItem("Masala Chiya", 15, "Chiya-Nasta", true, true, "Mild");
        MenuItem item3 = new MenuItem("Dharane Kalo Bangur", 400, "Special Meat", false, true, "Hot");
        MenuItem item4 = new MenuItem("Sekuwa", 200, "Meat Dish", false, false, "Medium");
        
        //Store in array
        MenuItem[] menu = {item1, item2, item3, item4};
        
        //Display formatted menu
        System.out.println("Khana Ghar Daily Menu");
        System.out.println("------------------------------------------------------");
        for(MenuItem item : menu){
            item.DisplayData();
        }
        System.out.println("------------------------------------------------------");
        
        //Vegetarian items
        System.out.println("Vegetarian Items: ");
        for(MenuItem item: menu){
            if(item.isVegetarian) item.DisplayData();
        }
        System.out.println();
        
        //Non-vegetarian items
        System.out.println("Non-Vegetarian Items: ");
        for(MenuItem item : menu){
            if(!item.isVegetarian) item.DisplayData();
        }
        System.out.println();
        
        //Non-Veg items price > 100 and available
        System.out.println("Non-Veg Items > Rs. 100 and Available: ");
        for(MenuItem item : menu){
            if(!item.isVegetarian && item.price > 100 && item.isAvailable) item.DisplayData();
        }
        System.out.println();
        
        //Veg items price < 50 and available
        System.out.println("Veg Items < Rs.50 and Avaailable: ");
        for(MenuItem item :  menu){
            if(item.isVegetarian && item.price < 50 && item.isAvailable) item.DisplayData();
        }
    }
}

