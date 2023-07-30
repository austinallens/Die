/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 5.2
 * File Name: RollTriplet.java
 */

//Rolls three die 5000 times and returns how many one trios it has

public class RollTriplet {
    public static void main(String[] args) {
        DieTriplet dieTrio;
        int totalRolls = 0;
        int sum;
        int count = 0;
        
        dieTrio = new DieTriplet();
        while(totalRolls<=5000){
            dieTrio.rollTriple();
            totalRolls++;
            sum = dieTrio.getFaceValue1() 
                    + dieTrio.getFaceValue2() + dieTrio.getFaceValue3();
            if(sum == 3){
               count++; 
            }
        }
        System.out.println("There was " + count + " one trios.");
    }
}
