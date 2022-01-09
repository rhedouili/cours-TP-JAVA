public  class SingleTonExample {
    private  int distance;
    private static SingleTonExample instance ;
    private SingleTonExample(int value){
        this.distance = value;
    };
    public static SingleTonExample setValueToObject(int value){
        if (instance == null){
            instance = new SingleTonExample(value);
        }
        return instance;

    }
    public static void main(String[] args) {
        SingleTonExample example = new SingleTonExample(20);
        System.out.println(example.distance);
    }
    
}
