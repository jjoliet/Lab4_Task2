/**
 * Lab4_jjolietExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package edu.asupoly.ser422.adb;

public class Lab4_jjolietExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1524012548454L;
    private edu.asupoly.ser422.lab4.Lab4_jjolietException faultMessage;

    public Lab4_jjolietExceptionException() {
        super("Lab4_jjolietExceptionException");
    }

    public Lab4_jjolietExceptionException(java.lang.String s) {
        super(s);
    }

    public Lab4_jjolietExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public Lab4_jjolietExceptionException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        edu.asupoly.ser422.lab4.Lab4_jjolietException msg) {
        faultMessage = msg;
    }

    public edu.asupoly.ser422.lab4.Lab4_jjolietException getFaultMessage() {
        return faultMessage;
    }
}
