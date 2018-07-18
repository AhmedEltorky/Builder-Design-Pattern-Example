package builderdesignpattern;

/**
 *
 * @author Ahmed El-Torky
 */
//large object
public class Pizza {

    private String t;  // first part
    private String s;  // second part
    private String d;  // third part
    private String f;  // forth part

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public void eatPizza() {
        System.out.println("T = " + getT());
        System.out.println("S = " + getS());
        System.out.println("D = " + getD());
        System.out.println("F = " + getF());
        System.out.println("------------------------");
    }
}
