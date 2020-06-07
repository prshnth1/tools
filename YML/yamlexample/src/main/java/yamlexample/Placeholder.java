package yamlexample;

import java.util.List;

public class Placeholder {

	/*
	 * child:
 	 *	 - {photoId: "11", category: "smoke"}
 	 *	 - {photoId: "12", category: "regression"}
 	 *	 - {photoId: "13", category: "regression"} 
 	 *	
	 *Consider the yaml file as shown above, now we have created a list of child objects. 
	 *and note the lists are given a name child so we should create the list variable as
	 *child. 
	 */
	List<Child> child;

	public List<Child> getChild() {
		return child;
	}

	public void setChild(List<Child> child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "Placeholder [child=" + child + "]";
	}
	
	
	
}
