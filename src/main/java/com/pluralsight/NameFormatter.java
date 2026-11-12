package com.pluralsight;

public class NameFormatter {

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return lastName + ", " + prefix +". "+ firstName +" " + middleName +", "+ suffix;
    }

    public static String format(String firstName, String lastName){
        return lastName + " " + firstName;
    }

    public static String format(String fullName){
        String[] parts = fullName.trim().split("\\|");
        String firstName = parts[1];
        String middleName = parts[2];
        String lastName = parts[3];
        String suffix = parts[4];
        String prefix = parts[5];


        if (fullName.contains(middleName) && fullName.contains(suffix)){
            return lastName + ", " + firstName + " " + middleName + ", " + suffix;
        }
        else if (fullName.contains(middleName) && fullName.contains(suffix) && fullName.contains(prefix)) {
            return lastName + ", " + prefix + " " + firstName + " " + middleName + ", " + suffix;
        }



    }
}
