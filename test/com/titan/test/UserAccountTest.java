/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.test;

import com.titan.bll.User;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Brandon
 */
public class UserAccountTest {
    
    public UserAccountTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void userAccountCreated(){
        User newAccount = new User("Username");
        assertEquals(newAccount.getUsername(), "Username");
    }
    
    
}
