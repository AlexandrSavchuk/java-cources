import java.math.BigDecimal;

/**
����� ��������� �����������
*/
public class Calculator {
    /**
    ��������� ����������
    */
    private BigDecimal result = BigDecimal.ZERO;
    /**
    �������� ��������
    @param params ������� ��������� 
    */
    public void add (BigDecimal ... params){
       for(BigDecimal param:params){
          this.result=this.result.add(param);
       }
    }
    /**
    �������� ���������
    @param params ������� ��������� 
    */
    public void sub (BigDecimal ... params){
       for(BigDecimal param: params){
          this.result=this.result.subtract(param);
       }
    }
    /**
    �������� ���������
    @param param ������� ��������� 
    */
    public void mult (BigDecimal param){
          this.result=this.result.multiply(param);
    }
    /**
    �������� �������
    @param param ������� ��������� 
    */
    public void div (BigDecimal param){
          if (param.signum() == 0){
             System.out.println("�� ���� ������ ������");
          } 
          else {
          this.result=this.result.divide(param);
          }
    }
    /**
    ������� ��������� ����������
    @return ��������� ����������
    */
    public BigDecimal getResult(){
       return this.result;
    }
    /**
    �������� ���������
    */
    public void cleanResult(){
       this.result = BigDecimal.ZERO;
       System.out.println("Result clean!");
    }
}