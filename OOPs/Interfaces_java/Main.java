package OOPs.Interfaces_java;

public class Main {
    public static void main(String[] args) {
        Car c=new Car();
        Brake.career();
        
        // c.acc(); --> for a single car all operations in 1 file
        // c.stop(); --> for a single car all operations in 1 file
        // c.start(); --> for a single car all operations in 1 file
        // c.brake(); --> for a single car all operations in 1 file
        Media carMedia=new Car();
        carMedia.stop(); // we have to stop media player of a car
        //but when media type .stop(); applied then its stopping the car not the media player
        // reason as evrything functionality written in single class.
        CDPlayer music=new CDPlayer();
        music.stop(); // for CDPlayer class it calls.

        ModeledCar m=new ModeledCar();
        // m.ModeledCar();
        m.startMusic();
        m.stopMusic();
        m.stop();
        m.start();
        m.acc();
        m.Upgradeengine(c);
        // m.Upgradeengine("ElectricEngine"); // here,Engine in the template not defined with type.
        m.start();


    }
    
}
