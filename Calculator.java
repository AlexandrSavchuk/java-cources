/**
Класс реализует калькулятор
*/
public class Calculator {
    /**
    Результат вычисления
    */
    private int result;
    /**
    Операция сложения
    @param params входные параметры 
    */
    public void add (int ... params){
       for(Integer param:params){
          this.result +=param;
       }
    }
    /**
    Операция вычитания
    @param params входные параметры 
    */
    public void sub (int ... params){
       for(Integer param: params){
          this.result -=param;
       }
    }
    /**
    Операция умножения
    @param params входные параметры 
    */
    public void mult (int param){
          this.result *=param;
    }
    /**
    Операция деления
    @param params входные параметры 
    */
    public void div (int param){
          if (param == 0){
             System.out.println("На ноль делить нельзя");
          } 
          else {
          this.result /=param;
          }
    }
    /**
    Вернуть результат вычислений
    @return результат вычисления
    */
    public int getResult(){
       return this.result;
    }
    /**
    Очистить результат
    */
    public void cleanResult(){
       this.result = 0;
    }
}