package com.bankofdavid.transfers;

/**
 * The existence of Transferer acts as an example of a separate package within a library that acts independently from
 * other classes. I actually have no idea how to handle sockets in Java so we'll leave this blank :P.
 * Date: 12/10/18
 * Author: dhaynes3@gmu.edu
 */
public abstract class Transferer {

    private String attributeOne;
    private String attributeTwo;
    private String attributeThree;

    public Transferer () {
        super();
    }

    /**
     * The transfer function sends to a remote Bank through Java sockets. I don't actually know how to do this.
     */
    public abstract void transfer();

    public String getAttributeOne() {
        return attributeOne;
    }

    public void setAttributeOne(String attributeOne) {
        this.attributeOne = attributeOne;
    }

    public String getAttributeTwo() {
        return attributeTwo;
    }

    public void setAttributeTwo(String attributeTwo) {
        this.attributeTwo = attributeTwo;
    }

    public String getAttributeThree() {
        return attributeThree;
    }

    public void setAttributeThree(String attributeThree) {
        this.attributeThree = attributeThree;
    }

}
