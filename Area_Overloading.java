
public class Area_Overloading {
    public static int area(int l,int b){
        return l*b;
    }
    public static double area(int r){
        return (3.14 * (r*r));
    }

    public static void main(String[] args) {
        Area_Overloading swap = new Area_Overloading();
        System.out.println(swap.area(3));
    }
}
