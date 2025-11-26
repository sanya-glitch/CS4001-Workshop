import java.util.Scanner;
public class RichsawFare
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //base fare and charges
        final int BaseFare = 60; //rs.60 base fare
        final int perKM = 30;   //rs.30 per kilometer
        final int perMIN = 2;   //rs.2 per minutes
        final double LocalDiscount = 0.10;   //10% discount fo locals on long distance
        final double NightSurcharge = 0.15;  //15% discount for night-time travel
        
        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();
        
        System.out.print("Enter time (in minutes): ");
        int time = sc.nextInt();
        
        System.out.print("Is the customer local? (True/False): ");
        boolean isLocal = sc.nextBoolean();
        
        System.out.print("Is the travel during night? (True/False): ");
        boolean isNight = sc.nextBoolean();
        
        //fare calculation
        double fare = BaseFare + (distance * perKM) + (time  * perMIN);
        //apply local discount if distance > 11km
        fare = (isLocal && distance > 11) ? fare * (1- LocalDiscount): fare;
        //apply night surcharge
        fare = isNight ? fare * (1+ NightSurcharge) : fare;
        //display result in nepali format 
        long FinalFare = Math.round(fare);
        System.out.println("Final Fare: Rs. " + FinalFare);
    }
}