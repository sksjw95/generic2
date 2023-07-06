package generic1;

public class Main2 {
    public static void main(String[] args){
        // generic클래스를 인스턴스화 할때 어떠한 타입도 지정해 줄수있다. 즉, 타입을
        // 지정하는데 있어 제한이 없다.
        Basket2<Rose> roseBasket2 = new Basket2<>();
        Basket2<RosePasta> rosePastaBasket2 = new Basket2<>();
    }
}
