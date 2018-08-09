/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import junit.framework.TestCase;

/**
 *
 * @author Farhad Akram
 */
public class DatabaseConnectionTest extends TestCase {
    
    Connection conn;
    
    public DatabaseConnectionTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        conn = null;
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of Database connection method, of class DatabaseConnection.
     */
    public void testDbconnection() {
        DatabaseConnection dbClass = new DatabaseConnection();
        conn = dbClass.dbconnection();
        assertEquals(conn != null, true);
    }
}
