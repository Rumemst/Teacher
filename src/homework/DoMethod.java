package homework;

public class DoMethod {

//return type with parameter
 public int Dosummation() {
     int a=10;
     int b=20;
     int summation=a+b;
     System.out.println(summation);
     return summation;
 };
 //return type with parameter
    public int DoMultiply(int newnum1,int newnum2){
        int num1=newnum1;
        int num2=newnum2;
        int Multiply=num1*num2;
        System.out.println(Multiply);
        return Multiply;
    }
    public void fullname (){
        String fname="mst";
        String lname="rume";
        String fullname=fname+lname;
        System.out.println(fullname);
    }






    public static void main(String[] args) {
DoMethod obj=new DoMethod();
obj.Dosummation();
  obj.DoMultiply(20,30)  ;
  obj.fullname();
    }

}
