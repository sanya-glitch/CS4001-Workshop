import java.time.LocalDate;
import java.time.Period;

public class GymMemberNepal {
    // Attributes
     String memberName;
     String membershipType; // Monthly, Quarterly, Yearly
    double monthlyFee;
     LocalDate joinDate;

    // Constructor to initialize all attributes
    public GymMemberNepal(String memberName, String membershipType, double monthlyFee, LocalDate joinDate) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.monthlyFee = monthlyFee;
        this.joinDate = joinDate;
    }

    // Method: calculateAnnualFee() – yearly cost with 13% VAT
    public double calculateAnnualFee() {
        double yearlyCost = monthlyFee * 12;
        double vat = yearlyCost * 0.13; // 13% VAT
        return yearlyCost + vat;
    }

    // Method: getDiscountedFee(double discountPercent) – discounted monthly fee
    public double getDiscountedFee(double discountPercent) {
        return monthlyFee - (monthlyFee * discountPercent / 100);
    }

    // Method: isEligibleForDiscount() – true if member > 6 months
    public boolean isEligibleForDiscount() {
        Period period = Period.between(joinDate, LocalDate.now());
        return period.getMonths() + (period.getYears() * 12) > 6;
    }

    // Method: displayMemberInfo() – formatted Nepali style
    public void displayMemberInfo() {
        System.out.println("सदस्यको नाम: " + memberName);
        System.out.println("सदस्यता प्रकार: " + membershipType);
        System.out.println("मासिक शुल्क: रु " + monthlyFee);
        System.out.println("जोडिएको मिति: " + joinDate);
    }

    // Override toString()
    public String toString() {
        return "GymMemberNepal{name='" + memberName + "', type='" + membershipType +
               "', monthlyFee=Rs." + monthlyFee + ", joinDate=" + joinDate + "}";
            }
    public static void main(String[] args){
        System.out.println("FITNESS NEPAL GYM, Dharan");
        System.out.println("==================================================================");
         // Basic Membership
        GymMemberNepal basic = new GymMemberNepal("Gerard", "Monthly", 1500, LocalDate.of(2020, 10, 29));
        basic.displayMemberInfo();
        System.out.println("Annual Fee with VAT: Rs. " + basic.calculateAnnualFee());
        System.out.println("Discounted Fee (10%): Rs. " + basic.getDiscountedFee(10));
        System.out.println("Eligible for Discount? " + basic.isEligibleForDiscount());
        System.out.println(basic);

        System.out.println("-----------------------------");

        // Premium Membership
        GymMemberNepal premium = new GymMemberNepal("Jhon", "Quarterly", 2500, LocalDate.of(2022, 6, 7));
        premium.displayMemberInfo();
        System.out.println("Annual Fee with VAT: Rs. " + premium.calculateAnnualFee());
        System.out.println("Discounted Fee (15%): Rs. " + premium.getDiscountedFee(15));
        System.out.println("Eligible for Discount? " + premium.isEligibleForDiscount());
        System.out.println(premium);

        System.out.println("-----------------------------");

        // VIP Membership
        GymMemberNepal vip = new GymMemberNepal("Ronaldo", "Yearly", 4000, LocalDate.of(2025, 4, 7));
        vip.displayMemberInfo();
        System.out.println("Annual Fee with VAT: Rs. " + vip.calculateAnnualFee());
        System.out.println("Discounted Fee (20%): Rs. " + vip.getDiscountedFee(20));
        System.out.println("Eligible for Discount? " + vip.isEligibleForDiscount());
        System.out.println(vip);
    }
}

    
    


