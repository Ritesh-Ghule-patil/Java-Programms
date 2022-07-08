package com.exception.test;

import com.exception.model.UnderAgeException;

public class Voting {
    public static void main(String[] args) {
        int age =3;
try {
    if (age < 18) {
        throw new UnderAgeException("you are not eligible for voting!!");
    } else {
        System.out.println("you can vote");
 }
}catch (Exception e){
    e.printStackTrace();
}

    }

}
