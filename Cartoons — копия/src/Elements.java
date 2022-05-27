public class Elements extends Cartoons_dt {
    private String Cname;
    private String name;
    private String aname;
    private String location;

    public String getName() {
        return name;
    }

    public void setCName(String Cname) {
        this.Cname = Cname;
    }
    public String getCname() {
        return Cname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String loc) {
        this.location = loc;
    }

    public String getAname (){return aname;}

    public void setAname(String aname) {
        this.aname = aname;
    }
}
