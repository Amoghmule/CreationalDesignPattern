package com.factory;



public class ProfessionFactory {

    public Profession getProfession(String profession){
        if (profession==null || profession.isEmpty()) return null;

        if (profession.equalsIgnoreCase("doctor"))
            return new Doctor();
        else if (profession.equalsIgnoreCase("engineer"))
            return  new Engineer();
        else if(profession.equalsIgnoreCase("teacher"))
            return new Teacher();

        return null;
    }

}
