package com.rpg.skills;

import java.util.Random;

public class PrimarySkill {
    private final int MAX_POINTS = 15;
    private int agility;
    private int intelligence;
    private int strength;
    private int toughness;


    public PrimarySkill() {

        int pointsNotUsed = MAX_POINTS;

        this.agility = generateRandom(pointsNotUsed);

        pointsNotUsed = pointsNotUsed - this.agility;

        this.intelligence = generateRandom(pointsNotUsed);

        pointsNotUsed = pointsNotUsed - this.intelligence;

        this.strength = generateRandom(pointsNotUsed);

        pointsNotUsed = pointsNotUsed - this.strength;

        this.toughness = pointsNotUsed;

        validateSkills();

    }



    public int generateRandom(int max) {
        Random rand = new Random();
        return rand.nextInt(max);
    }


    public void validateSkills() {
        int skillSum = this.agility + this.intelligence + this.strength + this.toughness;

        if (skillSum < MAX_POINTS) {
            int remainingSkillPoints = MAX_POINTS - skillSum;
            if(isThisSkillTheLowest(this.agility)){
                this.agility = this.agility + remainingSkillPoints;
            } else if (isThisSkillTheLowest(this.intelligence)){
                this.intelligence = this.intelligence + remainingSkillPoints;
            } else if (isThisSkillTheLowest(this.strength)){
                this.strength = this.strength + remainingSkillPoints;
            } else {
                this.toughness = this.toughness + remainingSkillPoints;
            }
        }

    }

    public boolean isThisSkillTheLowest(int skillValue){
        return skillValue <= this.agility && skillValue <= this.intelligence && skillValue <= this.strength && skillValue <= this.toughness;

    }

    public String toString() {
        return "Agility: " + agility + "\n intelligence: " + intelligence + "\n strength: " + strength + "\n toughness: " + toughness;
    }

}
