/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testGetSid extends TestCase {
    public testGetSid(String testName) {
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
     * Test of getSid method, of class Attendence.
     */
    public void testGetSid() {
        Attendence a = new Attendence();
        String expResult = "1";
        String StudentName = "sdsd";
        String std = "COMPS(B.E)";
        String result = a.getSid(StudentName, std);
        assertEquals(expResult, result);
    }
}
