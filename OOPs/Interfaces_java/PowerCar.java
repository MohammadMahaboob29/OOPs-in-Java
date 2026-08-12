package OOPs.Interfaces_java;

public class PowerCar implements Engine{
    @Override
    public void start(){
        System.out.println("start the power car.");
    }
    @Override
    public void stop(){
        System.out.println("stop the power car.");
    }
    @Override
    public void acc(){
        System.out.println("acclearte the power car.");
    }
}
