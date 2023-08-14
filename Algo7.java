import java.util.Scanner;

public class Algo7 {

        private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        String str;

        do {
            System.out.print("Enter a text: ");
            str = scanner.nextLine().strip();

        } while (str.isBlank());

        String shortets = "";
        String longest = "";

        int previousSpaceIndex = 0;
        int curruntSpaceIndex = 0;
        int wordlenght= 0;
    
        int shortestWordIndex = 0;
        int longestWOrdIndex = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if(i == str.length() - 1){
                curruntSpaceIndex = i+1;
            }
            if(str.charAt(i)== ' ') {
                curruntSpaceIndex = i;  
                if(previousSpaceIndex == 0){
                    wordlenght = i;
                }
                if(wordlenght > curruntSpaceIndex - previousSpaceIndex-1){
                    wordlenght = curruntSpaceIndex - previousSpaceIndex;
                    shortestWordIndex = previousSpaceIndex;
                }
                if(wordlenght < curruntSpaceIndex - previousSpaceIndex-1){
                    wordlenght = curruntSpaceIndex - previousSpaceIndex;
                    longestWOrdIndex = previousSpaceIndex;
                }
        
                previousSpaceIndex = curruntSpaceIndex+1;
            }
        }
        while(str.charAt(shortestWordIndex) != ' ' && shortestWordIndex != str.length()){
            shortets += str.charAt(shortestWordIndex);
            shortestWordIndex++;
        }
        while(str.charAt(longestWOrdIndex) != ' ' && longestWOrdIndex != str.length()){
            longest += str.charAt(longestWOrdIndex);
            longestWOrdIndex++;
        }
        System.out.println("shortest Word : "+ shortets);
        System.out.println("Longest Word : "+ longest);
    }
}
