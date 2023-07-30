/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 5.3
 * File Name: DieTriplet.java
 */

//Creates DieTriple, rollTriplet, and faceValues for RollTriplet.java

public class DieTriplet {
    private final int MAX = 6;
    private int faceValue1, faceValue2, faceValue3;
    private int sum;
    //Constructor
    public DieTriplet(){
        faceValue1 = 1;
        faceValue2 = 1;
        faceValue3 = 1;
    }
    
    //Rolls three Die
    public int rollTriple(){
        faceValue1 = (int) (Math.random() * MAX) + 1;
        faceValue2 = (int) (Math.random() * MAX) + 1;
        faceValue3 = (int) (Math.random() * MAX) + 1;

        return faceValue1 + faceValue2 + faceValue3;
    }
    
    //Face Value Mutators
    public void setFaceValue1(int value){
        faceValue1 = value;
    }
    public void setFaceValue2(int value){
        faceValue2 = value;
    }
    public void setFaceValue3(int value){
        faceValue3 = value;
    }
    
    //Face Value Acessors
    public int getFaceValue1(){
        return faceValue1;
    }
    public int getFaceValue2(){
        return faceValue2;
    }
    public int getFaceValue3(){
        return faceValue3;
    }
    
    //Sum Method
    public int sum(){
        sum = faceValue1 + faceValue2 + faceValue3;
        return sum;
    }
    
    //toString
    public String toString(){
        String result = Integer.toString(faceValue1) 
                + Integer.toString(faceValue2) 
                + Integer.toString(faceValue3);
        return result;
    }
}
