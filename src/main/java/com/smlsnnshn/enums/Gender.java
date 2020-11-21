package com.smlsnnshn.enums;

public enum Gender {

    MALE("Male"), FEMALE("Female");

    private String value;

    private Gender(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
