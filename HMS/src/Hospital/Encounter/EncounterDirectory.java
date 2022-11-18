/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Encounter;

import Hospital.Community.Community;
import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class EncounterDirectory {
    
    private ArrayList<Encounter> encounterList;
    
    public EncounterDirectory(){
        encounterList = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public Encounter addEncounter(){
        Encounter newEn = new Encounter();
        encounterList.add(newEn);
        return newEn;
    }
    
    public void deleteEncounter(Encounter en){
        encounterList.remove(en);
    }
    
    public boolean uiqueEncounterNo(String id) {

        for (Encounter e : encounterList) {

            if (id == e.getEncounterNo()) {
                return false;
            }
        }
            return true; 
    } 
    
    public String[] enArray(){
        String[] en = new String[encounterList.size()+1];
        en[0] = "---Select---";
        int count = 1;
        for (Encounter e: encounterList){
            en[count] = e.getEncounterNo();
            count++; 
        }
        return en;
    }
}
