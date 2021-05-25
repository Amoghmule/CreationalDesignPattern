package com.abstractFactory;

public class ProfessionFactory extends AbstractFactory{


    @Override
    Profession getProfession(String profession) {
        if (profession==null || profession.isEmpty()) return null;


        if (profession.equalsIgnoreCase("engineer"))
            return  new Engineer();
        else if(profession.equalsIgnoreCase("teacher"))
            return new Teacher();

        return null;
    }
}
