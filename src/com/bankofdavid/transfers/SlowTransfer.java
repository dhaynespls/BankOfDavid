package com.bankofdavid.transfers;

/**
 * The existence of SlowTransfer acts as an example of a separate package within a library that acts independently from
 * other classes. I actually have no idea how to handle sockets in Java so we'll leave this blank :P.
 * Date: 12/10/18
 * Author: dhaynes3@gmu.edu
 */
public class SlowTransfer extends Transferer {

    public SlowTransfer() {
        super();
    }

    /**
     * The transfer function sends to a remote Bank through Java sockets. I don't actually know how to do this.
     *
     * In this class it will be done sync.
     */
    @Override
    public void transfer() {
    }
}
