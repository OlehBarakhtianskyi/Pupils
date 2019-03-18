package com.company;

public class ClassRoom {
    Pupil pupil1;
    Pupil pupil2 ;
    Pupil pupil3;
    Pupil pupil4;

    public ClassRoom(String pupil1, String pupil2, String pupil3, String pupil4) {
        this.pupil1 = new BadPupil(pupil1);
        this.pupil2 = new GoodPupil(pupil2);
        this.pupil3 = new ExcelentPupil(pupil3);
        this.pupil4 = new Pupil(pupil4);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "\n pupil1=" + pupil1 +
                ",\n pupil2=" + pupil2 +
                ",\n pupil3=" + pupil3 +
                ",\n pupil4=" + pupil4 +
                '}';
    }
}
