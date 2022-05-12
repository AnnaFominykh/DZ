public class Main {

    public static void main(String[] args) {

        Register R1 = new Register();
        R1.Reg("Dwarf", "Barbarian1");
        R1.Reg("Elf");
        R1.Reg("Elf", "Fighter3");
        R1.Reg("Hobbit", "Wizard6");
        R1.Reg("Hobbit", "Wizard6");
        R1.Reg("Half-orc", "Monk10");
        R1.Reg("Dragonborn", "Sorcerer5");
        R1.Reg("Human", "Bard9");
        R1.Reg("Half-elf");
        R1.Reg("Tiefling");

        for (int A= 0; A < R1.registered.size(); A++){
            System.out.println(R1.registered.get(A).GetPassword());

        }

        R1.del("Elf", "Fighter3");

        for (int i = 0; i < R1.registered.size(); i++){
            System.out.println(R1.registered.get(i).GetPassword());

        }
    }}
