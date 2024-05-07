import java.util.Scanner;
public class Rectangle_triangle {
    int length;
    int breath;
    public Rectangle_triangle(){
        this.length = length;
        this.breath =breath;
    }
    public int rectangle(int length, int breath){
        return length * breath;
    }public double triangle(int length, int breath ){
        return 0.5 * length * breath;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value: ");
        int first = sc.nextInt();
        System.out.println("Enter Second Value: ");
        int second = sc.nextInt();
        Rectangle_triangle swap = new Rectangle_triangle();
        System.out.println("Area of Rectangle is " + swap.rectangle(first,second));
        System.out.println("Area of Triangle is " + swap.triangle(first,second));
    }
}