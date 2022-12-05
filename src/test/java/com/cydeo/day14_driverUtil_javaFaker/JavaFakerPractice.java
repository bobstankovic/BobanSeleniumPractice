package com.cydeo.day14_driverUtil_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void fakerPractice(){
        Faker faker = new Faker();

        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);
        String number = faker.numerify("571-###-####");
        System.out.println("number = " + number);
        System.out.println("faker.letterify(\"DA??????????????bo\") = " + faker.letterify("DA??????????????bo"));
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard().replace(\"-\",\"\") = " + faker.finance().creditCard().replace("-", " "));
        System.out.println("faker.bothify(\"###??-0000-###??\") = " + faker.bothify("###??-0000-###??"));
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
    }

}
