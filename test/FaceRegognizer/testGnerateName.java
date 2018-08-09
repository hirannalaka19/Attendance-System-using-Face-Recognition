/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FaceRegognizer;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

public class testGnerateName extends TestCase {
    public testGnerateName(String testName) {
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
     * Test of modifyName method, of class FaceRecognizer1.
     */
    public void testModifyName() {
        FaceRecognizer1 fr1 = new FaceRecognizer1();
        String name = "Hiran N";
        String expResult = "Hiran_N";
        String result = fr1.modifyName(name);
        assertEquals(expResult, result);
    }
}
