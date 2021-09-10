package com.example.wttech.basicrestapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Unit {
    
    @Id
    String Name;
    String Civilization;
    String Building;
    int Time;
    int Food;
    int Coin;
    int Wood;
    int Health;
    int RangeResist;
    int MeleeResist;
    int Speed;
    int LOS;
    int Pop;
    int MeleeDam;
    int HIMul;
    double LIMul;
    double CavMul;
    double MRate;
    int RangedDam;
    int R_HIMul;
    double R_LIMul;
    double R_CavMul;
    int R_HCavMul;
    double RRate;
    int RRange;
    int Bounty;
    int SiegeDam;
    int SRange;
    double SRate;
    String Comments;

    /*
    TODO: Fix these!
     */

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
