package org.judovana.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i = 5;
        if (args.length > 0) {
            i = Integer.valueOf(args[0]);
        }
        Magican m = new Magican(i);
        m.printSetup(System.out);
        m.printMagic(System.out);
    }
}
