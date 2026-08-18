package OOPs.Day_5.Box_prgms;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double weight) {
        this.weight = weight;
    }
    @Override
     void show(){
        System.out.println("hai");
    }
    
    public BoxWeight( double l, double w, double h, double weight) {
        super(l,w,h); // calls the parent class constructor and 
        // it is used to assign the values present in  parent class 
        this.weight = weight;
    }
    
    
    
}
