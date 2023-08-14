import java.util.Scanner;

public class Algo1{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int input = 0;
        String output = "Your sequence: "; 

        do{
            System.out.print("Enter a positive number: ");
            input = scanner.nextInt();
            scanner.nextLine();
       
        }while(input<0);

        int[] fiboArray = new int[input];

        fiboArray[0]= 0;
        fiboArray[1]= 1;

        for(int i =0; i<fiboArray.length; i++){

            if(i>1){

                fiboArray[i] = fiboArray[i-1] + fiboArray[i-2];

            }else if(i==0) fiboArray[i] = 0;
            else fiboArray[i] = 1;
        
        output += fiboArray[i] + ",";

        }

       System.out.println(output + "\b ");

    }
}