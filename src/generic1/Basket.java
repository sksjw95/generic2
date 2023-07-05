package generic1;

public class Basket<T>{
    private T item;

    public Basket(T item){
        this.item = item;
    }
    public T getItem(){
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }
}
