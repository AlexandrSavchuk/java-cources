import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import java.math.BigDecimal;



public class CalculatorTest {

public static void main(String[] args) throws Exception {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(CalculatorTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
}
   @Test
   public void testAdd() {
      // Тестируемый класс
      Calculator calculator = new Calculator();
      // Проверяемый метод
	  calculator.cleanResult();
	  calculator.add(new BigDecimal(2));
	  calculator.add(new BigDecimal(2));
          System.out.println("Result = " +calculator.getResult());
      assertEquals("2 + 2 must be 4", new BigDecimal(4), calculator.getResult());
   }
}