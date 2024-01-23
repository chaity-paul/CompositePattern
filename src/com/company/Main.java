package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Room room = new Room("216-A");
        Housing floor_1 = new Housing("4th science 1st floor");
        int incubator = floor_1.addStructure(room);
        Housing building = new Housing("4th science building.");
        int flore_index = building.addStructure(floor_1);

        // structure created

        // structure travas

        building.enter();
        building.location();
        Housing fist_floor = (Housing)building.getStructure(flore_index);
        fist_floor.enter();
        fist_floor.location();

        IStructure incubatorRoom = fist_floor.getStructure(incubator);
        incubatorRoom.enter();
        incubatorRoom.location();
        incubatorRoom.exit();
        fist_floor.exit();
        building.exit();

    }
}
