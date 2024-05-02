package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitSplit = fruits.split(",");
        for (String string : fruitSplit) {
            System.out.println(string);
        }

        String joinStr = String.join("->", fruitSplit);
        System.out.println(joinStr);
    }
}
