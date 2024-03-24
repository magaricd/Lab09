import java.util.Scanner;
public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt){
        String retString = "";// Set this to zero length. Loop run until it isnt
            do{
                System.out.print("\n" +prompt +": ");//show prompt add space
                retString=pipe.nextLine();
            }while(retString.length()==0);
            return retString;
    }

    public static int GetInt(Scanner pipe, String prompt){
        int favInt = 0;
        System.out.print("\n" +prompt +": ");
            if(pipe.hasNextInt()){
                favInt = pipe.nextInt();
                return favInt;
            }
            else{
                System.out.print("Invalid value");
                return favInt;
            }
        
            

    }

    public static double GetDouble(Scanner pipe, String prompt){
        double favDouble = 0;
        System.out.println("\n" +prompt +": ");
            if(pipe.hasNextDouble()){
               favDouble = pipe.nextDouble();
               return favDouble;
            }
            else{
                System.out.print("Invalid value");
                return favDouble;
            }
        
            

    }


    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        int result = 0;
        boolean done = false;
        
            do{//loops until parameters are met
                System.out.print(prompt + "[" + low + "-" + high + "]");
                if(pipe.hasNextInt()){//checks if initial value is valid
                    result = pipe.nextInt();
                    pipe.nextLine();
                    if(result >= low && result <= high){//checks if initial value is also within range
                        done = true;
                    }
                    else{//runs if initial value is valid but out of range
                        System.out.println("value is out of range");
                    }
                
                }
                else{//runs if initial value is invalid
                    System.out.println("You must enter an integer value");
                }
            }while(!done);
            return result;   
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        double result = 0;
        boolean done = false;

            do{//loops until parameters are met
                System.out.print(prompt + "[" + low + "-" + high + "]");
                if(pipe.hasNextDouble()){//checks if initial value is valid
                    result = pipe.nextInt();
                    pipe.nextLine();
                    if(result >= low && result <= high){//checks if initial value is also within range
                        done = true;
                    }
                    else{//runs if initial value is valid but out of range
                        System.out.println("value is out of range");
                    }
                
                }
                else{//runs if initial value is invalid
                    System.out.println("You must enter an integer value");
                }
            }while(!done);
            return result;   
    }

    public static boolean getYNConfirm (Scanner pipe, String prompt){
        boolean done = false;
        boolean answer = false;
        int finalAnswer = 0;//holds value for answer to compare
        int confirmAnswer = 1;//compares to answer for positive
        int denyAnswer = 2;//compares to answer for negatve

        System.out.print(prompt + " 1 for yes or 2 for no");
        finalAnswer = pipe.nextInt();
        do{
        if(finalAnswer == confirmAnswer){
            answer = true;
            done = true;
            return answer;
        }
        else if(finalAnswer == denyAnswer){
            answer = false;
            done = true;
            return answer;
        }
        else{
            System.out.println("Invalid answer");
            done = true;
            return answer;
        }
      }while(!done);

    }

    public static double getAverage(int value[]){
        int result = 0;
        int arraySum = 0;
        for(int x = 0; x < value.length; x++){
            arraySum += x;
        }
        result = arraySum / value.length;
        return result;
    }
        
}
