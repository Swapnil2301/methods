import java.util.Scanner;
public class Nesting {
    int length;
    int breath;
    int height;
    public int perimeter(int length,int breath,int height){
        return 4*(length * breath * height );
    }
    public int area(int length,int breath,int height){
        return 2*(length * breath + breath * height + height * length);
    }
    public int volume(int length,int breath,int height){
        return (length * breath * height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Breath:  ");
        int breath = sc.nextInt();
        System.out.print("Enter Height: ");
        int height = sc.nextInt();
        Nesting swap = new Nesting();
        System.out.println("Volume is " + swap.volume(length,breath,height));

    }
}
