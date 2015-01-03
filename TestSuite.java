/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class TestSuite {
    ArrayList<TestCase> tests;

    public TestSuite() {
        tests=new ArrayList<TestCase>();
    }
    public void add(TestCase test){
        tests.add(test);
    }
    public TestResult run(TestResult result){
   for (TestCase obj:tests){
     obj.run(result);
   }
    return result;
    }
            
            
            
            
            
           
    
}
