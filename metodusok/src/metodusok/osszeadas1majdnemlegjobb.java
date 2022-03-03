package metodusok;

public class osszeadas1majdnemlegjobb {
        static int szam1 = 3;
        static int szam2 = 5;
    public static void main(String[] args) {

        int eredmeny = elsoszam();
        eredmenykiir();
        
        int masikeredmeny = elsoszam();
        eredmenykiir();
    }
    
    
    static int elsoszam(){
        return szam1 + szam2;
    }

    
    
    private static void eredmenykiir() {
        System.out.println("--------------");
        System.out.printf(" %d + %d %d\n", szam1, szam2, elsoszam() );
    }

}