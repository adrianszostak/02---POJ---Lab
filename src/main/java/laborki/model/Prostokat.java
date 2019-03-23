package laborki.model;
/**
 * @author Rafał Sochacki 20047
 * @author Adrian Szostak 19777
 *
 * Class to build a rectangle and do some math
 */
public class Prostokat {
    private int dlugosc;
    private int szerokosc;

    public Prostokat(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public int pole() {
        return dlugosc * szerokosc;
    }

    public int obwod() {
        return 2*dlugosc + 2*szerokosc;
    }

    public double przekatna(){
        return Math.sqrt((dlugosc*dlugosc) + (szerokosc*szerokosc));
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

}
