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
        M2.mess(": Вы где?");
        M1.mess(": Мы тут.");
        M1.mess(": Бонжур.");
        M3.mess(": Тужур.;)");
        M1.mess(": Мерси боку.XD");
        M2.mess(": Хеллоу, пойдем в кино?");



        System.out.println(M1.message.get(0).get_u_id()+" : " + R1.registered.get(0).GetName()+
                 M1.message.get(0).getText()+" | " +M1.message.get(0).Get_m_id() );

        System.out.println(M1.message.get(1).get_u_id()+" : " + R1.registered.get(1).GetName()+
                M1.message.get(1).getText()+" | " +M1.message.get(1).Get_m_id() );

        System.out.println(M2.message.get(0).get_u_id()+" : " + R1.registered.get(2).GetName()+
                M2.message.get(0).getText()+" | " +M2.message.get(0).Get_m_id() );

        System.out.println(M1.message.get(2).get_u_id()+" : " + R1.registered.get(3).GetName()+
                M1.message.get(2).getText()+" | " +M1.message.get(2).Get_m_id() );

        System.out.println(M1.message.get(3).get_u_id()+" : " + R1.registered.get(4).GetName()+
                M1.message.get(3).getText()+" | " +M1.message.get(3).Get_m_id() );

        System.out.println(M3.message.get(0).get_u_id()+" : " + R1.registered.get(5).GetName()+
                M3.message.get(0).getText()+" | " +M3.message.get(0).Get_m_id() );

        System.out.println(M1.message.get(4).get_u_id()+" : " + R1.registered.get(6).GetName()+
                M1.message.get(4).getText()+" | " +M1.message.get(4).Get_m_id() );

        System.out.println(M2.message.get(1).get_u_id()+" : " + R1.registered.get(7).GetName()+
                M2.message.get(1).getText()+" | " +M2.message.get(1).Get_m_id() );


        for (int A= 0; A < M1.message.size(); A++){
            M1.message.get(A).Get_m_id();

        }


        for (int i= 0; i < M1.message.size(); i++){
            M1.message.get(i).get_u_id();

        }


        M1.del_m(": Мерси боку.XD","usual");
        M2.del_m(": Привет!","usual");

        for (int i = 0; i <  M1.message.size(); i++){
            System.out.println( M1.message.get(i).getText());
        }
        M3.add("Tabaxi","rogue10","usual");
        for (int i = 0; i <M3.registered.size(); i++){
            System.out.println(M3.registered.get(i).GetName());
        }


M1.write_comm("Может лучше в бассейн?");
        M2.write_comm("Лучше в кафе!");
M3.write_comm("Нет уж, сначало в кино, а потом хоть на хоккей");


M3.cr("Elf", "Ranger4", "usual");


            System.out.println( M3.registered.get(1).GetRole());


            M1.red(": Салют!",": Приветики!");

            System.out.println(M1.message.get(3).getText());

            M3.del("Hobbit","Wizard6","moderator");

        for (int i = 0; i <  R1.registered.size(); i++)
        {System.out.println( R1.registered.get(i).GetName());}
    }}
