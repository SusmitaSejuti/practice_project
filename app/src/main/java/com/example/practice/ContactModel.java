package com.example.practice;

public class ContactModel {
/*
    Calendar calendar = calendar = Calendar.getInstance();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    String dateAndTime = simpleDateFormat.format(calendar.getTime());
*/

    String name , time , systolic , diastolic , heart ;

    public ContactModel(String name , String time){
        this.name = name ;
        this.time = time ;
    }

    public ContactModel(String name , String time , String systolic , String diastolic , String heart ){
        this.name = name ;
        this.time = time ;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.heart = heart ;
    }

}
