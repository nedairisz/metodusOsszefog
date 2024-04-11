
package metodusosszefoglalo;

public class Alakzatok {

    public static void main(String[] args) {
        negyzetTeruletKerulet();
        teglalapTeruletKerulet();
        haromszogTeruletKerulet();
    }

    private static void negyzetTeruletKerulet() {
        int oldalHossz = 5;
        int terulet = negyzetTerulet(oldalHossz);
        int kerulet = negyzetKerulet(oldalHossz);
        kiir("Négyzet területe: " + terulet + ", kerülete: " + kerulet + "\n");
    }

    private static int negyzetTerulet(int oldalHossz) {
        return oldalHossz * oldalHossz;
    }

    private static int negyzetKerulet(int oldalHossz) {
        return 4 * oldalHossz;
    }

    private static void teglalapTeruletKerulet() {
        int a = 4;
        int b = 6;
        int terulet = teglalapTerulet(a, b);
        int kerulet = teglalapKerulet(a, b);
        kiir("Téglalap területe: " + terulet + ", kerülete: " + kerulet + "\n");
    }

    private static int teglalapTerulet(int a, int b) {
        return a * b;
    }

    private static int teglalapKerulet(int a, int b) {
        return 2 * (a + b);
    }

    private static void haromszogTeruletKerulet() {
        int oldalHossz = 5;
        int terulet = haromszogTerulet(oldalHossz);
        int kerulet = haromszogKerulet(oldalHossz);
        kiir("Egyenlő oldalú háromszög területe: " + terulet + ", kerülete: " + kerulet + "\n");
    }

    private static int haromszogTerulet(int oldalHossz) {
        // Egyenlő oldalú háromszög területe: (a^2 * sqrt(3)) / 4
        return (int) ((Math.pow(oldalHossz, 2) * Math.sqrt(3)) / 4);
    }

    private static int haromszogKerulet(int oldalHossz) {
        return 3 * oldalHossz;
    }

    static void kiir(String uzenet){
        System.out.print(uzenet);
    }
}