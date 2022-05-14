import java.util.ArrayList;

public class User {
    private String name;
    private String password;
    private  String role;
    private String text;
    private String m_id;
    private String u_id;

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
    public String getText() {return text;}
    public void setText (String text) {this.text=text;}
    public String Get_m_id() {return m_id;}
    public void set_m_id(String Mid) {this.m_id = Mid;}
    public String get_u_id() {return u_id;}
    public void set_u_id(String uId) {this.u_id = uId;}

    static void write_comm(){}
    static void del_m(){}
    void red(){}
    void id_m (){}

    ArrayList<User> registered =new ArrayList<>();
    public void a_id(String name) {

        String id = "1234567890";
        for (int i = 0; i < 4; i++) {
            id.charAt((int) ((Math.random() * (id.length() - 0)) + 0));
            User new_user= new User();
            new_user.SetName(name);
            registered.add(new_user);
        }}
    }

