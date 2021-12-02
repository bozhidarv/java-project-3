import java.util.Date;

public class Person {
	private String name;
    private String title;
    private Date date;
    public Person()
    {
        name = " ";
        title = " ";
        date = new Date();
    }
    public Person(String name, String title)
    {
    this.name = name;
    this.title = title;
    date = new Date();

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString()
    {
        return "Name: "  + name+ "  Title:  " + title +  "  Date: " + date;
    }

}
