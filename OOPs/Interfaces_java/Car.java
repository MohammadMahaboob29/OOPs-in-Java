package OOPs.Interfaces_java;

public class Car implements Engine,Media,Brake{
    @Override
    public void start(){
        System.out.println("starting bmw car");
    }
    @Override
    public void stop(){
        System.out.println("stoping bmw car");
    }
    @Override
    public void acc(){
        System.out.println("accelarating  bmw car");
    }
    @Override
    public void brake(){
        System.out.println("brakes applied for bmw car");
    }
    
}
