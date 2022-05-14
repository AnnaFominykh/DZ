import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {
Main main = new Main();

        ArrayList<User> registered = new ArrayList();
        ArrayList<User> message = new ArrayList();

        Usual_u M1 = new Usual_u();
       Register R1= new Register();
//"Dwarf","Barbarian1","usual"



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

        System.out.println(R1.registered.get(0).GetName() + M1.message.get(0).getText());
        System.out.println(R1.registered.get(1).GetName() +M1.message.get(1).getText());
        System.out.println(R1.registered.get(2).GetName() +M1.message.get(2).getText());
        System.out.println(R1.registered.get(3).GetName() +M1.message.get(3).getText());
        System.out.println(R1.registered.get(4).GetName() +M1.message.get(4).getText());
        System.out.println(R1.registered.get(5).GetName() +M1.message.get(5).getText());
        System.out.println(R1.registered.get(6).GetName() +M1.message.get(6).getText());
        System.out.println(R1.registered.get(7).GetName() +M1.message.get(7).getText());

        System.out.println("");

        for (int A= 0; A < M1.message.size(); A++){
            System.out.println(M1.message.get(A).Get_m_id());

        }

        System.out.println("");

        for (int i = 0; i < R1.registered.size(); i++){
            System.out.println(R1.registered.get(i).get_u_id());
        }

   M1.red(": Мерси боку.XD");
        System.out.println(R1.registered.get(6).GetName() +M1.message.get(6).getText());
    }}
