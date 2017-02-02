/**
 * 
 */
package custom.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class to read the custom annotations placed on {@link AnnotationClass} and
 * perform the required operations
 * 
 * @author naveen.kumar
 * 
 */
public class AnnotationParser {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // creating class instance of AnnotationClass that is using custom
        // annotations
        Class<AnnotationClass> obj = AnnotationClass.class;

        // Processing annotation ClassInfo
        // checking if object of AnnotationClass contains the ClassInfoo
        // annotation
        if (obj.isAnnotationPresent(ClassInfo.class)) {
            // getting the ClassInfo custom annotation and creating its object
            Annotation annotation = obj.getAnnotation(ClassInfo.class);
            ClassInfo classInfo = (ClassInfo) annotation;

            System.out.println("Class Information From Annotation: ");
            System.out.println("Priority: " + classInfo.priority());
            System.out.println("Created By: " + classInfo.createdBy());
            System.out.print("Tags: ");

            for (String tag : classInfo.tags()) {
                System.out.print(tag + ",");
            }

        }

        // Processing annotation ExecuteMethod
        for (Method method : obj.getDeclaredMethods()) {

            // checking if the method of class AnnotationClass contains the
            // annotation ExecuteMethod
            if (method.isAnnotationPresent(ExecuteMethod.class)) {

                // getting the ExecuteMethod custom annotation and creating its
                // object
                Annotation annotation = method
                        .getAnnotation(ExecuteMethod.class);
                ExecuteMethod executeMethod = (ExecuteMethod) annotation;

                // executing the target method if annotation is marked as true
                if (executeMethod.isEnabled()) {
                    try {
                        System.out
                                .println("\nInformation about Method:\nExecuting method "
                                        + method.getName());
                        method.invoke(obj.newInstance());
                    } catch (IllegalArgumentException e) {
                        System.out
                                .println(String
                                        .format("Error while invoking method %s. Error trace is: %s",
                                                method.getName(), e));
                    } catch (IllegalAccessException e) {
                        System.out
                                .println(String
                                        .format("Error while invoking method %s. Error trace is: %s",
                                                method.getName(), e));
                    } catch (InvocationTargetException e) {
                        System.out
                                .println(String
                                        .format("Error while invoking method %s. Error trace is: %s",
                                                method.getName(), e));
                    } catch (InstantiationException e) {
                        System.out
                                .println(String
                                        .format("Error while invoking method %s. Error trace is: %s",
                                                method.getName(), e));
                    }
                }
            }
        }
    }

}
