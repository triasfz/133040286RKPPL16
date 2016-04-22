/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test133040286;

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
    
    private com.mycompany.rkppl16.Mahasiswa m;
    
    @Before
    public void beforeTest(){
      
        System.out.println("Before Test");
        
    }
    
    @Test
    public void test1(){
        m.setNama("Trias Fachrul Z");
        assertNotNull(m.getNama());
    }
    
    @Test
    public void test2(){
        m.setNrp("133040286");
        assertNull(m.getNrp());
    }
    
    @Test
    public void test3(){
        m.setNama("Trias Fachrul");
        assertSame("Trias", m.getNama());
    }
    
    @After
    public void afterTest(){
        System.out.println("After test");
    }
    
}
