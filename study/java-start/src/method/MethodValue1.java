package method;

public class MethodValue1 {


    public static void main(String[] args) {
        int num1=5;
        System.out.println("1. 변경 전 num1: " + num1);
        changeNumber(num1);
        System.out.println("4. 변경 후 num1 "+ num1);
    }

    public static void changeNumber(int num2) {
        System.out.println("2. 변경 전 num2: "+ num2);
        num2 = num2 *2;
        System.out.println("3. 변경 후 num2: "+ num2 );
    }//changeNumber()
}//class
