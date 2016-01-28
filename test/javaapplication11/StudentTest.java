/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author HACKER
 */
public class StudentTest {
    
    public StudentTest() 
    {
        
    }
    
    @Test
    public void nameTest() 
    {
        System.out.println("StudentTest");
        Student instance = new Student();
        String expResult = "";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void nameStudentTest() 
    {
        System.out.println("StudentTest");
        Student instance = new Student("Bill Smith","c0123456","male",89.3);
        assertEquals("Bill Smith", instance.getName());
        assertEquals("c0123456", instance.getId());
        assertEquals("male", instance.getGender());
        assertEquals(89.3, instance.getGrade(),0.0);
    }
    
    @Test
    public void idTest() 
    {
        System.out.println("StudentTest");
        Student instance = new Student();
        String expResult = "";
        instance.setId(expResult);
        String result = instance.getId();
        assertEquals(expResult, result);
    }
    
    @Test
    public void genderTest() 
    {
        System.out.println("StudentTest");
        Student instance = new Student();
        String expResult = "";
        instance.setGender(expResult);
        String result = instance.getGender();
        assertEquals(expResult, result);
    }
    
    @Test
    public void gradeTest() 
    {
        System.out.println("StudentTest");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getGrade();
        assertEquals(expResult, result,0.0);
    }
    
    @Test
    public void namevalueTest() 
    {
        System.out.println("StudentTest");
        Student instance = new Student();
        String expResult = "Bill Smith";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void idvalueTest() 
    {
        System.out.println("StudentTest");
        Student instance = new Student();
        String expResult = "c0123456";
        instance.setId(expResult);
        String result = instance.getId();
        assertEquals(expResult, result);
    }
    
    @Test
    public void gendervalueTest() 
    {
        System.out.println("StudentTest");
        Student instance = new Student();
        String expResult = "male";
        instance.setGender(expResult);
        String result = instance.getGender();
        assertEquals(expResult, result);
    }
    
    @Test
    public void gradevalueTest() 
    {
        System.out.println("StudentTest");
        Student instance = new Student();
        double expResult = 89.3;
        instance.setGrade(expResult);
        double result = instance.getGrade();
        assertEquals(expResult, result,0.0);
    }
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Student instance1 = new Student();
        instance1.setName("Ranjith");
        instance1.setId("c0663421");
        Student instance2 = new Student();
        instance2.setName("Ranjith");
        instance2.setId("c0663421");
        assertEquals(instance1, instance2);
    }
    
@Test
    public void testsamenamedifferentidEquals() {
        System.out.println("equals");
        Student instance1 = new Student();
        instance1.setName("Ranjith");
        instance1.setId("c0663421");
        Student instance2 = new Student();
        instance2.setName("Ranjith");
        instance2.setId("c0664573");
        assertFalse(instance1.getId().equals(instance2.getId())); 
    }

    @Test
    public void testsameiddifferentnameEquals() {
        System.out.println("equals");
        Student instance1 = new Student();
        instance1.setName("Ranjith");
        instance1.setId("c0663421");
        Student instance2 = new Student();
        instance2.setName("surya");
        instance2.setId("c0663421");
        assertFalse(instance1.getName().equals(instance2.getName())); 
        
    }
    
    @Test
    public void testdifferentiddifferentnameEquals() {
        System.out.println("equals");
        Student instance1 = new Student();
        instance1.setName("Ranjith");
        instance1.setId("c0663421");
        Student instance2 = new Student();
        instance2.setName("surya");
        instance2.setId("c0664573");
        assertFalse(instance1.getName().equals(instance2.getName()) && instance1.getId().equals(instance2.getId())); 
    }
    
    /**
     * Test of toString method, of class Student.
     * 
     */
    @Test
    public void testToString() 
    {
        try
        {
        System.out.println("toString");
        Student instance = new Student();
        instance.setName("Bill Smith");
        instance.setId("c0123456");
        instance.setGender("male");
        instance.setGrade(89.3);
        String jsonString = instance.toString();
        JSONObject result = (JSONObject) new JSONParser().parse(jsonString);
        JSONObject expResult = (JSONObject) new JSONParser().parse("{\"name\":\"Bill Smith\",\"id\":\"c0123456\",\"gender\":\"male\",\"grade\":\"89.3\"}");
        assertEquals(expResult, result);
        }
        catch (ParseException ex)
                {
                    System.err.println("Invalid JSON Format");
                    fail("Invalid JSON Format");
                }
    }
    
}
