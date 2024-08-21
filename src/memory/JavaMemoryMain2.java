package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        // 메서드를 다 돌고 main으로 다시 돌아왔을 때, data1 인스턴스를 더 이상 참조하는 곳이 없기 때문에 힙 영역에서 제거된다. (가비지 컬렉션이 제거)
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    private static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end");
    }
}
