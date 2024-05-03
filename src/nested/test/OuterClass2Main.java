package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 innerClass = new OuterClass2();
        OuterClass2.InnerClass innerClass1 = innerClass.new InnerClass();
        innerClass1.hello();
    }
}
