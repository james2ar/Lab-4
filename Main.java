/*
Lab 4
Partners: Adam James and Seth Adleta
Date: 2/9/2021
*/

import java.util.Random;

import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(51);

    System.out.println("The random number is: " + randomNum);

    int originalRand = randomNum;

    while (randomNum >= 0)
    {System.out.println(randomNum);
    randomNum--;
    }


    if (originalRand <= 15)
    System.out.println("Ahoy Mateys!");
    else if (originalRand > 20 && originalRand < 42)
    System.out.println("Cannonball!");
    else 
    System.out.println("Look, a sea shanty!");




  }
}