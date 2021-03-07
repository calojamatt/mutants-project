/*
 * Development and Technologies Solutions S.A.S - D&TS
 * www.dytssol.com
 *
 * Copyright © 2015 - 2021
 * All right reserved.
 *
 * mutants-project
 * NotValidValueException.java
 */
package com.meli.mutants.exception;

/**
 * Class to generate exception when a dna character is not valid
 *
 * @author <a href:"carlos.maturana@dytssol.com">Carlos Maturana</a>
 * @version 1.0.1
 * @created 7/03/21 9:42 a. m.
 * @since 1.0.0
 */
public class NotValidValueException extends Exception {


    /**
     * Create a new NotValidValueException
     * @param s the message to send
     * */
    public NotValidValueException(String s) {
        super(s);
    }
}