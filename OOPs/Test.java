package OOPs;

public class Test {
    static int count=0;
     Test(){
        count++;
    }
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        System.out.println(t1.count + " " +t2.count + " " + t3.count);
        
    }
    
}
