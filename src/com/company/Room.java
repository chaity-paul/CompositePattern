package com.company;

public class Room implements IStructure{
    private String name;
    public Room(String name){
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("You have entered the room "+ name);
    }

    @Override
    public void exit() {
        System.out.println("You have exited from the room " + name);

    }

    @Override
    public void location() {
        System.out.println("You are currently in the " + name + " room");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int type() {
        return 0;
        // 0 indicating leaf node.
    }
}
