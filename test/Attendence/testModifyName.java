/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testModifyName extends TestCase {
    public testModifyName(String testName) {
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
     * Test of modifyName method, of class MarkAttendence.
     */
    public void testModifyName() {
        MarkAttendence ma = new MarkAttendence();
        String name = "John Cena";
        String modifiedName = ma.modifyName(name);
        assertEquals(modifiedName , "John_Cena");
    }
}
