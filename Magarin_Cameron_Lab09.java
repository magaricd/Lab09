import java.util.Random;
import java.util.Scanner;
public class Magarin_Cameron_Lab09 {
   
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Random rnd= new Random();
        Scanner in = new Scanner(System.in);
       //task 1A
       int [] dataPoints = new int[100]; //index 0-99

       //task 1B
       for(int x = 0; x < dataPoints.length; x++){//traversal loop for the array
            dataPoints[x] = rnd.nextInt(100) + 1; //initializes array to 1 - 100
       }

       //task 1C
       for(int x = 0; x < dataPoints.length; x++){
        System.out.printf("%2d" + " | ", dataPoints[x]  ); //displays array values between "|" 
        }
        System.out.println(" ");//creates a barrier between the displayed array and any other programs for easier reading

        //task 1D
        int dataSum = 0;
        int dataAvg = 0;
        for(int x = 0; x < dataPoints.length; x++){
            dataSum += x;
        }
        dataAvg = dataSum / dataPoints.length; // dataAvg stores the value of dataSum divided by the size of the array
        System.out.println ("The sum of dataPoints is " + dataSum);
        System.out.println ("The average of DataPoints is " + dataAvg);

        //task 2A
        int arrayChoice = 0;//holds the users input value
        arrayChoice = SafeInput.getRangedInt(in, "Please choose a number between 1 and 100 ", 1 , 100);

        //task 2B
        boolean choiceFound = false;
        for(int x = 0; x < dataPoints.length; x++){
        
            if(dataPoints[x] == arrayChoice){
                choiceFound = true;// ensures program runs if users input value appears multiple times
                System.out.println(arrayChoice + " has been found at " + x);
            }
        }
        if(!choiceFound){
            System.out.println(arrayChoice + " is not in this array! ");
        }

        //task 2C
        int arrayDecision = 0;
        arrayDecision = SafeInput.getRangedInt(in, "Please choose a number between 1 and 100 ", 1 , 100);
        for(int x = 0; x < dataPoints.length; x++){
            if(dataPoints[x] == arrayDecision){
                System.out.println(arrayDecision + " has been found at " + x);
                break;
            }

        }
        if(!choiceFound){
            System.out.println(arrayDecision + " is not in this array! ");
        }

        //task 2D
        int arrayMin = 0;
        int arrayMax = 0;
        for(int x = 0; x < dataPoints.length; x++){
            if(arrayMin > dataPoints[x]){
                arrayMin = dataPoints[x];
            }
            if(arrayMax < dataPoints[x]){
                arrayMax = dataPoints[x];
            }
        }
        System.out.println("The minimum value of the array is " + arrayMin);
        System.out.println("The maximum value of the array is " + arrayMax);

        //task 2E
        System.out.println("Average of dataPoints is: " +SafeInput.getAverage(dataPoints));
    }
}
