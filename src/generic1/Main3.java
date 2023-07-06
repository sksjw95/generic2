package generic1;

public class Main3 {
    public static void main(String[] args){
        // 제네릭의 타입 매개변수를 다음과 같이 작성하면 Basket3클래스를 인스턴스화할때 타입으로
        // Flower클래스의 하위 클래스만 지정하도록 제한됩니다.
        Basket3<Rose> roseBasket2 = new Basket3<>();
        Basket3<RosePasta> rosePastaBasket2 = new Basket3<>();//에러발생
    }
}
