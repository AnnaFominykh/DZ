public class User {
    private String name;
    private String password;
private  String role;

    public String GetName(){
        return name;
    }
    public void SetName(String name){
        this.name = name;
    }
    public String GetPassword() {
        return password;
    }
    public void SetPassword(String password) {
        this.password = password;
    }
    public  String GetRole (){return role;}
    public void SetRole(String role){this.role= this.role;}


    static void write_comm(){}
    static void del(){}
    static void red(){}

}
