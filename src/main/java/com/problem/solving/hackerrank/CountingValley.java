package com.problem.solving.hackerrank;

public class CountingValley {

    public static int countValleyTraverse(int steps, String path){
        int noOfValley = 0;
        String[] valleyPath = path.split("");
        int seaLevel = 0;
        for (String step: valleyPath) {
            if(step.equals("U")) {
                seaLevel++;
                if (seaLevel == 0) {
                    noOfValley++;
                }
            } else {
                seaLevel--;
            }
        }
        return noOfValley;
    }
}
