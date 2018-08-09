/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class testGetNumOfRecords extends TestCase {
    public testGetNumOfRecords(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }


    /**
     * Test of getNumOfRecords method, of class AttendenceCheck.
     */
    public void testGetNumOfRecords() {
        AttendenceCheck ac = new AttendenceCheck();
        String fromDate = "2010-01-01";
        String toDate = "2018-12-12";
        int expected = 5;
        int nOfRecords = ac.getNumOfRecords("1", fromDate, toDate);
        assertEquals(expected, nOfRecords);
    }
}
