/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 5.3
 * File Name: Die.java
 */

//Honestly doesn't have a point, just kinda decided to keep it

public class Die {
    private final int MAX = 6;
    private int faceValue;
    
    //Constructor
    public Die(){
        faceValue = 1;
    }
    
    //Rolls Die
    public int roll(){
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }
    
    //Face Value Mutator
    public void setFaceValue(int value){
        faceValue = value;
    }
    
    //Face Value Acessor
    public int getFaceValue(){
        return faceValue;
    }
    
    public String toString(){
        String result = Integer.toString(faceValue);
        return result;
    }
}
