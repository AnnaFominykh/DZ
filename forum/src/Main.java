import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        ArrayList<User> registered = new ArrayList();
        ArrayList<Messages> message = new ArrayList();

        Usual_u M1 = new Usual_u();
        moderator M2 = new moderator();
        admin M3 = new admin();
        Register R1= new Register();


        R1.Reg("Dwarf", "Barbarian1", "usual");
        R1.Reg("Elf", "Ranger4", "usual");
        R1.Reg("Hobbit","Wizard6","moderator");
        R1.Reg("Half-orc","Monk10","usual");
        R1.Reg("Dragonborn","Sorcerer5","usual");
        R1.Reg("Human","Bard9","admin");
        R1.Reg("Half-elf","Cleric5","usual");
        R1.Reg("Tiefling","moderator");

        M1.mess(": Привет!");
        M1.mess(": Салют!");
        M1.mess(": Вы где?");
        M1.mess(": Мы тут.");
        M1.mess(": Бонжур.");
        M1.mess(": Тужур.;)");
        M1.mess(": Мерси боку.XD");
        M1.mess(": Хеллоу, пойдем в кино?");



        System.out.println(M1.message.get(0).get_u_id()+" : " + R1.registered.get(0).GetName()+
                 M1.message.get(0).getText()+" | " +M1.message.get(0).Get_m_id() );

        System.out.println(M1.message.get(1).get_u_id()+" : " + R1.registered.get(1).GetName()+
                M1.message.get(1).getText()+" | " +M1.message.get(1).Get_m_id() );

        System.out.println(M1.message.get(2).get_u_id()+" : " + R1.registered.get(2).GetName()+
                M1.message.get(2).getText()+" | " +M1.message.get(2).Get_m_id() );

        System.out.println(M1.message.get(3).get_u_id()+" : " + R1.registered.get(3).GetName()+
                M1.message.get(3).getText()+" | " +M1.message.get(3).Get_m_id() );

        System.out.println(M1.message.get(4).get_u_id()+" : " + R1.registered.get(4).GetName()+
                M1.message.get(4).getText()+" | " +M1.message.get(4).Get_m_id() );

        System.out.println(M1.message.get(5).get_u_id()+" : " + R1.registered.get(5).GetName()+
                M1.message.get(5).getText()+" | " +M1.message.get(5).Get_m_id() );

        System.out.println(M1.message.get(6).get_u_id()+" : " + R1.registered.get(6).GetName()+
                M1.message.get(6).getText()+" | " +M1.message.get(6).Get_m_id() );

        System.out.println(M1.message.get(7).get_u_id()+" : " + R1.registered.get(7).GetName()+
                M1.message.get(7).getText()+" | " +M1.message.get(7).Get_m_id() );


        for (int A= 0; A < M1.message.size(); A++){
           M1.message.get(A).Get_m_id();

        }


        for (int i= 0; i < M1.message.size(); i++){
          M1.message.get(i).get_u_id();

        }


        M1.del_m(": Мерси боку.XD","usual");

        for (int i = 0; i <  M1.message.size(); i++){
            System.out.println( M1.message.get(i).getText());
        }
       // https://overcoder.net/q/85549/%D0%BA%D0%B0%D0%BA-%D0%B8%D0%B7%D0%BC%D0%B5%D0%BD%D0%B8%D1%82%D1%8C-%D0%B7%D0%BD%D0%B0%D1%87%D0%B5%D0%BD%D0%B8%D0%B5-%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D0%B0-arraylist-%D0%B2-java


    }}
