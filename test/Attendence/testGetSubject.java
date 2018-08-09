/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testGetSubject extends TestCase {
    public testGetSubject(String testName) {
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
     * Test of getSubject method, of class Attendence.
     */
    public void testGetSubject() {
        String currtime = "17.00";
        Attendence a = new Attendence();
        String expResult = "GAP";
        String result = a.getSubject(currtime);
        assertEquals(expResult, result);
    }
}
