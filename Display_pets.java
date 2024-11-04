package model;

import java.util.ArrayList;
import java.util.List;

public class Display_pets {
    private String name;
    private String petId;
    private String petType;
    private int age;
    private String adoptionStatus;
    private String readyForAdoptionStatus;
    private String treatmentStatus;
    public Display_pets [] pets = new Display_pets[20];

    public Display_pets() {

    }

    public Display_pets(String name, String  petId, String petType, int age, String adoptionStatus,
                        String readyForAdoptionStatus, String treatmentStatus) {
        this.name = name;
        this.petId = petId;
        this.petType = petType;
        this.age = age;
        this.adoptionStatus = adoptionStatus;
        this.readyForAdoptionStatus = readyForAdoptionStatus;
        this.treatmentStatus = treatmentStatus;
    }

    // Getters and setters for properties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(String adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    public String isReadyForAdoptionStatus() {
        return readyForAdoptionStatus;
    }

    public void setReadyForAdoptionStatus(String readyForAdoptionStatus) {
        this.readyForAdoptionStatus = readyForAdoptionStatus;
    }
    public String getReadyForAdoptionStatus() {
        return readyForAdoptionStatus;
    }

    public String getTreatmentStatus() {
        return treatmentStatus;
    }

    public void setTreatmentStatus(String treatmentStatus) {
        this.treatmentStatus = treatmentStatus;
    }

    public static List<Display_pets> getPetsList() {
        List<Display_pets> petsList = new ArrayList<>();

        petsList = new ArrayList<>();

        petsList.add(new Display_pets("Fluffy", "1", "Dog", 3, "Available", "Ready", "Treated"));
        petsList.add(new Display_pets("Whiskers", "2", "Cat", 2, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Mickey", "3", "Dog", 1, "Available", "Ready", "Treated"));
        petsList.add(new Display_pets("Roy", "4", "Cat", 1, "Adopted", "Not Ready", "Treated"));
        petsList.add(new Display_pets("Simba", "5", "Dog", 1, "Available", "Ready", "Treated"));
        petsList.add(new Display_pets("Martin", "6", "Cat", 1, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Moslo", "7", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("lala", "8", "Cat", 1, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Mando", "9", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("Tom", "10", "Cat", 1, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Jerry", "11", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("Timon", "12", "Cat", 1, "Adopted", "Not Ready", "Treated"));
        petsList.add(new Display_pets("Bomba", "13", "Dog", 1, "Available", "Ready", "Treated"));
        petsList.add(new Display_pets("Scar", "14", "Cat", 1, "Adopted", "Not Ready", "Treated"));
        petsList.add(new Display_pets("Poe", "15", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("bahr", "16", "Cat", 1, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Bambi", "17", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("Panda", "18", "Cat", 1, "Adopted", "Not Ready", "Treated"));


        return petsList;
    }




}
