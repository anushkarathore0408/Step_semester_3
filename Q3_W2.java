import java.util.*;

public class Q3_W2
{
    static String validateFileExtension(String filename)
    {
        int position = filename.lastIndexOf(".");

        if(position == -1)
            return "Rejected — invalid file type";

        String extension = filename.substring(position + 1);

        if(extension.equalsIgnoreCase("pdf") ||
           extension.equalsIgnoreCase("docx") ||
           extension.equalsIgnoreCase("zip"))
            return "Accepted";
        else
            return "Rejected — invalid file type";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        System.out.println(validateFileExtension(filename));
    }
}