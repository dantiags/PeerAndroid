package com.aycron.peerandroid.model;

/**
 * Created by carlos.dantiags on 13/7/2016.
 */
public class Message {

    public int icon;
    public String name;
    public String message;

    public Message(int icon,String name, String message){
        super();
        this.icon = icon;
        this.message = message;
        this.name = name;
    }
}
