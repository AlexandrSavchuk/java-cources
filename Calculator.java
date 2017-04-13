/**
Класс реализует калькулятор
*/
public class Calculator {
    /**
    Результат вычисления
    */
    private int result;
    /**
    Операция суммирования
    @param params входные параметры 
    */
    public void add (int ... params){
       for (Integer param:params){
          this.result +=param;
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