package com.company;

public class BadPupil extends Pupil {
    @Override
    public void Read() {
        super.Read();
        System.out.println("A little");
    }

    @Override
    public void Write() {
        super.Write();
        System.out.println("A little");
    }

    @Override
    public void Relax() {
        super.Relax();
        System.out.println("A lot");
    }

    @Override
    public void Study() {
        super.Study();
        System.out.println("Bad");


    }



    public BadPupil(String name) {
        super(name);
    }
}
