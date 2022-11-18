/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.City;

import Hospital.Community.Community;
import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class CityDirectory {
    
   private ArrayList<City> cityList;
   
   public CityDirectory(){
       cityList = new ArrayList<City>();
   }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
   
    public City addCity(){
        City newCity = new City();
        cityList.add(newCity);
        return newCity;
    }
    
    public void deleteCity(City ct){
        cityList.remove(ct);
        
    }
    
    public String[] cityArray(){
        String[] city = new String[cityList.size()+1];
        city[0] = "---Select---";
        int count = 1;
        for (City c: cityList){
            city[count] = c.getCityName();
            count++; 
        }
        return city;
    }
    
    public String[] stateArray(){
        String[] state = new String[cityList.size()+1];
        state[0] = "---Select---";
        int count = 1;
        for (City c: cityList){
            state[count] = c.getState();
            count++; 
        }
        return state;
    }
    
    public String[] countryArray(){
        String[] country = new String[cityList.size()+1];
        country[0] = "---Select---";
        int count = 1;
        for (City c: cityList){
            country[count] = c.getCountry();
            count++; 
        }
        return country;
    }
    
    public boolean uiqueCityId(int id) {

        for (City c: cityList) {

            if (id == c.getCityId()) {
                return false;
            }
        }
            return true; 
    } 
}
