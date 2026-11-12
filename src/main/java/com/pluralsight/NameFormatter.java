package com.pluralsight;

public class NameFormatter {

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        StringBuilder sb = new StringBuilder();

        sb.append(lastName).append(", ");

        if(!prefix.isEmpty()){
            sb.append(prefix).append(" ");
        }

        sb.append(firstName);

        if(!middleName.isEmpty()){
            sb.append(" ").append(middleName);
        }
        if(!suffix.isEmpty()){
            sb.append(", ").append(suffix);
        }
        sb.toString();


    }

    public static String format(String firstName, String lastName){
        return format("", firstName, "", lastName, "");
    }

    public static String format(String fullName){
        String[] parts = fullName.split(", ");
        String mainPart = parts[0];
        if (parts.length > 1){
            String suffix = parts[1];
        }
        //else{
            String suffix = "";
        }
    }
}
