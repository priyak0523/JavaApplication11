/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author c0665769
 */
public class Course extends Student
{
  private List<Student> pList = new ArrayList<>();
  
  Student s= new Student("Bill Smith", "c0123456", "male",89.3);

    public Course()
    {
        
   }
    
    public Course(List<Student> stu)
    {
        
        this.pList=stu;
        getAll();
    }

 
    public List<Student> getAll()
    {
           return pList;
    }
    
    public void add( Student student)
    {
        pList.add(student);
        getAll();
    }
    public void remove(Student student)
    {
        pList.remove(student);
        getAll();
    }
     public void remove(String id)
    {
        int pos=0;
        boolean g=false;
        for(int i=0;i<pList.size();i++)
        {
            if (pList.get(i).equals(id)) 
                    {
                        pos=i;
                        i=1+pList.size();
                        g=true;
                    }
        }
        if (g==true)
        {
        pList.remove(pos);
        }
        
    }
     public void remove(int position)
    {
        pList.remove(position);
        getAll();
    }
     
      public void insert(Student student,int position)
    {
        pList.add(position,student);
        getAll();
    }
      public Student get(String id)
    {
//        int pos=0;
//        boolean g=false;
//        for(int i=0;i<pList.size();i++)
//        {
//            if (pList.get(i).equals(id)) 
//                    {
//                        pos=i;
//                        i=1+pList.size();
//                    }
//        }
//                if (g==false) 
//                { 
//                   return null;
//                }
//                else
//                {
//                   return pList<Student>;
//                }
        
        pList.add(s);
        
        if(pList.contains(id))
        {
            Course c= new Course();
            return (Student) c.getAll();
        }
        return null;
    }
      
      public Student get(int position)
    {
               
               if (position<0) 
                { 
                   return null;
                }
                else
                {
                   return pList.get(position);
                }
    }
      
  @Override
    public boolean equals(Object s)
    {
        if(s instanceof Course)
        {
            Course thatP = (Course) s;
            if (thatP.pList.equals(((Course) s).pList)) {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        
    }
@Override
    public String toString() {
         String output="";
      for(int i =0;i<this.pList.size();i++){  
          if(i!=this.pList.size()-1){
        output= output +"\t{ \"name\" : \"" + this.pList.get(i).getName() + "\", "
                + "\"id\" : \"" + this.pList.get(i).getId() +"\", "
                + "\"gender\" : \"" +this.pList.get(i).getGender() + "\", "
                + "\"grade\" : "+ this.pList.get(i).getGrade() +" },\n";
          }
        else{
           output= output +"\t{ \"name\" : \"" + this.pList.get(i).getName() + "\", "
                + "\"id\" : \"" + this.pList.get(i).getId() +"\", "
                + "\"gender\" : \"" +this.pList.get(i).getGender() + "\", "
                + "\"grade\" : "+ this.pList.get(i).getGrade() +" }\n"; 
        }
      }
        System.out.println(output);
        return "[\n"+output+"]";
    }  
    
    public List<Student> getAllByGender(String gender){
        List<Student> stg = new ArrayList<Student>();
        for(int i=0;i<pList.size();i++){
          if (pList.get(i).getGender().equals(gender)) 
        {
             stg.add(pList.get(i));
        }
        }
        return stg;
    }
    
     public Map getGradeMap(double score){
        Map<Integer, String> limits= new TreeMap<>();
        limits.put(50, "B");
        limits.put(90, "B+");
        limits.put(92, "A-");
        limits.put(96, "A");
        limits.put(101, "A+");
        for (Map.Entry<Integer, String> entry : limits.entrySet()) {
            int limit = entry.getKey();
            if (score < limit) {
                return limits;
            }
             
    }
      throw new AssertionError("Impossible case");        
      
}
      
    
}
