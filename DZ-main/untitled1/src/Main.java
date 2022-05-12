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

        M1.mess();

    }}
