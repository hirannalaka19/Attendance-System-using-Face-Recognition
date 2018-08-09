/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testChkAttendenceExists extends TestCase {
    public testChkAttendenceExists(String testName) {
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
     * Test of chkAttendenceExists method, of class Attendence.
     */
    public void testChkAttendenceExists() {
        Attendence a = new Attendence();
        boolean expected = true;
        String sid = "1";
        String Date = "2018-07-13";
        String subject = "";
        String fromtime = "";
        String totime = "";
        boolean found = a.chkAttendenceExists(sid, Date, subject, fromtime, totime);
        assertEquals(expected, found);
    }
}
