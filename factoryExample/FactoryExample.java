package factoryExample;
public class FactoryExample {
    //private static FactoryExample instance = new FactoryExample();
    private FactoryExample(){};
    //public static FactoryExample getInstance(){
      //  return instance = new FactoryExample();
    //}
    public static Car getCar(int vitesse){
        if (vitesse>60){
            return new CarA();
        }else{
        return new CarB();}
    }
    
    
}
