/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testStudentID extends TestCase {
    public testStudentID(String testName) {
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
     * Test of chkSID method, of class StudentManegement.
     */
    public void testChkSID() {
        StudentManegement sm = new StudentManegement();
        boolean found = false;
        found = sm.chkSID("1");
        assertEquals(found , true);
    }
}
