

public class Main {

    public static void main(String[] args) {

       Register R1= new Register();
        R1.Reg("Dwarf","Barbarian1");
        R1.Reg("Elf","Ranger4");
        R1.Reg("Elf","Fighter3");
        R1.Reg("Hobbit","Wizard6");
        R1.Reg("Hobbit","Wizard6");
        R1.Reg("Half-orc","Monk10");
        R1.Reg("Dragonborn","Sorcerer5");
        R1.Reg("Human","Bard9");
        R1.Reg("Half-elf","Cleric5");
        R1.Reg("Tiefling");
        System.out.println(R1.registered.get(7).GetPassword());
        System.out.println(R1.registered.get(1).GetPassword());
        System.out.println(R1.registered.get(1).GetName());
R1.del("Elf","Fighter3");
        System.out.println(R1.registered.get(2).GetPassword());
        System.out.println(R1.registered.get(2).GetName());
        System.out.println(R1.registered.get(3).GetPassword());
        System.out.println(R1.registered.get(3).GetName());
        System.out.println(R1.registered.get(4).GetPassword());
        System.out.println(R1.registered.get(4).GetName());


    }
}
