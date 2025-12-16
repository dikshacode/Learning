package generic;

public class JavaGenerics {
    public static void main(String[] args){
        Test<Integer> itest = new Test<>(10);
        System.out.println(itest);

        Test<String> iString = new Test<>("Diksha");
        System.out.println(iString);
    }
}
