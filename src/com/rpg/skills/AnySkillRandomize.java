package com.rpg.skills;

import java.util.Random;

public class AnySkillRandomize {
    private int[] skills;
    private int pointsNotUsed;

    public AnySkillRandomize(int numOfSkills, int pointsToShare) {
        skills = new int[numOfSkills];
        pointsNotUsed = pointsToShare;

        for (int i = 0; i < skills.length; i++) {
            skills[i] = generateRandom(this.pointsNotUsed);
            this.pointsNotUsed = this.pointsNotUsed - skills[i];
        }

        if (0 < pointsToShare - this.pointsNotUsed) {
            allocationOfRemainingPoints();
        }
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
        //TODO
        return false;
    }

    public String toString() {
        //TODO
        return "";
    }


}
