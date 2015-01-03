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
    TestResult(){
    runCount=0;
    }
    public void TestStarted(){
    runCount+=1;
    }
    public String Summary(){
    return runCount+" run, 0 failed";
    }
}
