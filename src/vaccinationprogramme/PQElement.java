/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationprogramme;

/**
 * PQElement.java
 * @author Aaron
 * 27/03/2021
 */
public class PQElement {
    private int key;
    private VaccinationRecipients element;
    
    public PQElement(int priority, VaccinationRecipients e){
        key = priority;
        element = e;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public VaccinationRecipients getElement() {
        return element;
    }

    public void setElement(VaccinationRecipients element) {
        this.element = element;
    }

    public String printVaccinationRecipients() {
        String message;
        message = ("| Name = "+ element.getName()+ " | Age = "+ element.getAge() +" | Medical Condition = "+ element.getCondition());
        return message;
    }
    
}
