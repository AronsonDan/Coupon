/**
 * 
 */
package com.danaronson.exceptions;

/**
 * @author Dan Aronson
 *
 */
public class CompanyException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -5063642963199197491L;

    /**
     * @param string
     */
    public CompanyException(String string) {
	super(string);
    }

}
