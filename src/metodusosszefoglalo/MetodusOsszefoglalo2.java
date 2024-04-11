
package metodusosszefoglalo;

public class MetodusOsszefoglalo2 {

    public static void main(String[] args) {
        muveletek(); 
    }

    private static void muveletek() {
        nehanyOsszeadKonzolon();
        egyKivonasKonzolon();
    }

    private static void nehanyOsszeadKonzolon() {
        osszeadas2Szammal();
        osszeadas3Szammal();
        osszedasTombbel();
    }

    private static void osszeadas2Szammal() {
        int a = 3;
        int b = 4;
        //System.out.println(a+"+"+b+"="+(a+b));
        int osszeg =osszeadas(a,b);
        String kimenet = (a+"+"+b+"="+osszeg);
        kiir(kimenet+"\n");
    }
    
    private static void osszeadas3Szammal() {
        verzio1();
        verzio2();
        verzio3();
    }
    
    static void osszedasTombbel() {
        int[] szamok=new int[]{1,2,3,4,5};
        int osszeg = osszeadas(szamok);
        String kimenet = egyenletKeszito(szamok);
        kiir(kimenet+"=" + osszeg+"\n");
    }
    
    static void verzio1(){
        int a = 3;
        int b = 4;
        int c = 7;
        int osszeg =osszeadas(a,b);
        osszeg = osszeadas(osszeg, c);
        String kimenet = egyenletKeszito(new int[]{a,b,c});
        //kiir(a+"+"+b+"+"+c+"="+osszeg);
        kiir(kimenet+"="+osszeg+"\n");
    }
    
    static void verzio2(){
        int a = 3, b=3, c=7;
        int osszeg =osszeadas(a, osszeadas(++b, ++c));
        //String kimenet = a+"+"+b+"+"+c+"="+osszeg;
        String kimenet = egyenletKeszito(new int[]{a,b,c});
        kiir(kimenet+"="+osszeg+"\n");
    }
    
    static void verzio3(){
        int a = 3;
        int b = 4;
        int c = 7;
        int osszeg = osszeadas(++a,b,++c);
        //kiir(a+"+"+b+"+"+c+"="+osszeg);
        String kimenet = egyenletKeszito(new int[]{a,b,c});
        kiir(kimenet+"="+osszeg+"\n");
    }
    
    private static int osszeadas(int a, int b) {
        //int osszeg= a+b;
        //return osszeg;
        /* 2 v 3 paraméter esetén megvalósító lgika*/
        //return a+b; // megvalósíó logika
        //return osszeadas(a, b, 0);// logika hívása
        
        /*tömbe setén hívjuk a megvalósító logikát*/
        return osszeadas(new int[]{a, b});
    }
    private static int osszeadas(int a, int b, int c) {
        //return a+b+c;// megvalósíó logika
        return osszeadas(a, osszeadas(b, c));
    }
    
    static int osszeadas(int[] tomb){
        int osszeg=0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg+= tomb[i];
        }
        return osszeg;
    }
    
    private static void kivanas2Szammal() {
        int a = 3;
        int b = 4;
        int[] tomb= new int[2];
        //System.out.println(a+"-"+b+"="+(a-b));
        kiir(a+"-"+b+"="+(a-b));
        String kimenet = egyenletKeszito(tomb, "-");
        kiir(kimenet + "="+ kivonas(a,b)+"\n");
    }
    
    private static void egyKivonasKonzolon() {
        kivanas2Szammal();
    }

    static int kivonas(int a, int b){
        return a-b;
    }
    
    static void kiir(String uzenet){
        System.out.print(uzenet);
    }

    private static String egyenletKeszito(int[] tomb, String sep) {
       String gy =tomb[0]+"";
        for (int i = 1; i < tomb.length; i++) {
            gy+= sep + tomb[i];
        }
       //return gy+"=";
       return gy;
    }

    private static String egyenletKeszito(int[] tomb) {
       return egyenletKeszito(tomb, "+");
    }
}
