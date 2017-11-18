package com.company;

public class Student {

    int studentid;
    String firstName;
    String lastName;
    String country;
    int age;

    public boolean isElder(){

      if(age>25){

          return true;
      }
        return false;
    }
    public boolean isUsCitizen(){

        if(country.equals("US")){

            return true;

        }
        return false;
    }

    public int getStudentId(){
        return studentid;
    }

}
