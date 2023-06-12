/* The DrivableMap class, which is a map that contains a HashMap;
 * mapping Strings to Drivable objects. (similar to python dictionaries)
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* DONE: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */
    public boolean addDrivable(String id, Drivable drivable) {
        if (!drivable_map.containsKey(id)) { // checks for absence of key in map
            drivable_map.put(id, drivable); // adds it to the map if not there
            return true; // indicates it's been added
        }
        return false; // indicates it hasn't been added
    }


    /* DONE: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     */
    public boolean hasFasterThan(int speed) {
        // converted into an ArrayList
        List<Drivable> drivableList = new ArrayList<>(drivable_map.values());
        for (int i = 0; i < drivableList.size(); i++) { // iterates
            Drivable drivable = drivableList.get(i); // gets drivable objects
            if (drivable.getMaxSpeed() >= speed) { // does speed comparison
                return true;
            }
        }
        return false;
    }


    /* DONE: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */
    public List<Tradable> getTradable() {
        // ArrayList of all Drivable obj from Hashmap
        List<Drivable> dList = new ArrayList<>(drivable_map.values());
        // ArrayList to store all Tradable objects
        List<Tradable> tList = new ArrayList<>();
        for (int i = 0; i < dList.size(); i++) { // iterates through
            Drivable drivable = dList.get(i); // gets drivable obj
            if (drivable instanceof Tradable) { // checks if it's Tradable
                tList.add((Tradable) drivable); // adds appropriate obj to tList
            }
        }
        return tList;
    }
}
