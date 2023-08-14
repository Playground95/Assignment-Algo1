import java.util.Scanner;

public class Algo5 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String str;
        boolean isAscii = false;

        do {
            System.out.print("Enter a text: ");
            str = scanner.nextLine().strip(); 

            for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 127) { 
                isAscii = true;
            }
        }
        } while (str.isBlank() || !isAscii);

        
        String reverse= "";
        for (int i = 0; i < str.length(); i++) {
            
            //if(str.charAt(i) == ' ') continue;
            
            reverse += str.charAt(str.length() -1- i)+"";

        } 
        System.out.println(reverse);
        
    }
}
