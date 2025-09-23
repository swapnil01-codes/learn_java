
public class Final {

    public static void main(String[] args) {
        final int myNum = 15;
        double Num = (double) myNum;  // Explicit cast (optional, implicit works too)
        System.out.println("Original int (final): " + myNum);
        System.out.println("After casting to double: " + Num);
    }
}
