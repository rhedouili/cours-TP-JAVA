package factoryExample;
public class FactoryExample {
    public Car getCar(int vitesse){
        if (vitesse>60){
            return new CarA();
        }else{
        return new CarB();}
    }
    
    
}
