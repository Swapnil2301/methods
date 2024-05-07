public class Object_calculator {
    int counter =0;
    public Object_calculator(){
        this.counter =counter;
    }
    public void cal(){
        counter++;
    }

    public static void main(String[] args) {
        Object_calculator swap = new Object_calculator();
        swap.cal();
        swap.cal();
        swap.cal();
        System.out.println(swap.counter);
    }
}
