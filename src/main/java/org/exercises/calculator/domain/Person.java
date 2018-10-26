package org.exercises.calculator.domain;

public class Person implements PersonJob{

    public final String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean print(Printer printer){
        printer.addToQueue(this);
        return printer.startPrinting();
    }
}
