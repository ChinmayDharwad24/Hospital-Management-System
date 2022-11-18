/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.House;

import Hospital.City.City;
import Hospital.Community.Community;
import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class HouseDirectory {
    
    private ArrayList<House> houseList;
    
    public HouseDirectory(){
        houseList = new ArrayList<House>();
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    public House addHouse(){
        House newHouse = new House();
        houseList.add(newHouse);
        return newHouse;
    }
    
    public void deleteHouse(House hou){
        houseList.remove(hou);
    }
    
    public String[] houseArray(){
        String[] ho = new String[houseList.size()+1];
        ho[0] = "---Select---";
        int count = 1;
        for (House h: houseList){
            ho[count] = h.getHouseNo();
            count++; 
        }
        return ho;
    }
    
     public boolean uiqueHouseId(int id) {

        for (House h: houseList) {

            if (id == h.getHouseId()) {
                return false;
            }
        }
            return true; 
    } 
}
