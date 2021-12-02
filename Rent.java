public class Rent extends Course {
	private String name;
    
    private Person player;

    private int maxAtendees;

    public Rent() {
        super();
        maxAtendees = Course.MAX_ATENDEES;
    }


    public Rent(String name, Person player) {
        this.name = name;
        this.player = player;
    }

    public Rent(String name, Person player, int maxAtendees) {
        this.name = name;
        this.player = player;
        this.maxAtendees = maxAtendees;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPlayer() {
        return this.player;
    }

    public void setPlayer(Person player) {
        this.player = player;
    }

    public int getMaxAtendees() {
        return this.maxAtendees;
    }

    public void setMaxAtendees(int maxAtendees) {
        this.maxAtendees = maxAtendees;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", player='" + getPlayer() + "'" +
            ", maxAtendees='" + getMaxAtendees() + "'" +
            "}";
    }

    

}
