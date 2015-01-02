/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author Danish Akbar
 */
public class WasRun extends TestCase{
    public boolean wasRun;
    public boolean wasSetup;
    

    public WasRun(String name) {
        super(name);
        this.wasRun = false;
    }
    private void testMethod(){
        wasRun=true;
    }

   public void wasSetup() {
        wasRun=false;
        wasSetup=true;
    }
    
}
