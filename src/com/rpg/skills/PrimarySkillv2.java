package com.rpg.skills;

import java.util.Random;

public class PrimarySkillv2 {
    private final int MAX_POINTS = 15;
    private int agility;
    private int intelligence;
    private int strength;
    private int toughness;
    private int[] skills = new int[4];
    private int pointsNotUsed = MAX_POINTS;

    public PrimarySkillv2() {
        for (int i = 0; i < skills.length; i++) {
            skills[i] = generateRandom(this.pointsNotUsed);
            this.pointsNotUsed = this.pointsNotUsed - skills[i];
        }

        this.agility = skills[0];
        this.intelligence = skills[1];
        this.strength = skills[2];
        this.toughness = skills[3];

        if (0 < MAX_POINTS - this.pointsNotUsed) {
            allocationOfRemainingPoints();
        }
        this.agility = skills[0];
        this.intelligence = skills[1];
        this.strength = skills[2];
        this.toughness = skills[3];

    }

    private void allocationOfRemainingPoints() {
        for (int i = 0; i < skills.length; i++) {
            if (isThisSkillTheLowest(skills[i]))
                skills[i] = skills[i] + pointsNotUsed;
        }
    }

    private int generateRandom(int max) {
        Random rand = new Random();
        return rand.nextInt(max);
    }


    private boolean isThisSkillTheLowest(int skillValue) {
        return skillValue <= this.agility && skillValue <= this.intelligence && skillValue <= this.strength && skillValue <= this.toughness;

    }

    public String toString() {
        return "Agility: " + agility + "\n intelligence: " + intelligence + "\n strength: " + strength + "\n toughness: " + toughness;
    }

}