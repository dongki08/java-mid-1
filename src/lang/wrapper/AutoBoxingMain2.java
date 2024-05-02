package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //오토 박싱(Auto-boxing)

        //Wrapper -> Primitive
        int unBoxedValue = boxedValue; //오토 언박싱(Auto-Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unBoxedValue = " + unBoxedValue);
    }
}
