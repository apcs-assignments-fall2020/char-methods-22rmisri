import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if ((65 <= ch) && (ch <= 90)) {
            int diff = ch + 32;
            ch = (char) (diff); 
            return ch;
        }
        else {
            ch = (char) (ch);
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        int len = str.length();
        String str2 = "";
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if ( (65 <= ch) && (ch <= 90) ) {
                int diff = ch + 32;
                ch = (char) (diff);
                str2 += ch;
  
            }
            else {
                ch = (char) (ch);
                str2 += ch;
            }

        }
        return str2;
    }
    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if ((97 <= ch) && (ch <= 122)) {
            int diff = ch - 32;
            ch = (char) (diff);
            return ch;
        }
        else {
            ch = (char) (ch);
            return ch;
        }
        
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        int len = str.length();
        String str2 = "";
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if ( (97 <= ch) && (ch <= 122) ) {
                int diff = ch - 32;
                ch = (char) (diff);
                str2 += ch;
  
            }
            else {
                ch = (char) (ch);
                str2 += ch;
            }

        }
        return str2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a string");
        String str1 = scan.nextLine();
        Scanner scan1 = new Scanner (System.in);
        System.out.println("What would you like to make your string lowercase or uppercase?");
        String str2 = scan1.nextLine();
        if (str2.equals("lowercase")) {
            System.out.println("Here is your string in lowercase: " + myToLowerCase(str1));
        }
        else {
            System.out.println("Here is your string in uppercase: " + myToUpperCase(str1));
        }
    }
}