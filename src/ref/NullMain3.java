package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        // bigData.data = new Data();                                          ← 이렇게 bigData의 data 값에 참조값을 준다면 nullPointerException 발생하지 않는다.
        System.out.println("bigData.count = " + bigData.count);             // 0
        System.out.println("bigData.data = " + bigData.data);               // null

        System.out.println("bigData.data.value = " + bigData.data.value);   // nullPointerException
    }
}
