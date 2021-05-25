package com.abstractFactory;

public class TraineeProfessionFactory extends AbstractFactory{


    @Override
    Profession getProfession(String profession) {
        if (profession==null || profession.isEmpty()) return null;


        if (profession.equalsIgnoreCase("engineer"))
            return  new TraineeEngineer();
        else if(profession.equalsIgnoreCase("teacher"))
            return new TraineeEngineer();

        return null;
    }
}
