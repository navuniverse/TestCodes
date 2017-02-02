/**
 * 
 */
package custom.annotations;

import custom.annotations.ClassInfo.Priority;

/**
 * This class is using custom annotations {@link ClassInfo} and
 * {@link ExecuteMethod}
 * 
 * @author naveen.kumar
 * 
 */
@ClassInfo(priority = Priority.HIGH, tags = { "custom annotations", "java" }, createdBy = "Naveen Kumar")
public class AnnotationClass {

    @ExecuteMethod(isEnabled = true)
    public void toExecute() {
        System.out
                .println("This method will be executed as its annotation says to execute");
    }

    @ExecuteMethod(isEnabled = false)
    public void notToExecute() {
        System.out
                .println("This method will not be executed as its annotation says not to execute");
    }
}
