/**
 * Lab4_jjolietSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package edu.asupoly.ser422.adb;
import edu.asupoly.ser422.lab4.*;

/**
 *  Lab4_jjolietSkeleton java skeleton for the axisService
 */
public class Lab4_jjolietSkeleton implements Lab4_jjolietSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param getSubjects0
     * @return getSubjectsResponse1
     */
    public edu.asupoly.ser422.lab4.GetSubjectsResponse getSubjects(
        edu.asupoly.ser422.lab4.GetSubjects getSubjects0) {
    	GetSubjectsResponse res = new GetSubjectsResponse();
    	res.set_return(edu.asupoly.ser422.lab4.Lab4_jjoliet.getService().getSubjects());
    	return res;
    }

    /**
     * Auto generated method signature
     *
     * @param getService2
     * @return getServiceResponse3
     * @throws Lab4_jjolietExceptionException
     */
    public edu.asupoly.ser422.lab4.GetServiceResponse getService(
        edu.asupoly.ser422.lab4.GetService getService2)
        throws Lab4_jjolietExceptionException {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#getService");
    }

    /**
     * Auto generated method signature
     *
     * @param calculateGrade4
     * @return calculateGradeResponse5
     */
    public edu.asupoly.ser422.lab4.CalculateGradeResponse calculateGrade(
        edu.asupoly.ser422.lab4.CalculateGrade calculateGrade4) {
    	CalculateGradeResponse response = new CalculateGradeResponse();
        response.set_return(edu.asupoly.ser422.lab4.Lab4_jjoliet.getService().calculateGrade(calculateGrade4.getArgs0(), calculateGrade4.getArgs1()));
        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param mapToLetterGrade6
     * @return mapToLetterGradeResponse7
     */
    public edu.asupoly.ser422.lab4.MapToLetterGradeResponse mapToLetterGrade(
        edu.asupoly.ser422.lab4.MapToLetterGrade mapToLetterGrade6) {
    	MapToLetterGradeResponse res = new MapToLetterGradeResponse();
        res.set_return(edu.asupoly.ser422.lab4.Lab4_jjoliet.getService().mapToLetterGrade(mapToLetterGrade6.getArgs0()));
        return res;
    }
}
