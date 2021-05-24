package com.example.mode.建造者模式;
//director
public class PersonDirector {
    private PersonBuilder pb;
    public PersonDirector(PersonBuilder pb){
        this.pb = pb;
    }
    public void CreatePerson(){
        pb.BuildHead();
        pb.BuildBody();
        pb.BuildArmLeft();
        pb.BuildArmRight();
        pb.BuildLegLeft();
        pb.BuildLegRight();
    }
}
