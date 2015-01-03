/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author Danish Akbar
 */
public class Test {

    WasRun instance = null;

    public void setup() {
        instance = new WasRun("testMethod");
    }

    public void testRunning() {

        instance.run();
        assert instance.wasRun;
        System.out.println(instance.wasRun);

    }

    public void testSetUp() {

        instance.run();
        assert "wasSetup testMethod".equals(instance.log);
        System.out.println("wasSetup testMethod".equals(instance.log));
    }

    public void testTemplateMethod() {

        instance = new WasRun("testMethod");
        instance.run();
        assert ("setUp testMethod ".equals(instance.log));
        System.out.println("wasSetup testMethod tearDown".equals(instance.log));


    }

    public void testResult() {

        instance = new WasRun("testMethod");
        TestResult result = instance.run();
        assert ("1 run, 0 failed".equals(result.Summary()));
        System.out.println("1 run, 0 failed".equals(result.Summary()));
    }

    public void testFailed() {
        instance = new WasRun("testBrokenMethod");
        TestResult result = instance.run();
        assert ("1 run, 1 failed".equals(result.Summary()));
        System.out.println("1 run, 1 failed".equals(result.Summary()));
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.TestStarted();
        result.TestFailed();
        assert ("1 run,1 failed".equals(result.Summary()));
        System.out.println("1 run,1 failed".equals(result.Summary()));
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.setup();
        t.testRunning();
        t.testSetUp();
        t.testTemplateMethod();
        t.testResult();
        t.testFailed();
        t.testFailedResultFormatting();
    }
}
