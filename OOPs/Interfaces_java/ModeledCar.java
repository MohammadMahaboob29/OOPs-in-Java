package OOPs.Interfaces_java;

public class ModeledCar {
    private Engine engine;
    private Media player=new CDPlayer();
    public ModeledCar(){ // constructor to invoke specific engine of a car
        engine=new ElectricEngine(); // engine type defined like petrol or electric class engine
    }
    public void start(){
        engine.start(); // respective car engine starts
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void Upgradeengine(Engine engine){
        this.engine= new PowerCar();
    }


    
}
