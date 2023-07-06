package generic1;

public class Basket3<T extends Flower>{
    // 제네릭의 타입 매개변수를 다음과 같이 작성하면 Basket3클래스를 인스턴스화할때 타입으로
    // Flower클래스의 하위 클래스만 지정하도록 제한됩니다.
    private T item;

    public T getItem(){
        return item;
    }
    public void setItem (T item){
        this.item = item;
    }
}
