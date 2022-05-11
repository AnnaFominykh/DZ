import java.util.ArrayList;
import java.util.Scanner;

public class admin extends Usual_u {
    static String c;

    static void write_comm(){
        System.out.println("Напишите коментарий.");
        Scanner m = new Scanner(System.in);
        String с = m.next();
    }

    static void del(){
        System.out.println("Вы хотите удалить коментарий?");
        System.out.println("1.Да");
        System.out.println("2.Нет");
        Scanner n = new Scanner(System.in);
        int choose = n.nextInt();
        switch (choose){
            case 1:
                System.out.println("Сообщение удалено.");
                break;
            case 2:
                System.out.println(c);

        }}

    static void add(String name, String pass, String role){
            ArrayList<User> registered =new ArrayList<>();
            User new_user= new User();
            new_user.SetPassword(pass);
            new_user.SetName(name);
            new_user.SetRole(role);
            registered.add(new_user);

        }


    static void cr(String name, String pass, String role) {
        ArrayList<User> registered =new ArrayList<>();
        User new_user= new User();
        new_user.SetRole(role);
        registered.add(Integer.parseInt(role), new_user);
    }
}
