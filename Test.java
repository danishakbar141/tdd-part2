/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author Danish Akbar
 */
public class Test extends TestCase {

    private WasRun instance;
    private TestSuite suite;

    Test(String testMethodName) {
        super(testMethodName);
    }

    public void setup() {
        result = new TestResult();
    }

    public void testSetUp() {
        instance = new WasRun("testMethod");
        instance.run(result);
        assert "wasSetup testMethod".equals(instance.log);
        System.out.println("wasSetup testMethod".equals(instance.log));
    }

    public void testTemplateMethod() {

        instance = new WasRun("testMethod");
        instance.run(result);
        assert ("setUp testMethod ".equals(instance.log));
        System.out.println("wasSetup testMethod tearDown".equals(instance.log));


    }

    public void testResult() {

        instance = new WasRun("testMethod");
        instance.run(result);
        assert ("1 run, 0 failed".equals(result.Summary()));
        System.out.println("1 run, 0 failed".equals(result.Summary()));
    }

    public void testFailed() {
        instance = new WasRun("testBrokenMethod");
        instance.run(result);
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

    public void testsuite() {

        instance = new WasRun("testMethod");
        instance.run(result);
        assert ("setUp testMethod ".equals(instance.log));
        System.out.println("wasSetup testMethod tearDown".equals(instance.log));


    }

    public static void main(String[] args) {
        TestSuite suite = new TestSuite();
        TestResult result = new TestResult();
        suite.add(new Test("testTemplateMethod"));
        suite.add(new Test("testResult"));
        suite.add(new Test("testFailedResultFormatting"));
        suite.add(new Test("testFailedResult"));
        suite.add(new Test("testSuite"));
        suite.run(result);
        System.out.println(result.Summary());
    }
}
