import java.util.*;

public class onlinereservation
{

    private static boolean[] seats = new boolean[10];

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Please select an Option");
            System.out.println("1. View Seat Map");
            System.out.println("2. Reserv Seat");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");

            int option = sc.nextInt();

            switch(option)
            {
                case 1:
                viewSeatMap();
                break;

                case 2:
                reserveSeat();
                break;

                case 3:
                cancelReservation();
                break;

                case 4:
                System.exit(0);

                default:
                System.out.println("Invalid option!");
                
            }
        }
    }

    private static void viewSeatMap(){
        System.out.println("Current Seat Map:");
        for(int i = 0; i < seats.length;i++)
        {
            if(seats[i]){
                System.out.print("X ");
            }
            else
            {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }

    private static void reserveSeat(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Seat Number (1-10): ");
        int seatNumber = scanner.nextInt();
        if(seatNumber < 1 || seatNumber > 10){
            System.out.println("Invalid seat Number!");
        }
        else if(seats[seatNumber - 1]){
            System.out.println("Seat Already Reserved!");
        }
        else{
            seats[seatNumber - 1] = true;
            System.out.println("Seat reserved!");
        }
    }

    private static void cancelReservation(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seat number (1-10): ");
        int seatNumber = scanner.nextInt();
        if(seatNumber < 1 || seatNumber > 10)
        {
            System.out.println("Invalid seat number!");
        }
        else if(!seats[seatNumber - 1])
        {
            System.out.println("Seat Not reserved!");
        }
        else
        {
            seats[seatNumber - 1] = false;
            System.out.println("Reservation canceled!");
        }
    }
}
