package org.judovana.test;

import java.io.PrintStream;
import java.util.*;

public class Magican {

    private final Collection<Integer> list1;
    private final Collection<Integer> list2;
    private final Random rnd = new Random();

    public Magican(int l) {
        list1 = new ArrayList<Integer>(l);
        list2 = new ArrayList<Integer>(l);
        for (int x = 0; x < l; x++) {
            list1.add(rnd.nextInt(l));
            list2.add(rnd.nextInt(l));
        }
    }

    public void printSetup(PrintStream p){
        p.println("l1:");
        print(p, list1);
        p.println("l2:");
        print(p, list2);
    }

    private static void print(PrintStream p, Collection<Integer> c) {
        for(Integer i: c){
            p.println(""+i);
        }
    }

    public Set<Integer> getMagic(){
        return common(cut(list1),cut(list2));
    }

    public void printMagic(PrintStream p){
        Set<Integer> r = getMagic();
        p.println("r:");
        print(p, r );
    }

    static Set<Integer> common(Collection<Integer> l1, Collection<Integer> l2) {
        Set<Integer> d1 = findShared(l1, l2);
        Set<Integer> d2 = findShared(l2, l1);
        return merge(d1,d2);
    }

    private static Set<Integer> merge(Collection<Integer> l1, Collection<Integer> l2) {
        Set<Integer> r = new HashSet<>();
        r.addAll(l1);
        r.addAll(l2);
        return r;
    }

    static Set<Integer> findShared(Collection<Integer> l1, Collection<Integer> l2) {
        Set<Integer> r = new HashSet<>();
        for(Integer i1: l1){
            for(Integer i2: l2){
                if (i2 == i1){
                    r.add(i1);
                    break;
                }
            }
        }
        return r;
    }

    static List<Integer> cut(final Collection<Integer> orig) {
        List l = new ArrayList(orig);
        l.sort(new MagicComparator());
        l.remove(0);
        l.remove(l.size()-1);
        return l;
    }


}
