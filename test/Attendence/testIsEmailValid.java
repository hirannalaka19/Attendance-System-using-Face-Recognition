/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testIsEmailValid extends TestCase {
    public testIsEmailValid(String testName) {
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
     * Test of isEmailValid method, of class StudentsEntry.
     */
    public void testIsEmailValid() {
        StudentsEntry se = new StudentsEntry();
        boolean isValid;
        String email = "someone@gmail.com";
        isValid = StudentsEntry.isEmailValid(email);
        assertEquals(isValid , true);
    }
}
