/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Patient;

import Hospital.Person.Person;

/**
 *
 * @author chinm
 */
public class Patient extends Person{
    private int patientId;
    private String house;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    
    @Override
    public String toString(){
        String patId = String.valueOf(patientId);
        return patId;
    }
      
      
}
