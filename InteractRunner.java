import java.util.Scanner;
import java.math.BigDecimal;

public class InteractRunner {
   public static void main (String[] args){
      Scanner reader = new Scanner (System.in);
      try{
         Calculator calculator = new Calculator();
         String exit = "no";
         int cnt = 0;
         String arg = "0";
         while (!exit.equals("yes")){
            if (cnt == 0){             
               System.out.println("Enter first arg");
               arg = reader.next();
            }
            System.out.println("Enter math operation");
            String oper = reader.next();
            if (oper.equals("+")){
               cnt ++;
               if (cnt == 1){ 
			      System.out.println("arg=" + arg);
                  calculator.add(new BigDecimal(arg));
               }
               System.out.println("Enter second arg");               
               String arg2 = reader.next();
               calculator.add(new BigDecimal(arg2));
            } else if (oper.equals("-"))
            {
               cnt ++;
               if (cnt == 1){ 
                  calculator.add(new BigDecimal(arg));
               }
               System.out.println("Enter second arg");               
               String arg2 = reader.next();
               calculator.sub(new BigDecimal(arg2));
            } else if (oper.equals("*"))
            {
               cnt ++;
               if (cnt == 1){ 
                  calculator.add(new BigDecimal(arg));
               }
               System.out.println("Enter second arg");               
               String arg2 = reader.next();
               calculator.mult(new BigDecimal(arg2));
            }
            System.out.println("Result = " + calculator.getResult());            
            //calculator.cleanResult();
            System.out.println("Exit: yes/no");
            exit = reader.next();
         }
      }
      finally{
         reader.close();
      }
   }
}