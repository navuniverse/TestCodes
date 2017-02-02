/**
 * 
 */
package custom.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation to put a condition on which method to execute and which is
 * not
 * 
 * @author naveen.kumar
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExecuteMethod {

    boolean isEnabled() default true;
}
