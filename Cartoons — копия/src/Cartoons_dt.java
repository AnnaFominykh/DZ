public class Cartoons_dt {
    private String name;
    private String cart_id;
    private String Company_id;
    private String Lore_id;
    private String Plot_id;
private String Raiting;


    public String getCompany_id() {
        return Company_id;
    }

    public void setCompany_id(String C_id) {
        this.Company_id=C_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLore_id() {
        return Lore_id;
    }

    public void setLore_id(String l_id) {
        this.Lore_id=l_id;
    }

    public String getPlot_id() {
        return Plot_id;
    }

    public void setPlot_id(String p_id) {
        this.Plot_id=p_id;
    }

    public String getRaiting() {
        return Raiting;
    }

    public void setRaiting(String rait) {
       this.Raiting = rait;
    }

    public String getCart_id() {
        return cart_id;
    }

    public void setCart_id(String cart_id) {
        this.cart_id = cart_id;
    }
}
