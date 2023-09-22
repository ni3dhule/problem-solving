package com.problem.solving.hackerrank;

public class CountingValley {

    private CountingValley(){}
    public static int countValleyTraverse(String path)  {
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
