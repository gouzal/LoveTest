package com.gouzal.lovetest.logic;

public final class Calculator {

    private final String firstName;
    private final String secondName;

    /**
     * @param firstName
     * @param secondName
     */

    public Calculator(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    private int CalcValueFromName(String name) {
        int nameValue = 0;
        for (char letter : name.toCharArray()) {
            nameValue += letter;
        }
        return nameValue;
    }

    private int calcLoveValue(int firstNameValue, int secondNameValue) {
        int value = Math.abs(firstNameValue - secondNameValue);

        while (value > 100) {
            value -= 100;
        }

        return value;
    }

    public int getLoveResult() {
        final int firstNameValue = this.CalcValueFromName(this.getFirstName());
        final int secondNameValue = this.CalcValueFromName(this.getSecondName());
        return this.calcLoveValue(firstNameValue, secondNameValue);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }

}