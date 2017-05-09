/**
 * 
 */
package com.danaronson.exceptions;

/**
 * @author Dan Aronson
 *
 */
public class CustomerException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = -7211389741249541599L;

    /**
     * @param string
     */
    public CustomerException(String string) {
	super(string);
    }
}
