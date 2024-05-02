package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress address1 = new ImmutableAddress("서울");
        ImmutableAddress address2 = address1; //참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);

        address2 = new ImmutableAddress("부산");
        System.out.println("부산 -> address2");
        System.out.println("address1 = " + address1);
        System.out.println("address2 = " + address2);
    }
}
