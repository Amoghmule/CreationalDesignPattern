package com.prototype;

public class Tester {

    public static void main(String[] args) {
     ProfessionCache.loadCache();

     Profession d= ProfessionCache.getClonedNewProfession(2);
     d.print();
     System.out.println(d);


     Profession e=ProfessionCache.getClonedNewProfession(2);
     e.print();
     System.out.println(e);

    }
}
