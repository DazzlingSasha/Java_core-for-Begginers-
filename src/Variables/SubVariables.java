package Variables;

/**
 * Created by Splayd on 23.11.2016.
 */
public class SubVariables {
    String s;
    int i;
    boolean b;
    float f;
    double d;
    char c;
    byte aByte;
    short aShort;
    long l;

    SubVariables (String ss, int ii, boolean bb, float ff, double dd, char cc, byte aByte, short aShort, long ll) {
        s = ss;
        i = ii;
        b = bb;
        f = ff;
        d = dd;
        c = cc;
        this.aByte = aByte;
        this.aShort = aShort;
        l = ll;
    }
}
