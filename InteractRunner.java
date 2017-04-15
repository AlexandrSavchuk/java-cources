import java.util.Scanner;

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
                  calculator.add(Integer.valueOf(arg));
               }
               System.out.println("Enter second arg");               
               String arg2 = reader.next();
               calculator.add(Integer.valueOf(arg2));
            } else if (oper.equals("-"))
            {
               cnt ++;
               if (cnt == 1){ 
                  calculator.add(Integer.valueOf(arg));
               }
               System.out.println("Enter second arg");               
               String arg2 = reader.next();
               calculator.sub(Integer.valueOf(arg2));
            } else if (oper.equals("*"))
            {
               cnt ++;
               if (cnt == 1){ 
                  calculator.add(Integer.valueOf(arg));
               }
               System.out.println("Enter second arg");               
               String arg2 = reader.next();
               calculator.mult(Integer.valueOf(arg2));
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