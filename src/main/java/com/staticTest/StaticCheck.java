/**
 * 
 */
package com.staticTest;

/**
 * @author pravendra.singh
 *
 */

class StaticCheck
{
   int eid;
   String name;
   static String company_name;

   static {
    company_name ="StudyTonight";    //static block invoked before main() method
    System.out.println(company_name);
    }

    public void show()
    {
        System.out.println(eid+" "+name+" "+company_name);
    }
    public static void main( String[] args )
    {
    	StaticCheck se1 = new StaticCheck();
     se1.eid = 104;
     se1.name = "Abhijit";
     se1.show();

    }

}