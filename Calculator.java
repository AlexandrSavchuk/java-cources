/**
����� ��������� �����������
*/
public class Calculator {
    /**
    ��������� ����������
    */
    private int result;
    /**
    �������� ��������
    @param params ������� ��������� 
    */
    public void add (int ... params){
       for(Integer param:params){
          this.result +=param;
       }
    }
    /**
    �������� ���������
    @param params ������� ��������� 
    */
    public void sub (int ... params){
       for(Integer param: params){
          this.result -=param;
       }
    }
    /**
    �������� ���������
    @param params ������� ��������� 
    */
    public void mult (int param){
          this.result *=param;
    }
    /**
    �������� �������
    @param params ������� ��������� 
    */
    public void div (int param){
          if (param == 0){
             System.out.println("�� ���� ������ ������");
          } 
          else {
          this.result /=param;
          }
    }
    /**
    ������� ��������� ����������
    @return ��������� ����������
    */
    public int getResult(){
       return this.result;
    }
    /**
    �������� ���������
    */
    public void cleanResult(){
       this.result = 0;
    }
}