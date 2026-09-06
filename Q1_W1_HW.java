import java.util.*;

public class Q1_W1_HW
{
    static void checkDuplicateSeats(int[] seatNumbers)
    {
        boolean found = false;

        for(int i = 0; i < seatNumbers.length; i++)
        {
            boolean duplicate = false;

            for(int j = 0; j < seatNumbers.length; j++)
            {
                if(i != j && seatNumbers[i] == seatNumbers[j])
                {
                    duplicate = true;
                    break;
                }
            }

            boolean alreadyPrinted = false;

            for(int k = 0; k < i; k++)
            {
                if(seatNumbers[k] == seatNumbers[i])
                {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(duplicate && !alreadyPrinted)
            {
                System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                found = true;
            }
        }

        if(!found)
            System.out.println("No Duplicate Seats Found");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] seatNumbers = new int[5];

        for(int i = 0; i < 5; i++)
        {
            seatNumbers[i] = sc.nextInt();
        }

        checkDuplicateSeats(seatNumbers);
    }
}