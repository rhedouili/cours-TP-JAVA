package factoryExample;

public class UseFactory {
    public static void main(String[] args) {
        FactoryExample newFactory = new FactoryExample();
        Car newCar = newFactory.getCar(30);
        newCar.getModele();        
        
    }
    
}
