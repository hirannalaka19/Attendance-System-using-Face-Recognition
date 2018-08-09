/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendence;

import junit.framework.TestCase;

public class testStudentName extends TestCase {
    public testStudentName(String testName) {
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
     * Test of getStudentName method, of class StudentManegement.
     */
    public void testGetStudentName() {
        StudentManegement sm = new StudentManegement();
        String name;
        name = sm.getStudentName("1");
        assertEquals(name , "sdsd");
    }
}
