import java.util.ArrayList;
import java.util.List;

/**
 * Class to test the cloning functionality
 * 
 * @author naveen.kumar
 * 
 */
public class Cloning implements Cloneable {

	/**
	 * Inner class to test deep cloning functionality.
	 * 
	 * @author naveen.kumar
	 */
	class InnerClone {

		/** The inner name. */
		private String innerName;

		/**
		 * Gets the inner name.
		 * 
		 * @return the inner name
		 */
		public String getInnerName() {
			return innerName;
		}

		/**
		 * Sets the inner name.
		 * 
		 * @param innerName
		 *            the new inner name
		 */
		public void setInnerName(String innerName) {
			this.innerName = innerName;
		}

	}

	/** The inner clone. */
	private InnerClone innerClone;

	/** The list. */
	private List<String> list = null;

	/** The name. */
	private String name;

	/**
	 * Sets the inner clone.
	 * 
	 * @param innerClone
	 *            the new inner clone
	 */
	public void setInnerClone(InnerClone innerClone) {
		this.innerClone = innerClone;
	}

	/**
	 * Gets the inner clone.
	 * 
	 * @return the inner clone
	 */
	public InnerClone getInnerClone() {
		return innerClone;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the list.
	 * 
	 * @param list
	 *            the new list
	 */
	public void setList(List<String> list) {
		this.list = list;
	}

	/**
	 * Gets the list.
	 * 
	 * @return the list
	 */
	public List<String> getList() {
		list.add(getName());
		return list;
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws CloneNotSupportedException
	 *             the clone not supported exception
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		/* Original Object Preparation */
		Cloning originalObject = new Cloning();
		InnerClone innerClone = originalObject.new InnerClone();
		innerClone.setInnerName("InnerObject");
		originalObject.setList(new ArrayList<String>());
		originalObject.setName("Original");
		originalObject.setInnerClone(innerClone);

		/* Clone object Preparation */
		Cloning clonedObject = (Cloning) originalObject.clone();

		/* Original Object Details */
		System.out.println("Original Object Details: ");
		System.out.println("Object Name: " + originalObject);
		System.out.println("Name: " + originalObject.getName());
		System.out.println("List: " + originalObject.getList().size());
		System.out.println("InnerClone Object: " + originalObject.getInnerClone().getInnerName());

		/* Clone Object Details */
		System.out.println("\n\nCloned Object Details: ");
		System.out.println("Object Name: " + clonedObject);
		System.out.println("Name: " + clonedObject.getName());
		System.out.println("List: " + clonedObject.getList().size());
		System.out.println("InnerClone Object: " + clonedObject.getInnerClone().getInnerName());

		/* New Object Details */
		Cloning newObject = new Cloning();
		newObject = originalObject;
		System.out.println("\n\nNew Object Details: ");
		System.out.println("Object Name: " + newObject);
		System.out.println("Name: " + newObject.getName());
		System.out.println("List: " + newObject.getList().size());
		System.out.println("InnerClone Object: " + newObject.getInnerClone().getInnerName());

		/* Object Comparisons */
		System.out.println("\n\nObject Comparisons: ");
		System.out.println("originalObject equals clonedObject: " + originalObject.equals(clonedObject));
		System.out.println("originalObject == clonedObject: " + (originalObject == clonedObject));
		System.out.println("originalObject equals newObject: " + originalObject.equals(newObject));
		System.out.println("originalObject == newObject: " + (originalObject == newObject));
		System.out.println("clonedObject equals newObject: " + clonedObject.equals(newObject));
		System.out.println("clonedObject == newObject: " + (clonedObject == newObject));
	}

}
