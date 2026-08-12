package OOPs.Interfaces_java;

public class ElectricEngine implements Engine {
    @Override
    public void start(){
        System.out.println("start the electric car.");
    }
    @Override
    public void stop(){
        System.out.println("stop the electric car.");
    }
    @Override
    public void acc(){
        System.out.println("acclearte the electric car.");
    }
    
}
