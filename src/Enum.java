// here, we can declare enum type inside or outside of class. and enum is kind of set up a group,
// in this group, you can have many different types of data, and give this group a name Color,
// and notice that, for instance variable declared in main method, its type is Color.


enum Color {
    RED, GREEN, YELLOW, WHITE;
}


public class Enum {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        System.out.println("practice enum");
    }
}
