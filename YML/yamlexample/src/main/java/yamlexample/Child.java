package yamlexample;

/*
 * YAML is a case sensitive languague hence photoId and category
 * desscribed in the YAML file and the Child.jave variables are 
 * exactly the same.
 * */
public class Child {

	String photoId;
	String category;
	
	public String getPhotoId() {
		return photoId;
	}
	
	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Child [photoId=" + photoId + ", category=" + category + "]";
	}
	
	
}
