package final2;

public class FinalFieldMain {

    public static void main(String[] args) {
//        final 필드 - 생성자 초기화
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(10);
        
        System.out.println("constructInit1.value : "+ constructInit1.value);
        System.out.println("constructInit1.value : "+ constructInit2.value);
        
//        final 필드 - 필드에서 초기화
        System.out.println("필드 초기화");

        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println("fieldInit1.value : "+ fieldInit1.value);
        System.out.println("fieldInit1.value : "+ fieldInit2.value);
        System.out.println("fieldInit1.value : "+ fieldInit3.value);

        //상수
        System.out.println("상수");
        System.out.println("FieldInit.CONST_VALUE : "+ FieldInit.CONST_VALUE);
    }
}//class
