package generic1;

public class Main2 {
    public static void main(String[] args){
        Basket2<Flower> flowerBasket2 = new Basket2<>();
        flowerBasket2.setItem(new Rose()); // 다형성 적용
        flowerBasket2.setItem(new RosePasta()); //에러발생
    }
}
