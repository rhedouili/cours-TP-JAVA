package factoryExample;

public class UseFactory {
    public static void main(String[] args) {
        Car newCar = FactoryExample.getCar(30);
        newCar.getModele();        
        Car newCar2 = FactoryExample.getCar(90);
        newCar2.getModele();        
        
    }
    
}
