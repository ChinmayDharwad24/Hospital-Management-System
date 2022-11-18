/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Community;

import Hospital.City.City;
import Hospital.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class CommunityDirectory {
    
    private ArrayList<Community> communityList;

    
    public CommunityDirectory(){
        communityList = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community addCommunity(){
        Community newComm = new Community();
        communityList.add(newComm);
        return newComm;
    }
    
    public void deleteCommunity(Community comm){
        communityList.remove(comm);
    }
    
    public String[] commArray(){
        String[] comm = new String[communityList.size()+1];
        comm[0] = "---Select---";
        int count = 1;
        for (Community c: communityList){
            comm[count] = c.getCommunityName();
            count++; 
        }
        return comm;
    }
    
    public boolean uiqueCommunityId(int id) {

        for (Community c: communityList) {

            if (id == c.getCommunityId()) {
                return false;
            }
        }
            return true; 
    } 
}
