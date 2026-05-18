public class Demo {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int x = 8;
        int y = 5;
        int z = 6;

        if(x>y && x>z){
            System.out.println("x is the greatest number");
        }
        else if(y>x && y>z){
            System.out.println("y is the greatest number");
        }
        else{
            System.out.println("z is the greatest number");
        }

        evenOdd(x);

        printDayOfWeek(3);
    }

    public static void evenOdd(int num) {
        // if(num % 2 == 0) {
        //     System.out.println("The number is even.");
        // } else {
        //     System.out.println("The number is odd.");
        // }

        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println("The number is " + result + ".");
    }

    public static void printDayOfWeek(int day) {
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
    }
}