package yamlexample;

public class Student extends Humans{
	String learn;

	public String getLearn() {
		return learn;
	}

	public void setLearn(String learn) {
		this.learn = learn;
	}

	@Override
	public String toString() {
		return "Student [learn=" + learn + "]";
	}
	
}
