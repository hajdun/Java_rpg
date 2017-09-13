package com.rpg;

import com.rpg.skills.PrimarySkill;
import com.rpg.skills.PrimarySkillv2;

public class Main {

    public static void main(String[] args) {
        PrimarySkill ps = new PrimarySkill();
        System.out.println(ps.toString());

        System.out.println("-----------------------------------");

        PrimarySkillv2 psv2 = new PrimarySkillv2();
        System.out.println(psv2.toString());
    }
}
