/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotest;

import demoex.demo.SinhVien;
import demoex.demo.TuoiException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class NewEmptyJUnitTest {

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testTuoiNhoHonKhong() {
        SinhVien sv = new SinhVien();
        try {
            sv.setTuoi(-4);
        } catch (TuoiException ex) {
            System.out.println("gap su co tuoi");
        }
        int tuoi = sv.getTuoi();
        assertEquals(tuoi, 0);
//        assert
    }

    @Test
    public void testTuoiQuaLon() {
        SinhVien sv = new SinhVien();
        try {
            sv.setTuoi(101);
        } catch (TuoiException ex) {
            System.out.println("gap su co tuoi");
        }
        int tuoi = sv.getTuoi();
        assertEquals(tuoi, 0);
    }

    // public void hello() {}
    @Test
    public void testTuoiChuan() {

        SinhVien sv = new SinhVien();
        try {
            sv.setTuoi(9);
        } catch (TuoiException ex) {
            System.out.println("gap su co tuoi");
        }
        int tuoi = sv.getTuoi();
        assertEquals(tuoi, 9);

    }
}
