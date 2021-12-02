public abstract class Course {
	private String name;
	public static int MAX_ATENDEES = 20;
	private String time;

	public Course() {
	}
	
	public Course(String name, int max_atendees, String time) {
		this.name = name;
		this.time = time;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "{" +
			" name='" + getName() + "'" +
			", time='" + getTime() + "'" +
			"}";
	}

}
