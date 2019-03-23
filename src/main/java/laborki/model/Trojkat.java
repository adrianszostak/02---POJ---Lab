package laborki.model;
/**
 * @author Rafał Sochacki 20047
 * @author Adrian Szostak 19777
 *
 * Class to build a triangle and do some math
 */
public class Trojkat {
    private int bokA;
    private int bokB;
    private int bokC;

    public Trojkat(int bokA, int bokB, int bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    public Trojkat() {
    }

    public double poleTrojkata(){
        double polowaObwodu = ((bokA + bokB + bokC)/2);
        double pole = Math.sqrt(polowaObwodu*(polowaObwodu-bokA)*(polowaObwodu-bokB)*(polowaObwodu-bokC));
        return pole;
    }

    public int obwodTrojkata() {
        return bokA + bokB + bokC;
    }
        //czy trojkat jest rownoboczny
    public boolean isEquilateral(){
       if (bokA == bokB && bokA == bokC && bokB== bokC){
           return true;
       } else
           return false;
    }

    //rownoramienny
    public boolean isLsosceles() {
        if(bokA == bokC) {
            return true;
        } else if (bokA == bokB) {
            return true;
        } else if (bokB == bokC) {
            return true;
        }else
            return false;
    }

    //roznoramienny
    public boolean isScalene(){
        if(bokA != bokB && bokA != bokC && bokB != bokC){
            return true;
        } else
            return false;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public int getBokC() {
        return bokC;
    }

    public void setBokC(int bokC) {
        this.bokC = bokC;
    }
}
