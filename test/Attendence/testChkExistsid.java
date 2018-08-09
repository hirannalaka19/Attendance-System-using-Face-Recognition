/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testChkExistsid extends TestCase {
    public testChkExistsid(String testName) {
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
     * Test of chkExistsid method, of class StudentsEntry.
     */
    public void testChkExistsid() {
        StudentsEntry se = new StudentsEntry();
        boolean found;
        found = se.chkExistsid("1");
        assertEquals(found , true);
    }

}
