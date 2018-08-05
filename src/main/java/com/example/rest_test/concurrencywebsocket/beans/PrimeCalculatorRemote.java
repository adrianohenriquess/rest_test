package com.example.rest_test.concurrencywebsocket.beans;

import javax.ejb.Remote;

@Remote
public interface PrimeCalculatorRemote {

    public Long calculateMaxPrimeBelow(long l);
}
