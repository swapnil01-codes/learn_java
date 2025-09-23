
class Identifier {

    //All Java variables must be identified with unique names.These unique names are called identifiers.
    String name = "Swapnil";
    int age = 24;
    String city = "Pune";
    // Invalid identifiers:
//int 2ndNumber = 5;  // Cannot start with a digit
//int my var = 10;    // Cannot contain spaces
//int int = 20;       // Cannot use reserved keywords

    public static void main(String[] args) {
        int minutesPerHour = 60;
        int m = 60;
        Identifier obj = new Identifier();
        System.out.println("My name is: " + obj.name);
        System.out.println("My age is: " + obj.age);
        System.out.println("I live in: " + obj.city);
        System.out.println(m);
        System.out.println(minutesPerHour);
    }
}
