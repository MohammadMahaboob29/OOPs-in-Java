package OOPs.Interfaces_java;
// this class is for music functionalities
public class CDPlayer implements Media{
    
     @Override
    public void start(){
        System.out.println("start the music Tauba tauba");
    }
    @Override
    public void stop(){
        System.out.println("stop the music");
    }
}
