/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FaceRegognizer;

import junit.framework.TestCase;

public class testLoadData extends TestCase {
    public testLoadData(String testName) {
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
     * Test of loadTrainingData1 method, of class FaceRecognizer1.
     */
    public void testLoadTrainingData1() {
        FaceRecognizer1 fr1 = new FaceRecognizer1();
        int expResult = 1;
        int result = fr1.loadTrainingData1();
        assertEquals(expResult, result);
    }
}
