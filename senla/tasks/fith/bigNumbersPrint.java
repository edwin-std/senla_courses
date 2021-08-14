package senla.tasks.fith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bigNumbersPrint {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char [] nums = input.toCharArray();
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        String p5 = "";
        String p6 = "";
        String p7 = "";
        String p8 = "";
        String p9 = "";
        for (int i = 0; i < input.length();i++) {
            if ("0".equals(String.valueOf(nums[i]))) {
                p1 = p1 + " " + "__$$$$_";
                p2 = p2 + " " + "_$$__$$";
                p3 = p3 + " " + "_$$__$$";
                p4 = p4 + " " + "_$$__$$" ;
                p5 = p5 + " " + "_$$__$$" ;
                p6 = p6 + " " + "_$$__$$" ;
                p7 = p7 + " " + "_$$__$$";
                p8 = p8 + " " + "_$$__$$";
                p9 = p9 + " " + "__$$$$_";
            } else if ("1".equals(String.valueOf(nums[i]))) {

                        p1 = p1 + " " + "__$$$";
                        p2 = p2 + " " + "_$$$$";
                        p3 = p3 + " " + "___$$";
                        p4 = p4 + " " + "___$$";
                        p5 = p5 + " " + "___$$";
                        p6 = p6 + " " + "___$$";
                        p7 = p7 + " " + "___$$";
                        p8 = p8 + " " + "___$$";
                        p9 = p9+  " " + "___$$";
            } else if ("2".equals(String.valueOf(nums[i]))) {
                p1 = p1 +" " +"__$$$$_" ;
                p2 = p2 +" " +"_$$__$$";
                p3 = p3 +" " +"_____$$";
                p4 = p4 +" " +"_____$$";
                p5 = p5 +" " +"____$$_";
                p6 = p6 +" " +"___$$__";
                p7 = p7 +" " +"__$$___";
                p8 = p8 +" " +"_$$____";
                p9 = p9 +" " +"_$$$$$$";
            } else if ("3".equals(String.valueOf(nums[i]))) {
                p1 = p1 + " " + "_$$$$$_";
                p2 = p2 + " " +"_$$___$$";
                p3 = p3 + " " +"______$$";
                p4 = p4 + " " +"______$$";
                p5 = p5 + " " +"___$$$_";
                p6 = p6 + " " +"______$$";
                p7 = p7 + " " +"______$$";
                p8 = p8 + " " +"_$$___$$";
                p9 = p9 + " " +"__$$$$$";
            } else if ("4".equals(String.valueOf(nums[i]))) {
                p1 = p1 + " " +"____$$_";
                p2 = p2 + " " +"___$$$_";
                p3 = p3 + " " +"___$$$_" ;
                p4 = p4 + " " +"__$$$$_" ;
                p5 = p5 +" " + "__$_$$_" ;
                p6 = p6 + " " +"_$$_$$_" ;
                p7 = p7 + " " +"_$$$$$$" ;
                p8 = p8 + " " +"____$$_" ;
                p9 = p9 + " " +"____$$_";
            } else if ("5".equals(String.valueOf(nums[i]))) {
                p1 = p1 +" " +  "$$$$$$";
                p2 = p2 +" " + "_$$____";
                p3 = p3 + " " +"_$$____";
                p4 = p4 +" " + "_$$$$$_";
                p5 = p5 + " " +"_$$__$$";
                p6 = p6 +" " + "_____$$";
                p7 = p7 + " " +"_____$$";
                p8 = p8 + " " +"_$$__$$";
                p9 = p9 + " " +"__$$$$_";
            } else if ("6".equals(String.valueOf(nums[i]))) {
                p1 = p1 +" " + "__$$$$_";
                p2 = p2 + " " +"_$$__$$" ;
                p3 = p3 + " " +"_$$____" ;
                p4 = p4 + " " +"_$$____" ;
                p5 = p5 + " " +"_$$$$$_" ;
                p6 = p6 + " " +"_$$__$$" ;
                p7 = p7 + " " +"_$$__$$" ;
                p8 = p8 + " " +"_$$__$$";
                p9 = p9 + " " +"__$$$$_";
            } else if ("7".equals(String.valueOf(nums[i]))) {
                p1 = p1 +" " + "_$$$$$$$" ;
                p2 = p2 + " " +"_____$$" ;
                p3 = p3 + " " +"____$$_" ;
                p4 = p4 + " " +"____$$_" ;
                p5 = p5 + " " +"___$$__" ;
                p6 = p6 +" " + "___$$__" ;
                p7 = p7 + " " +"__$$___" ;
                p8 = p8 + " " +"__$$___";
                p9 = p9 + " " +"__$$___";
            } else if ("8".equals(String.valueOf(nums[i]))) {
                p1 = p1 +" " + "___$$$$__";
                p2 = p2 + " " +"__$$__$$_";
                p3 = p3 + " " +"__$$__$$_";
                p4 = p4 + " " +"__$$__$$_";
                p5 = p5 + " " +"___$$$$__";
                p6 = p6 + " " +"__$$__$$_";
                p7 = p7 + " " +"__$$__$$_";
                p8 = p8 + " " +"__$$__$$_";
                p9 = p9 + " " +"___$$$$__";
            } else if ("9".equals(String.valueOf(nums[i]))) {
                p1 = p1 + " " +"__$$$$__" ;
                p2 = p2 + " " +"_$$__$$_" ;
                p3 = p3 + " " +"_$$__$$_" ;
                p4 = p4 + " " +"_$$__$$_" ;
                p5 = p5 + " " +"__$$$$$_" ;
                p6 = p6 + " " +"_____$$_" ;
                p7 = p7 + " " +"_____$$_" ;
                p8 = p8 + " " +"_$$__$$_" ;
                p9 = p9 + " " +"__$$$$__";
            }
        }
        System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4 + "\n" + p5 + "\n" + p6 + "\n" + p7 + "\n" + p8 + "\n" + p9);
    }
}
