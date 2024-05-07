import java.util.Scanner;
public class Calculator {
    public static double getinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        double num = sc.nextDouble();
        return num;
    }
    public static double add(double x,double y ){
        double result = x+y;
        return result;
    }

    public static void main(String[] args) {
        double x = getinput();
        double y =getinput();
        System.out.println("Result is " + add(x,y));
    }
}
