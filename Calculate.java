public class Calculate {
   public static void main (String[] args){
      System.out.println("Calculate...");
      int a = Integer.valueOf(args[0]);
      int b = Integer.valueOf(args[1]);
      int sum = a + b;
      System.out.println("Sum of " + a + " and "+ b +" = " + sum);
   }
}