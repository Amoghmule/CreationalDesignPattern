package com.prototype;

import java.util.Hashtable;

public class ProfessionCache {

    private static Hashtable<Integer,Profession> professionHashtable=new Hashtable<>();


    public static Profession getClonedNewProfession(int id){
        Profession p=professionHashtable.get(id);
        return (Profession) p.cloningMethod();
    }

    public  static  void loadCache(){
        Doctor d=new Doctor();
        d.id=1;
        professionHashtable.put(d.id,d);

        Engineer e=new Engineer();
        e.id=2;
        professionHashtable.put(e.id,e);

        Teacher t=new Teacher();
        t.id=3;
        professionHashtable.put(t.id,t);
    }

}
