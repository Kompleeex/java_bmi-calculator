package metodusok;

public class Metodusok {
    private static void ujabbvalami(){}
    private static void valami(){
        System.out.println("Csinaltam valamit");
        ujabbvalami();
    }
    
    public static void main(String[] args) {
        valami();
    }
    
}
