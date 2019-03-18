package com.company;

public class GoodPupil extends Pupil {
    @Override
    public void Read() {
        super.Read();
        System.out.println("Sometimes");
    }

    @Override
    public void Write() {
        super.Write();
        System.out.println("Sometimes");
    }

    @Override
    public void Relax() {
        super.Relax();
        System.out.println("A lot");
    }

    @Override
    public void Study() {
        super.Study();
        System.out.println("Well");


    }


    public GoodPupil(String name) {
        super(name);
    }

}
