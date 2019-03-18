package com.company;

public class ExcelentPupil extends Pupil{
    @Override
    public void Read() {
        super.Read();
        System.out.println("A lot");
    }

    @Override
    public void Write() {
        super.Write();
        System.out.println("A lot");
    }

    @Override
    public void Relax() {
        super.Relax();
        System.out.println("A little");
    }

    @Override
    public void Study() {
        super.Study();
        System.out.println("Excellent");

    }


    public ExcelentPupil(String name) {
        super(name);
    }
}
