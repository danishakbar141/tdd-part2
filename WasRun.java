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
    public String log;
    

    public WasRun(String name) {
        super(name);
        Setup();
    }
    private void testMethod(){
        wasRun=true;
        log+="testMethod";
    }
    public void testBrokenMethod() throws Exception{
    throw  new Exception();
    }

    @Override
   public void Setup() {
        wasRun=false;
        log="wasSetup ";
    }
    @Override
   public void tearDown(){
   log+="tearDown";
   }
    
}
