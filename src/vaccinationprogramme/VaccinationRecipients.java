/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationprogramme;

/**
 * VaccinationRecipients.java
 * @author Aaron
 * 27/03/2021
 */
public class VaccinationRecipients {
    // Variables
    private String name;
    private int age;
    private String condition;
    
    // Constructor
    public VaccinationRecipients(){
        name = new String();
        age = 0;
        condition = new String();
    }

    // Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


    
    
    
    
}
