public class CS225D_CABOT {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a+b;
        int difference = a-b;
        int product = a*b;
        int quotient = a/b;
        int remainder = a%b;

        System.out.println();

        System.out.println("Arithemtic Operators:");
        System.out.println("Sum: " + a + " + " + b + " = " + sum);
        System.out.println("Difference: " + a + "-" + b + " = " + difference);
        System.out.println("Product: " + a + "*" + b + " = " + product);
        System.out.println("Quotient: " + a + "/" + b + " = " + quotient);
        System.out.println("Remainder: " + a + "%" + b + " = " + remainder);

        System.out.println();

        System.out.println("Increment and Decrement: ");
        System.out.println("Increment: " + ++a);
        System.out.println("Before Increment: " + a);
        System.out.println("Decrement: " + --a);

        System.out.println();

        System.out.println("Logical Operators ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.print("Is a equal to b? ");
        System.out.println(a==b);
        System.out.print("Is a not equal to b? ");
        System.out.println(a!=b);
        System.out.print("Is a greater than b? ");
        System.out.println(a>b);
        System.out.print("Is a less than b? ");
        System.out.println(a<b);

        System.out.println();

        System.out.println("Modulo Operator:");
        System.out.println("Is 'a' even or odd? ");
        System.out.println("a = " + a);

        if(a % 2 == 0) {
            System.out.println("a is even");
        }
        else {
            System.out.println("a is odd");
        }

        System.out.println();

        System.out.println("Is 'b' even or odd? ");
        System.out.println("b = " + b);

        if(b % 2 == 0) {
            System.out.println("b is even");
        }
        else {
            System.out.println("b is odd");
        }
    }
}
