/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.cap.Security.Service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Leoo
 */
public class UserDetailsImplTest {
    
    public UserDetailsImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of loadUserByUsername method, of class UserDetailsImpl.
     */
    @Test
    public void testLoadUserByUsername() {
        System.out.println("loadUserByUsername");
        String nombreUsuario = "";
        UserDetailsImpl instance = new UserDetailsImpl();
        UserDetails expResult = null;
        UserDetails result = instance.loadUserByUsername(nombreUsuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
