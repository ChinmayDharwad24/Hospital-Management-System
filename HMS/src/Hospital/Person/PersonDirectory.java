/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Person;

import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class PersonDirectory {
    
    private ArrayList<Person> PersonList;
    
    public PersonDirectory(){
        this.PersonList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return PersonList;
    }

    public void setPersonList(ArrayList<Person> PersonList) {
        this.PersonList = PersonList;
    }
    
    
}
