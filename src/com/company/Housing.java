package com.company;

import java.util.ArrayList;

public class Housing implements IStructure{
    // onek gula kore structure thakbe.

    private ArrayList<IStructure> structures;
    private String address;
    public Housing(String address){
        structures = new ArrayList<>();
        this.address = address;
    }
    int addStructure(IStructure structure){
        structures.add(structure); // koy number structure seta return korbo
        return structures.size() - 1;
    }
    IStructure getStructure(int structureId){
        return structures.get(structureId); // kono number id te kon structure ache seita return korbo
    }
    @Override
    public void enter() {
        System.out.println("You have entered " + address);
    }

    @Override
    public void exit() {
        System.out.println("You have left " + address);
    }

    @Override
    public void location() {
        System.out.println("You are currently in " + address);

    }

    @Override
    public String getName() {
        return address;
    }

    @Override
    public int type() {
        return 1;
    }
}
