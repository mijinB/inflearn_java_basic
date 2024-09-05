package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        // 다운캐스팅을 자동으로 하지 않는 이유
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();               // 문제 없음

        Parent parent2 = new Parent();      // 부모 타입으로 객체가 생성되기 때문에 메모리 상에 자식 타입은 존재하지 않는다. 따라서 다운캐스팅 불가
        Child child2 = (Child) parent2;     // 런타임 오류
        child2.childMethod();               // 실행 불가

        /* 이렇게 자식 타입이 존재하지 않는데 다운캐스팅을 하려는 위험이 있기 때문에 자동으로 되지 않는 것이다.
        자식 타입의 인스턴스를 생성하게 되면 모든 부모 클래스이 함께 만들어지기 때문에 업캐스팅은 위같은 위험이 존재하지 않아 자동으로 되는 것이다. */
    }
}
