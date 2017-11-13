/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesUnitarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fernando Vasques
 */
public class DateJUnitTest {
     private Date d = new Date();
    
    public DateJUnitTest() {
       /* try {
            System.setOut(new PrintStream(new File("log.txt")));
            System.out.println("Testes com a classe Date");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DateJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }*/
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

    @Test
    public void instanciacoes(){
        System.out.println("TestesUnitarios.DateJUnitTest.instanciacoes()");
        System.out.println(d.day == 1);
        assertEquals(true,d.day == 1);
        System.out.println(d.month == 1);
        assertEquals(true,d.month == 1);
        System.out.println(d.year == 1900);
        assertEquals(true,d.year == 1);

        d = new Date(2000, 12, 25);
        System.out.println(d.day == 25);
        assertEquals(true,d.day == 25);
        System.out.println(d.month == 12);
        assertEquals(true,d.day == 12);
        System.out.println(d.year == 2000);
        assertEquals(true,d.year == 2000);      
        /*
        d.day = 5;
        d.month = 1;
        d.year = 2001;
        */
        
        d = new Date(13, 7, 2016);
        System.out.println(d.day == 13);
        assertEquals(true,d.day == 13);
        System.out.println(d.month == 7);
        assertEquals(true,d.month == 25);
        System.out.println(d.year == 2016);
        assertEquals(true,d.year == 25);
        
        // inválido (ambíguo)
//     d = new Date(1900, 7, 2016);

     // inválido (ano abaixo do mínimo 1900)
//     d = new Date(16, 7, 1899);

     // inválido (ano abaixo do mínimo 1900)
//    d = new Date(1899, 7, 16);

     // inválido (mês inválido)
//     d = new Date(2016, 13, 16);

     // inválido (dia inválido)
//     d = new Date(2016, 12, 32);

     // inválido (dia inválido)
//     d = new Date(2016, 12, -1);

     // inválido (mês inválido)
 //    d = new Date(2016, -1, 16);

     // inválido (dia inválido)
 //    d = new Date(2016, 2, 30);
    }
    
    @Test
    public void sobrecargaTostring(){
        System.out.println("TestesUnitarios.DateJUnitTest.sobrecargaTostring()");
        Date d8 = new Date(5, 5, 2005);
        System.out.println(d8.toString().equals("05/05/2005"));
        assertEquals("05/05/2005", d8.toString());
        d8 = new Date(1, 10, 2001);
        System.out.println(d8.toString().equals("01/10/2001"));
        assertEquals("01/10/2001", d8.toString());
    }
    
    @Test
    public void igualdades(){
        System.out.println("TestesUnitarios.DateJUnitTest.igualdades()");
        Date d5 = new Date(1, 7, 2014);
        Date d6 = new Date(1, 7, 2014);
        System.out.println(d5.equals(d6) == true);
        assertEquals(true, d5.equals(d6) == true);
        System.out.println(d5.equals(new Date()) == false);
        assertEquals(true, d5.equals(new Date()) == false);
    }
    
    @Test
    public void beforeAfter(){
        System.out.println("TestesUnitarios.DateJUnitTest.beforeAfter()");
        Date d5 = new Date(1, 7, 2014);
        Date d7 = new Date(23, 4, 2016);
        System.out.println(d5.after(d7) == false);
        assertEquals(true, d5.after(d7) == false);
        
        System.out.println(d7.after(d5) == true);
        assertEquals(true, d7.after(d5) == true);
        
        System.out.println(d5.before(d7) == true);
        assertEquals(true, d5.before(d7) == true);
        
        System.out.println(d7.before(d5) == false);
        assertEquals(true, d7.before(d5) == false);
        
        System.out.println(d7.before(d7) == false);
        assertEquals(true, d7.before(d7) == false);
        
        System.out.println(d7.after(d7) == false);
        assertEquals(true, d7.after(d7) == false);
    }
    
    @Test
    public void yesterdayTomorrow(){
        System.out.println("TestesUnitarios.DateJUnitTest.yesterdayTomorrow()");
        d = new Date(2016, 4, 22);
        Date d2 = d.yesterday();
        System.out.println(d2.day == 21);
        assertEquals(true, d2.day == 21);

        System.out.println(d2.month == 4);
        assertEquals(true, d2.month == 4);

        System.out.println(d2.year == 2016);
        assertEquals(true, d2.year == 2016);

        System.out.println(d.day == 22);
        assertEquals(true, d.day == 22);

        System.out.println(d.month == 4);
        assertEquals(true, d.month == 4);

        System.out.println(d.year == 2016);
        assertEquals(true, d.year == 2016);

        d2 = d.tomorrow();
        System.out.println(d2.day == 23);
        assertEquals(true, d2.day == 23);

        System.out.println(d2.month == 4);
        assertEquals(true, d2.month == 4);

        System.out.println(d2.year == 2016);
        assertEquals(true, d2.year == 2016);
    
    }
    
    @Test
    public void plusDaysMinusDays(){
        System.out.println("TestesUnitarios.DateJUnitTest.plusDaysMinusDays()");
        Date d2 = d.tomorrow();
        Date d3 = d2.plusDays(10);
        System.out.println(d3.day == 3);
        assertEquals(true, d3.day == 3);
        
        System.out.println(d3.month == 5);
        assertEquals(true, d3.month == 5);
        
        System.out.println(d3.year == 2016);
        assertEquals(true, d3.year == 2016);
        
        Date d4 = d3.minusDays(10);
        System.out.println(d4.day == 23);
        assertEquals(true, d4.day == 23);
        
        System.out.println(d4.month == 4);
        assertEquals(true, d4.month == 4);
        
        System.out.println(d4.year == 2016);
        assertEquals(true, d4.year == 2016);
        
    }
    
    @Test
    public void casosComplexos(){
        System.out.println("TestesUnitarios.DateJUnitTest.casosComplexos()");
        Date q = new Date(20, 2, 2016);
        q = q.plusDays(9);
        System.out.println(q.toString().equals("29/02/2016"));
        assertEquals("29/02/2016", q.toString());
        
        for (int i = 0; i < 400; i++) q = q.tomorrow();
        System.out.println(q.toString().equals("04/04/2017"));
        assertEquals(true,q.toString().equals("04/04/2017"));
        
        q = q.plusDays(365);
        System.out.println(q.toString().equals("04/04/2018"));
        assertEquals(true,q.toString().equals("04/04/2018"));
    }
}
