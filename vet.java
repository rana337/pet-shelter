package model;

import java.util.ArrayList;
import java.util.List;

public class vet extends person {
    private int YearsOfExperience;

    public List<Display_pets> pets = new ArrayList<>();


    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int YearsOfExperience) {
        this.YearsOfExperience = YearsOfExperience;
    }
}
