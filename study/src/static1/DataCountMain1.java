package static1;

import static1.Data1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("data1.count = " + data1.count);

        Data1  data2 = new Data1("B");
        System.out.println("data1.count = " + data2.count);

        Data1  data3 = new Data1("C");
        System.out.println("data1.count = " + data3.count);

    }
}//class
