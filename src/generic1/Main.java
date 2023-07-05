package generic1;

public class Main {
    public static void main(String[] args) {

        //Basket<String> basket1 = new Basket<String>("기타 줄");
        //System.out.println(basket1.getItem());

        /*  wrapper class
        Integer num = new Integer(17);
        int n = num.intValue();
        System.out.println(n);

        Character ch = 'x'; //오토박싱 Charter ch = new Character('x');
        //System.out.println(ch);
        char c = ch; // 오토언박싱 char c = ch.charValue();
        System.out.println(c);

        Integer num1 = new Integer(7);// 박싱
        Integer num2 = new Integer(3); //박싱

        int int1 = num1.intValue(); //언박싱
        int int2 = num2.intValue(); // 언박싱

        Integer result1 = num1 + num2;
        Integer result2 = int1 - int2;
        int result3 = num1 * int2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        Integer a = new Integer(10);
        Integer b = new Integer(20);
        Integer d = new Integer(10);

        // 래퍼 클래스도 객체이므로 동등 연산자(==)를 사용하게 되면,
        // 두 인스턴스의 값을 비교하는 것이 아니라 두 인스턴스의 주소값을 비교하게 됩니다.
        System.out.println(a < b);
        System.out.println(a == d);
        System.out.println(a.equals(d));

          wrapper class*/

        Basket<Integer> basket2 = new Basket<Integer>(1);
        System.out.println(basket2.getItem());
        Basket<Boolean> basket3 = new Basket<Boolean>(true);
        System.out.println(basket3.getItem());
        Basket<Double> basket4 = new Basket<Double>(3.14);
        System.out.println(basket4.getItem());
    }
}