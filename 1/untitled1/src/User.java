import java.util.ArrayList;

public class User {
    private String name;
    private String password;
 private String role;
 private  String message;

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
    public String GetRole(){return role;}
    public void  SetRole (String role){this.role = role;}


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


