package org.judovana.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Magican m = new Magican(5);
        m.printSetup(System.out);
        m.printMagic(System.out);
    }
}
