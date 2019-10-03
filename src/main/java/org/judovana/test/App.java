package org.judovana.test;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        output(create(readArgs(args)));
    }

    static int readArgs(String[] args) {
        int i = 5;
        if (args.length > 0) {
            i = Integer.valueOf(args[0]);
        }
        return i;
    }

    private static void output(Magican m) {
        m.printSetup(System.out);
        m.printMagic(System.out);
    }

    public static Magican create(int i) {
        Magican m = new Magican(i);
        return m;
    }
}
