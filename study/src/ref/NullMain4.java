package ref;

public class NullMain4 {

    public static void main(String[] args) {

        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count"+bigData.count);
        System.out.println("bigData.data"+bigData.data);

//        bigData.data이 null이므로 NullPointerException 발생
        System.out.println(bigData.data.value);
    }
}
