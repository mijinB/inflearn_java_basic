package final1;

public class ConstructInit {
    // final 변수 선언만 했을 경우, 생성자에서만 초기화 가능
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }
}
