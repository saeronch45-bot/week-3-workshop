
import java.util.Scanner;
public class RickshawFare
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float finalFare;
        int baseFare = 40;
        int perkmCharge = 35;
        int perMinCharge = 5;
        float nightSurcharge = 0.15f;
        float localDiscount = 0.10f;
        System.out.println("Enter the distance(km):");
        float distance = sc.nextFloat();
        System.out.println("Enter the time(min):");
        float time = sc.nextFloat();
        System.out.println("Is the passenger local?:");
        String passenger = sc.next();
        System.out.println("Is it night-time travel?:");
        String nighttime = sc.next();
        finalFare = baseFare+(distance*perkmCharge)+(time*perMinCharge);
        if(passenger.equalsIgnoreCase("yes") && distance>10){
            finalFare = finalFare - (finalFare * localDiscount);
        }
        if(nighttime.equalsIgnoreCase("yes")){
            finalFare = finalFare +(finalFare * nightSurcharge);
        }
        System.out.println("The total fare for this ride is RS." +finalFare);
    }
}