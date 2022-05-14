import java.util.ArrayList;
import java.util.Scanner;

public class admin extends Usual_u {
    static String c;



    public void mess (String Mid,String text) {
        User new_user = new User();
        new_user.set_m_id(Mid);
        new_user.setText(text);
        this.message.add(new_user);

    }


    void write_comm( String uID, String Mid, String text) {

        User new_user1 = new User();
        new_user1.set_m_id(Mid);
        new_user1.setText(text);
        this.message.add(new_user1);
    }
    public void id_m (String uID, String text)
    {
        String Mid ="";


        String poss="1234567890";
        for (int i = 0; i < 4; i++){
            Mid+=poss.charAt((int) ((Math.random()* (poss.length() - 0)) + 0));
        }
        User new_user = new User();
        new_user.set_u_id(uID);
        new_user.set_m_id(Mid);
        new_user.setText(text);
        this.message.add(new_user);
    }

    public void del_m(String text){
        System.out.println("Вы хотите удалить коментарий?");
        System.out.println("1.Да");
        System.out.println("2.Нет");
        Scanner n = new Scanner(System.in);
        int choose = n.nextInt();
        switch(choose) {
            case 1:
                int d;
                for (d=0;d<message.size();d++);
                if (message.get(d).getText().equals(text));
            {message.remove(d);}
            System.out.println("Сообщение удалено.");
            break;
            case 2:
                System.out.println("Удаление отменено.");
        }
        }

    public void add(String name, String pass, String role){
        System.out.println("Вы хотите добавить нового пользователя?");
        System.out.println("1.Да");
        System.out.println("2.Нет");

        int ch = 0;

        switch (ch) {

            case 1:
                ArrayList<User> registered = new ArrayList<>();
                User new_user = new User();
                new_user.SetPassword(pass);
                new_user.SetName(name);
                new_user.SetRole(role);
                registered.add(new_user);
                break;
            case 2:
                System.out.println("Новый пользователь не добавлен.");
        }

    }

public void del_p(String name, String pass, String role, String uID){
    int u;
    for (u=0;u<registered.size();u++);
    if (registered.get(u).GetName().equals(name)&& registered.get(u).GetPassword().equals(pass)&&
            registered.get(u).GetRole().equals(role)&&registered.get(u).get_u_id().equals(uID));
    {registered.remove(u);}
}


    public void cr(String name, String pass, String role) {
        ArrayList<User> registered =new ArrayList<>();
        User new_user= new User();
        new_user.SetRole(role);
        registered.add(Integer.parseInt(role), new_user);
    }
}
