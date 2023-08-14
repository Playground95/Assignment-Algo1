import java.util.Scanner;

public class Algo6 {

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
        
        int previousSpaceIndex = 0;
        int curruntSpaceIndex = 0;
        String reverse = "";

        for (int i = (str.length()); i > 0; i--) {
            if(i -1 == 0){
                    curruntSpaceIndex = 0;
                    reverse += " ";
                }
            if(str.charAt(i-1)== ' ') {
                curruntSpaceIndex = i-1;  
                if(previousSpaceIndex == 0){
                    previousSpaceIndex = str.length();
                }
                
            }
            for (int j = curruntSpaceIndex; j < previousSpaceIndex; j++) {
                    reverse += str.charAt(j) + "";
                }
                previousSpaceIndex = curruntSpaceIndex;
        }
        System.out.println(reverse);
        
    }
}
