import java.math.BigDecimal;

/**
Класс реализует калькулятор
*/
public class Calculator {
    /**
    Результат вычисления
    */
    private BigDecimal result = BigDecimal.ZERO;
    /**
    Операция сложения
    @param params входные параметры 
    */
    public void add (BigDecimal ... params){
       for(BigDecimal param:params){
          this.result=this.result.add(param);
       }
    }
    /**
    Операция вычитания
    @param params входные параметры 
    */
    public void sub (BigDecimal ... params){
       for(BigDecimal param: params){
          this.result=this.result.subtract(param);
       }
    }
    /**
    Операция умножения
    @param param входные параметры 
    */
    public void mult (BigDecimal param){
          this.result=this.result.multiply(param);
    }
    /**
    Операция деления
    @param param входные параметры 
    */
    public void div (BigDecimal param){
          if (param.signum() == 0){
             System.out.println("На ноль делить нельзя");
          } 
          else {
          this.result=this.result.divide(param);
          }
    }
    /**
    Вернуть результат вычислений
    @return результат вычисления
    */
    public BigDecimal getResult(){
       return this.result;
    }
    /**
    Очистить результат
    */
    public void cleanResult(){
       this.result = BigDecimal.ZERO;
       System.out.println("Result clean!");
    }
}