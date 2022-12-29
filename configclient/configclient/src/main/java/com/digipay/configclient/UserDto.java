package com.digipay.configclient;

import jakarta.validation.constraints.*;

public class UserDto {
    @NotNull(message = "name of user is null!!!")
    private String name;
    @Min(19)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
//    @AssertTrue(message = "age is invalid")
//    public Boolean isCheckAge(){
//        if (age > 18 )
//            return  Boolean.TRUE;
//        else return Boolean.FALSE;
//    }
}
