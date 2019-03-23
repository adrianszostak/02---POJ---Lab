package laborki.model;

/**
 * @author Rafał Sochacki 20047
 * @author Adrian Szostak 19777
 *
 * Class to convert a word with Cesar code
 */

public class Cezar {
    private String slowo;
    private int przesuniecie;

    public Cezar(String slowo, int przesuniecie) {
        this.slowo = slowo;
        this.przesuniecie = przesuniecie;
    }

    public Cezar() {
    }

    public int getPrzesuniecie() {
        return przesuniecie;
    }

    public void setPrzesuniecie(int przesuniecie) {
        this.przesuniecie = przesuniecie;
    }

    public String getSlowo() {
        return slowo;
    }

    public void setSlowo(String slowo) {
        this.slowo = slowo;
    }

    public Cezar(String slowo) {
        this.slowo = slowo;
    }

    public String szyfrowanie() {

        char[] szyfrowane = slowo.toCharArray();

        for(int i = 0; i != szyfrowane.length; i++) {
            int n = szyfrowane[i];
            n += przesuniecie;
            szyfrowane[i] = (char)n;
        }

        return new String(szyfrowane);

    }

}
