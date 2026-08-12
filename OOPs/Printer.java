package OOPs;

public class Printer {
    void print(String s){
        System.out.println("String "+ s);
    }
    void print(Object s){
        System.out.println("Object "+ s);
    }
    void print(Integer s){
        System.out.println("Intger "+ s);
    }
    public static void main(String[] args) {
        new Printer().print(null);
    }
    
}
