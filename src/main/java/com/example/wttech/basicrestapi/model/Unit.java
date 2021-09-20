package com.example.wttech.basicrestapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Unit {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    String name;
    String Civilization;
    String Building;
    double Time;
    double Food;
    double Coin;
    double Wood;
    double Health;
    double RangeResist;
    double MeleeResist;
    double Speed;
    double LOS;
    double Pop;
    double MeleeDam;
    double HIMul;
    double LIMul;
    double CavMul;
    double MRate;
    double RangedDam;
    double R_HIMul;
    double R_LIMul;
    double R_CavMul;
    double R_HCavMul;
    double RRate;
    double RRange;
    double Bounty;
    double SiegeDam;
    double SRange;
    double SRate;
    String Comments;

    /*
    TODO: Fix these!
     */

    public Unit(String name, String civilization, String building, double time, double food, double coin, double wood, double health, double rangeResist, double meleeResist, double speed, double LOS, double pop, double meleeDam, double HIMul, double LIMul, double cavMul, double MRate, double rangedDam, double r_HIMul, double r_LIMul, double r_CavMul, double r_HCavMul, double RRate, double RRange, double bounty, double siegeDam, double SRange, double SRate, String comments) {
        this.name = name;
        Civilization = civilization;
        Building = building;
        Time = time;
        Food = food;
        Coin = coin;
        Wood = wood;
        Health = health;
        RangeResist = rangeResist;
        MeleeResist = meleeResist;
        Speed = speed;
        this.LOS = LOS;
        Pop = pop;
        MeleeDam = meleeDam;
        this.HIMul = HIMul;
        this.LIMul = LIMul;
        CavMul = cavMul;
        this.MRate = MRate;
        RangedDam = rangedDam;
        R_HIMul = r_HIMul;
        R_LIMul = r_LIMul;
        R_CavMul = r_CavMul;
        R_HCavMul = r_HCavMul;
        this.RRate = RRate;
        this.RRange = RRange;
        Bounty = bounty;
        SiegeDam = siegeDam;
        this.SRange = SRange;
        this.SRate = SRate;
        Comments = comments;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Civilization='" + Civilization + '\'' +
                ", Building='" + Building + '\'' +
                ", Time=" + Time +
                ", Food=" + Food +
                ", Coin=" + Coin +
                ", Wood=" + Wood +
                ", Health=" + Health +
                ", RangeResist=" + RangeResist +
                ", MeleeResist=" + MeleeResist +
                ", Speed=" + Speed +
                ", LOS=" + LOS +
                ", Pop=" + Pop +
                ", MeleeDam=" + MeleeDam +
                ", HIMul=" + HIMul +
                ", LIMul=" + LIMul +
                ", CavMul=" + CavMul +
                ", MRate=" + MRate +
                ", RangedDam=" + RangedDam +
                ", R_HIMul=" + R_HIMul +
                ", R_LIMul=" + R_LIMul +
                ", R_CavMul=" + R_CavMul +
                ", R_HCavMul=" + R_HCavMul +
                ", RRate=" + RRate +
                ", RRange=" + RRange +
                ", Bounty=" + Bounty +
                ", SiegeDam=" + SiegeDam +
                ", SRange=" + SRange +
                ", SRate=" + SRate +
                ", Comments='" + Comments + '\'' +
                '}';
    }
}
