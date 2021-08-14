package senla.tasks.first;
import java.util.*;


public class sumInString {

    public int sumOfTheNumbers(String line)
    {
        int l = line.length();
        int sum = 0;
        String temp = "";
        for (int i = 0; i < l; i++)
        {
            if (Character.isDigit(line.charAt(i)))
            {
                if (i < l-1 && Character.isDigit(line.charAt(i+1)))
                {
                    temp += line.charAt(i);
                }
                else
                {
                    temp += line.charAt(i);
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
                if(!Character.isDigit(line.charAt(i))) {
                    sum = 0;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        sumInString s = new sumInString();
        String inp = "Sum of 265 and 2 is:";
        System.out.println("The given string is: \n"+ inp);
        System.out.println("The sum of numbers in the string is: "+ s.sumOfTheNumbers(inp));
    }
}
