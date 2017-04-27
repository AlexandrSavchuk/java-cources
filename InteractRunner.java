import java.util.Scanner;
import java.math.BigDecimal;

public class InteractRunner {
   
   private static Scanner reader = new Scanner (System.in);

   private static String getArgument(){
      System.out.println("Enter arg");
      String arg2 = reader.next();        
      return arg2;
   }

   private static String getMathOperation(){
      System.out.println("Enter math operation");
      String oper = reader.next();
      return oper;
   }

   public static void main (String[] args){

      try{
         Calculator calculator = new Calculator();
         String exit = "no";
         int cnt = 0;
         String arg = "0";
         while (!exit.equals("exit")){
            //init first arg
            if (cnt == 0){             
               calculator.add(new BigDecimal(getArgument())); 
               cnt ++;
            }
            String oper = getMathOperation();
            if (oper.equals("+")){
               calculator.add(new BigDecimal(getArgument()));
            } 
            else if (oper.equals("-")){
               calculator.sub(new BigDecimal(getArgument()));
            }
            else if (oper.equals("*")){
               calculator.mult(new BigDecimal(getArgument()));
            } 
            else if (oper.equals("/")){
               calculator.div(new BigDecimal(getArgument()));
            }
            System.out.println("Result = " + calculator.getResult());            
            System.out.println("Enter command: exit/clear");
            exit = reader.next();
            if (!exit.equals("exit")){
               if (exit.equals("clear")){
                  calculator.cleanResult();
                  cnt = 0;
               }
               exit = "no";
            }
         }
     }
     finally{
         reader.close();
     }
   }
}