package OOPs.Day_5.Box_prgms;

public class Main {
    public static void main(String[] args) {
        Box b7=new Box(3);
        Box b1=new Box(5,4,1);
        BoxWeight b2=new BoxWeight(1,2,3,4);
        // System.out.println(b1.l + " " + b1.w + " " + b1.h);
        System.out.println(b2.l + " " + b2.w + " " + b2.h + " " + b2.weight);

        Box b3=new BoxWeight(1,2,3,4);
        // System.out.println(b3.weight); // can't access weight

        /*Reason :- BoxWeight is Object class have Superclass + subclass properties
         b3 is the ref var of type Superclass Box , which have only parent class properties.
        
         here the ref to obj class is assigned to the superclass ref var hence we can 
         access only those objects which are defined in the superclass.
         */


        // BoxWeight b4= new Box();
        //  BoxWeight b4= new Box(1,2,3);
             /* here obj is superclass and ref var is trying access properties of 
             subclass (BoxWeight) 
             see here object is itself a parent class type then how will 
             you call the child constructor.
         
         Note:- A parent class doesn't cares about child class properies
        but a child class does
         */
        Box b=new BoxWeight(1,2,3,4);
        b.show(); // This will call the overridden show() method in BoxWeight
    }
}
 