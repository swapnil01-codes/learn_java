public class Examples {
    int items=5;
    float cost=10.5f;
    char grade='A';
    float totalCost=items*cost;
    char currency='$';
    public static void main(String[] args) {
        Examples Obj=new Examples();
        System.out.println("Number of items are: "+Obj.items);
        System.out.println("Cost of each item is: "+Obj.cost);
        System.out.println("Total cost is: "+Obj.totalCost);
        System.out.println("Grade is: "+Obj.grade);
        System.out.println("Currency is: "+Obj.currency);
   System.out.println("Total cost is:"+Obj.totalCost+Obj.currency);
   
   
   
   
    }
}
