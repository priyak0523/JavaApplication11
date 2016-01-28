/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author c0663421
 */
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class CourseTest {
    private List<Student> pst = new ArrayList<>();
  
  Student s= new Student("Bill Smith", "c0123456", "male",89.3);
    
    public CourseTest()
    {
        
    }
    
    @Test
    public void listTest() 
    {
        System.out.println("StudentTest");
        Course instance = new Course();
        List<Student> Listtemp = new ArrayList<>();
        assertEquals(Listtemp, instance.getAll());
    }
    
    @Test
    public void listwithparameterTest() 
    {
        System.out.println("StudentTest");
        List Listtemp = new ArrayList();
        Course instance = new Course(Listtemp);
        assertEquals(Listtemp, instance.getAll());
    }
    
    @Test
    public void listwithstudentparameterTest() 
    {
        System.out.println("StudentTest");
        List Listtemp = new ArrayList();
        Listtemp.add("Ranjith");
        Listtemp.add("Kalai");
        Listtemp.add("Surya");
        Course instance = new Course(Listtemp);
        assertEquals(Listtemp, instance.getAll());
    }
    
    @Test
    public void liststudentremoveparameterTest() 
    {
        System.out.println("StudentTest");
        List<Student> Listtemp = new ArrayList();
        String id = "c0664573";
        Course instance = new Course(Listtemp);
        Listtemp.remove(id);
        assertEquals(Listtemp, instance.getAll());
    }
    
    @Test
    public void liststudentremovewithidparameterTest() 
    {
        System.out.println("StudentTest");
        List Listtemp = new ArrayList();
        Listtemp.add("Ranjith");
        Listtemp.add("Kalai");
        Listtemp.add("Surya");
        Course instance = new Course(Listtemp);
        instance.remove(2);
        Listtemp.remove("Kalai");
        assertEquals(Listtemp, instance.getAll());
    }
    
    @Test
    public void insertwithstudentandidparameterTest() 
    {
        System.out.println("StudentTest");
        List Listtemp = new ArrayList();
        Listtemp.add("Ranjith");
        Listtemp.add("Kalai");
        Course instance = new Course(Listtemp);
        Listtemp.add("Surya");
        instance.insert(s,3);
        assertEquals(Listtemp, instance.getAll());
    }
    
    @Test
    public void correctstudentidTest() 
    {
        System.out.println("StudentTest");
        List Listtemp = new ArrayList();
        Listtemp.add("Ranjith");
        Listtemp.add("Kalai");
        Course instance = new Course(Listtemp);
        Listtemp.add("Surya");
        instance.insert(s,3);
        assertEquals(Listtemp, instance.getAll());
    }
    
    @Test
    public void invalidstudentidTest() 
    {
        System.out.println("StudentTest");
        List Listtemp = new ArrayList();
        Listtemp.add("Ranjith");
        Listtemp.add("Kalai");
        Course instance = new Course(Listtemp);
        assertEquals(null, instance.get("hhhh"));
    }
    
    @Test
    public void validstudentidwithpositionTest() 
    {
        System.out.println("validstudent");
        
        Course k=new Course(pst);
        List<Student> value=new ArrayList<Student>();
        
       List<Student> expResult = k.getAll();
         if(pst.contains(s)){
             value = k.getAll();
             
        }
        assertEquals(expResult, value);
    }
 
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }
 @Test
    public void testEqualsContainsStudentList() {
        System.out.println("equals");
       
        boolean expResult = true;
        boolean result =  false;
       
          Student stud = new Student("priya", "c0776677", "Female", 98.9);
          List<Student> s1= new ArrayList<Student>();
          Course c1= new Course(s1);
          Course c2 = new Course(s1);
            s1.add(stud);
        
        if(c1.equals(c2)){
            result = true;
        }
         assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsNotContainStudentList() {
        System.out.println("equals");
       
        boolean expResult = true;
        boolean result =  false;
       
          Student stud = new Student("priya", "c0776677", "Female", 98.9);
          Student stud2 = new Student("5656", "c0776645", "male", 93.25);
          List<Student> s1= new ArrayList<Student>();
          List<Student> s2= new ArrayList<Student>();
          Course c1= new Course(s1);
          Course c2 = new Course(s2);
            s1.add(stud);
            s2.add(stud2);
        if(c1.equals(c2)){
            result = true;
        }
         assertEquals(expResult, result);
    }
    
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
    
//    @Test
//    public void testGetAllByGender() {
//        System.out.println("getAllBygender");
//        String gender = "male";
//        Course instance = new Course(pst);
//        List<Student> expResult = new ArrayList<Student>();
//        expResult.add(s);
//        List<Student> result = instance.getAllByGender(gender);
//        assertEquals(expResult, result);
//        
//    }
}
