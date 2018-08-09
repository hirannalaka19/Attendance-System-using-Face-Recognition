/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testLoadTrainingData1 extends TestCase {
    public testLoadTrainingData1(String testName) {
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
     * Test of loadTrainingData1 method, of class MarkAttendence.
     */
    public void testLoadTrainingData1() {
        MarkAttendence ma = new MarkAttendence();
        int loaded;
        loaded = ma.loadTrainingData1();
        assertEquals(loaded , 1);
    }
}
