/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author Dani
 */
public class TestResult {
    public int runCount;
    public int errorCount;
    
    TestResult(){
    runCount=0;
    errorCount=0;
    }
    public void TestStarted(){
    runCount+=1;
    }
    public void TestFailed(){
    errorCount+=1;
    }
    public String Summary(){
    return runCount+" run,"+ errorCount+ " failed";
    }
}
