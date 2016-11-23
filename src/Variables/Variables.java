package Variables;

/**
 * Created by Splayd on 23.11.2016.
 */
public class Variables {
    public static void main(String[] args) {

        SubVariables subVariables = new SubVariables("String", 6, true, 2.0f, 4.0, 'c', (byte)10 , (short)5 , 8);

        System.out.println(subVariables.s);
        System.out.println(subVariables.i);
        System.out.println(subVariables.b);
        System.out.println(subVariables.f);
        System.out.println(subVariables.d);
        System.out.println(subVariables.c);
        System.out.println(subVariables.aByte);
        System.out.println(subVariables.aShort);
        System.out.println(subVariables.l);

    }
}
