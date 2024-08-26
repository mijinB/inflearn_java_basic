package final1;

public class FieldInit {
    // final 변수 선언과 초기화를 동시에 했을 경우, 생성자에서 변경 불가
    static final int CONTST_VALUE = 10;
    final int value = 10;

    /*public FieldInit(int value) {
        this.value = value;
    }*/
}
