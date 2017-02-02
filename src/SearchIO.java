import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * 
 */

/**
 * @author naveen.kumar
 * 
 */
public class SearchIO {

    /**
     * Using IO
     * 
     * @param directoryName
     * @return
     */
    public static boolean listFilesAndFilesSubDirectoriesUsingIO(
            String directoryName) {

        File directory = new File(directoryName);
        // get all the files from a directory
        File[] fList = directory.listFiles();
        if (fList != null) {
            for (File file : fList) {
                String fileName = file.getName();
                // check whether the fileName is pom and of type xml
                if ((fileName.substring(fileName.lastIndexOf(".") + 1,
                        fileName.length()).equalsIgnoreCase("xml"))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Using NIO
     * 
     * @param directoryName
     * @return
     */
    public static boolean listFilesAndFilesSubDirectoriesUsingNIO(
            String directoryName) {

        String pattern = "*.xml";
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(
                "glob:" + pattern);
        File directory = new File(directoryName);
        // get all the files from a directory
        File[] fList = directory.listFiles();
        if (fList != null) {
            for (File file : fList) {
                Path fileName = Paths.get(file.getName());

                // check whether the fileName is pom and of type xml
                if (fileName != null && matcher.matches(fileName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * The main method.
     * 
     * @param args
     *            the arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("NORMAL IO");
        long startTime = System.currentTimeMillis();

        boolean result = listFilesAndFilesSubDirectoriesUsingIO("E:/Files");

        long endTime = System.currentTimeMillis();

        long timeTaken = endTime - startTime;
        System.out.println("Start Time: " + startTime + "\nEnd Time: "
                + endTime + "\nTime taken: " + timeTaken);
        System.out.println("File found: " + result);

        System.out.println("\nUSING NIO");
        startTime = System.currentTimeMillis();

        result = listFilesAndFilesSubDirectoriesUsingNIO("E:/Files");

        endTime = System.currentTimeMillis();

        timeTaken = endTime - startTime;
        System.out.println("Start Time: " + startTime + "\nEnd Time: "
                + endTime + "\nTime taken: " + timeTaken);
        System.out.println("File found: " + result);
    }
}
