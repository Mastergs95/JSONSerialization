package com.skillsoft.jsonparsing;

public class CommitteeBean {

    private String name;
    private int numMembers;

    public CommitteeBean(){
    }

    public CommitteeBean(String name,int numMembers){
        this.name=name;
        this.numMembers=numMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }
}
