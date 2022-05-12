import java.util.Scanner;

public class moderator extends Usual_u {


   public void write_comm( String Mid,String text) {

        User new_user1 = new User();
        new_user1.set_m_id(Mid);
        new_user1.setText(text);
        this.message.add(new_user1);
    }
    public void id_m (String text)
    {
        String Mid ="";


        String poss="1234567890";
        for (int i = 0; i < 4; i++){
            Mid+=poss.charAt((int) ((Math.random()* (poss.length() - 0)) + 0));
        }
        User new_user1 = new User();
        new_user1.set_m_id(Mid);
        new_user1.setText(text);
        this.message.add(new_user1);

    }




   public void del_m (String uID, String Mid, String text,String role) {
        System.out.println("Вы хотите удалить коментарий?");
        System.out.println("1.Да");
        System.out.println("2.Нет");
        Scanner n = new Scanner(System.in);
        int choose = n.nextInt();
        switch(choose) {
            case 1: if (role=="usual"){
                int d;
                for (d=0;d<message.size();d++);
                if (message.get(d).Get_m_id().equals(Mid)&& message.get(d).get_u_id().equals(uID));
            {message.remove(d);}
            System.out.println("Сообщение удалено.");}
               else
            {System.out.println("Вы не можете удалить это сообщение.");}
            break;
            case 2:
                System.out.println("Удаление отменено.");
        }

    }
}
