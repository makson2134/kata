package com.company.students;

public class Aspirant extends Student {
    private String researchName;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String researchName) {
        super(firstName, lastName, group, averageMark);
        this.researchName = researchName;
    }

    @Override
    public int calculateGrants() {
        if (getAverageMark() == 5) {
            return 200;
        } else if (getAverageMark() > 4 && getAverageMark() < 5) {
            return 180;
        }
        return 0;
    }

    public String getResearchName() {
        return researchName;
    }

    public void setResearchName(String researchName) {
        this.researchName = researchName;
    }
}
