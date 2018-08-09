/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testGetOrgnlName extends TestCase {
    public testGetOrgnlName(String testName) {
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
     * Test of getOrgnlName method, of class MarkAttendence.
     */
    public void testGetOrgnlName() {
        MarkAttendence ma = new MarkAttendence();
        String name = "John_Cena";
        String modifiedName = ma.getOrgnlName(name);
        assertEquals(modifiedName , "John Cena");
    }
}
