import java.util.ArrayList;


public class Register extends User {
     ArrayList<User> registered =new ArrayList<>();

    public void Reg(String name,String pass)
    {
        User new_user= new User();
        new_user.SetPassword(pass);
        new_user.SetName(name);
        registered.add(new_user);


    }
    public void Reg(String name)
    {

        String pass ="";


        String poss="AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuWwXxYyZz1234567890!@#$%^&*_-+=':;";
        for (int i = 0; i < 10; i++){
            pass+=poss.charAt((int) ((Math.random() * (poss.length() - 0)) + 0));
        }

        User new_user= new User();
        new_user.SetPassword(pass);
        new_user.SetName(name);
        registered.add(new_user);

    }
    public void del(String name,String pass)
    {


        int d;
     for (d=0;d<registered.size();d++){
     if (registered.get(d).GetName().equals(name)&& registered.get(d).GetPassword().equals(pass));
        {registered.remove(d);}
    }
}}
