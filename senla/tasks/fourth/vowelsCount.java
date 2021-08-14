package senla.tasks.fourth;

import java.util.ArrayList;
import java.util.Scanner;

public class vowelsCount {
        public static void main(String args[]) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a sentence :");
            String sentence = scan.nextLine();
            String space = " ";
            String vowels = "ауоиэыяюеёАУОИЭЫЯЮЕЁ";
            ArrayList<String> words = new ArrayList<>();

            int vowelCount = 0;
            int consCount = 0;
            int i;
            System.out.println("["+sentence+"]");
            for (i = 0; i < sentence.length(); i += 1)
            {
                char currentChar = sentence.charAt(i);
                boolean isVowel = false;
                int index;
                for (index = 0; index < vowels.length(); index += 1)
                {
                    if (vowels.charAt(index) == (currentChar))
                    {
                        vowelCount++;
                        isVowel =true;
                        break;//we found the vowel, no need to keep looping
                    }
                }
                if (!isVowel && Character.isLetter(currentChar))//vowel have not been found
                {
                    consCount++;
                }
            }
            System.out.println("cons: " + consCount);
            System.out.println("vowel: " + vowelCount);
        }
    }
