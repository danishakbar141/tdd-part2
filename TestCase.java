/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Danish Akbar
 */
public class TestCase {
    private String name;

    public TestCase(String name) {
        this.name = name;
    }
     public void run() throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//         Method method=this.getClass().getMethod(name);
//         method.invoke(this);
         Method method2=this.getClass().getDeclaredMethod(name);
         method2.setAccessible(true);
         method2.invoke(this, null);
         
     }
     public void setup(){
         
     }
}
