/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testGetByStudentID extends TestCase {
    public testGetByStudentID(String testName) {
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
     * Test of getByStudentID method, of class AttendenceCheck.
     */
    public void testGetByStudentID() {
        AttendenceCheck ac = new AttendenceCheck();
        String studentName = ac.getStudentName("1");
        assertEquals(studentName , "sdsd");
    }
}
