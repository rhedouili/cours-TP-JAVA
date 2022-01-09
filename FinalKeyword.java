public class FinalKeyword {
    public final static int a = 2;
    private  static FinalKeyword instance  ;
    private FinalKeyword(){}
    public static FinalKeyword setObject(){
        if (instance == null){
            instance = new FinalKeyword();
        }
        return instance;
    }

    
    public static void main(String[] args) {
        //System.out.println(("Hello"));
        //FinalKeyword obj1 = new FinalKeyword();
        //FinalKeyword.a=1;
        System.out.println((FinalKeyword.a));
        
    }
    
}
