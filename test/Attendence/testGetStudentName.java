/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testGetStudentName extends TestCase {
    public testGetStudentName(String testName) {
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
     * Test of getStudentName method, of class Attendence.
     */
    public void testGetStudentName() {
        Attendence a = new Attendence();
        String sid = "1";
        String expResult = "sdsd";
        String result = a.getStudentName(sid);
        assertEquals(expResult, result);
    }
}
