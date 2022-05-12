
public class Main extends User {
    public void write_u(){
        Usual_u.write_comm();
    }
    public void write_a(){
        admin.write_comm();
    }
    public void write_m(){
       moderator.write_comm();
    }
    public void del_u(){
        Usual_u.del();
    }
    public void del_a(){
        admin.del();
    }
    public void del_m(){
        moderator.del();
    }
    public static void red(){
        Usual_u.red();
    }
    public void add(String name,String pass,String role){
        admin.add(name,pass,role);
    }
    public void cr (String name,String pass,String role){
        admin.cr(name,pass,role);
    }


    public static void main(String[] args)
    {
       Main main = new Main();



       Register R1= new Register();

        R1.Reg("Dwarf","Barbarian1","usual");
        R1.Reg("Elf","Ranger4","usual" );
        R1.Reg("Hobbit","Wizard6","usual");
        R1.Reg("Half-orc","Monk10","usual");
        R1.Reg("Dragonborn","Sorcerer5","");
        R1.Reg("Human","Bard9","admin");
        R1.Reg("Half-elf","Cleric5","moderator");
        R1.Reg("Tiefling","Rouge7","moderator" );



R1.Reg("Dwarf","Barbarian1","usual");

main.write_u();

        main.red();

        main.del_u();
        main.del_m();
    }
}
