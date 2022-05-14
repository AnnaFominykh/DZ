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


       public void del_m(String text,String role) {

           System.out.println("Вы хотите удалить коментарий?");
           System.out.println("1.Да");
           System.out.println("2.Нет");
           Scanner n = new Scanner(System.in);
           int choose = n.nextInt();
           switch (choose) {
               case 1:
                   if (role == "usual") {
                       int u;
                       String a = "Сообщение удалено.";
                       for (u = 0; u < message.size(); u++) ;
                       if (message.get(u).getText().equals(text)) ;
                       {
                           message.remove(u);
                       }
                       System.out.println("Сообщение удалено.");
                   }
                   else System.out.println("Вы не можете удалить это сообщение.");
                   break;
               case 2:
                   System.out.println("Удаление отменено.");

           }

       }
        public void red( String text) {
            System.out.println("Вы хотите редактировать коментарий?");
            System.out.println("1.Да");
            System.out.println("2.Нет");
            Scanner n = new Scanner(System.in);
            int choose = n.nextInt();
            switch(choose) {
                case 1:
                    text=getText();
                    System.out.println("Напишите заново сообщение.");
                    Scanner g = new Scanner(System.in);
                    text = g.next();



                    break;
                case 2:
                    System.out.println(text);

            }
            User new_user1 = new User();
            int a;
            for (a=0;a<message.size();a++);
            new_user1.equals(text);

            new_user1.setText(text);
            this.message.add(new_user1);
        }
    }

