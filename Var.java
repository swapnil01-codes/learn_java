
class Var {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int x, y, z;
        int i = 100, j = 200, k = 300;
        System.out.println(i + j + k); // 600
        x = y = z = 50;
        System.out.println(x + y + z); // 150
        String fname = "Swapnil";
        String lname = "Desai";
        String fullname = fname + " " + lname;
        System.out.println(fullname);
        System.out.println(fname + lname);
        int Num;
        char myLetter = 'D';
        boolean myBool = !true;
        int p = 3, q = 10;
        System.out.println("Total is: " + p + q);
        System.out.println(p + q);
        System.out.println("The sum is: " + (p + q));
        // Num=10;
        Num = 20;//Num is now 20
        final int Number = 100;//constant variable
        // Number=200;//error Cannot assign value to final variable Number
        System.out.println(Number);
        System.out.println("The value of Num is: " + Num);
        String name = "Swapnil";
        System.out.println("Hello I'm " + name);
        System.out.println("The sum is: " + c);
        System.out.println(myLetter);
        System.out.println("The value of myBool is: " + !myBool);
        System.out.println("The value of myLetter is: " + myLetter);
    }
}
