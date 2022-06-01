package findSumOfHousesWithManyChildren;

import java.util.HashMap;
import java.util.HashSet;

public class Test 
{
    HashMap<Integer, HashSet<String>> children;
    
    //constructor
    public Test()
    {
        children = new HashMap<Integer, HashSet<String>>();
    }
    
    public void moreThan3Children(){
        
        HashSet<Integer> housesWithMoreThan3 = new HashSet<Integer>();
        
        int houses = 0;
        
        for(Integer aHouse : children.keySet()) {
            if (children.get(aHouse).size() >= 3) {
                housesWithMoreThan3.add(aHouse);
            }
        }
        houses = housesWithMoreThan3.size();
        
        if(houses > 0) {
            System.out.println(houses + " houses have three or more children");
        } else {
            System.out.println("No houses have three or more children");
        }
    }
    
    
     public void moreThan3Children2(){
        
        int countHouses = 0;
        
        for(Integer aHouse : children.keySet()) {
            if (children.get(aHouse).size() >= 3) {
                countHouses++;
            }
        }
        
        if(countHouses > 0) {
            System.out.println(countHouses + " houses have three or more children");
        } else {
            System.out.println("No houses have three or more children");
        }
    }
     
     public void getHouseNumber() {
    	 for(Integer aHouse : children.keySet()) {
    		 System.out.println(aHouse);
    	 }
     }
       
}
