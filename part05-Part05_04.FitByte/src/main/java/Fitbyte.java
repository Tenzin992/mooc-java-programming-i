/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tenzi
 */
public class Fitbyte {
    private int age;
    private int restHeart;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restHeart = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
         return ((206.3 - (0.711 * age) - restHeart) * (percentageOfMaximum) + restHeart);
        
    }
}
