import java.util.ArrayList;
import java.util.Scanner;

    public class Usual_u extends User {

        ArrayList<User> message = new ArrayList();
        ArrayList<User> registered =new ArrayList<>();



        public void mess (String Mid,String text) {
            User new_user1 = new User();
            new_user1.set_m_id(Mid);
            new_user1.setText(text);
            this.message.add(new_user1);
        }


      public   void write_comm( String Mid,String text) {


            User new_user1 = new User();
            new_user1.set_m_id(Mid);
            new_user1.setText(text);
            this.message.add(new_user1);
        }

        public void mess (String text)
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


       public void del_m(String uID, String Mid, String text) {
            System.out.println("Вы хотите удалить коментарий?");
            System.out.println("1.Да");
            System.out.println("2.Нет");
            Scanner n = new Scanner(System.in);
            int choose = n.nextInt();
            switch(choose) {
                case 1:
                    int d;
                    for (d=0;d<message.size();d++);
                    if (message.get(d).Get_m_id().equals(Mid)&& message.get(d).get_u_id().equals(uID));
                {message.remove(d);}
                    System.out.println("Сообщение удалено.");
                    break;
                case 2:
                    System.out.println("Удаление отменено.");
            }
        }

        void red(String Mid, String text) {
            System.out.println("Вы хотите редактировать коментарий?");
            System.out.println("1.Да");
            System.out.println("2.Нет");
            Scanner n = new Scanner(System.in);
            int choose = n.nextInt();
            switch(choose) {
                case 1:
                    System.out.println("Напишите заново сообщение.");
                    Scanner g = new Scanner(System.in);
                    text = g.next();
                case 2:
                    System.out.println(text);

            }
            User new_user1 = new User();
            new_user1.set_m_id(Mid);
            new_user1.setText(text);
            this.message.add(new_user1);
        }
    }

