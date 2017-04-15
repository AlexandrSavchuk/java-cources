import java.util.Scanner;

public class InteractRunner {
   public static void main (String[] args){
      Scanner reader = new Scanner (System.in);
      try{
         Calculator calculator = new Calculator();
         String exit = "no";
         int cnt = 0;
         while (!exit.equals("yes")){
            System.out.println("Enter first arg");
            String arg = reader.next();
            System.out.println("Enter math operation");
            String oper = reader.next();
            if (oper =="+"){
               cnt ++;
               if (cnt == 1){ 
                  System.out.println("Enter second arg");               
                  String arg2 = reader.next();
                  calculator.add(Integer.valueOf(arg), Integer.valueOf(arg2));
               } else {
                 calculator.add(calculator.getResult(), Integer.valueOf(arg));
               }
            } else if (oper =="-")
            {
               cnt ++;
               if (cnt == 1){ 
                  System.out.println("Enter second arg");               
                  String arg2 = reader.next();
                  calculator.sub(Integer.valueOf(arg), Integer.valueOf(arg2));
               } else {
                 calculator.sub(calculator.getResult(), Integer.valueOf(arg));
               }
            }
            System.out.println("Result = " + calculator.getResult());            
            calculator.cleanResult();
            System.out.println("Exit: yes/no");
            exit = reader.next();
         }
      }
      finally{
         reader.close();
      }
   }
}