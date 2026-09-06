import java.util.*;

public class Q5_W1
{
    static String reverseCustomerName(String customerName)
    {
        char[] name = customerName.toCharArray();
        char[] reverse = new char[name.length];

        for(int i = 0; i < name.length; i++)
        {
            reverse[i] = name[name.length - 1 - i];
        }

        return new String(reverse);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        String reversedName = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversedName);
    }
}