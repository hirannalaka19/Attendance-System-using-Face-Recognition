/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testChkSID extends TestCase {
    public testChkSID(String testName) {
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
     * Test of chkSID method, of class AttendenceCheck.
     */
    public void testChkSID() {
        AttendenceCheck ac = new AttendenceCheck();
        boolean found = ac.chkSID("1");
        assertEquals(found , true);
    }
}
