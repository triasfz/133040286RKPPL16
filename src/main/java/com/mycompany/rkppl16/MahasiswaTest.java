/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rkppl16;

import org.junit.After;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author SB604-05
 */
public class MahasiswaTest {
    
    
    private Mahasiswa m;
    
    @Before
    public void beforeTest(){
        m.setNama("Trias");
        m.setNrp("133040286");
        
        System.out.println("Before Test");
        
    }
    
    @Test
    public void test1(){
        assertNotNull(m.getNama());
    }
    
    @Test
    public void test2(){
       
        assertNull(m.getNrp());
    }
    
    @Test
    public void test3(){
        assertSame("Trias", m.getNama());
    }
    
    @After
    public void afterTest(){
        System.out.println("After test");
    }
    
}


