import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Cartoons_dt> Cartoons = new ArrayList<>();
    ArrayList<Elements> elements = new ArrayList<>();
    ArrayList<Plot_el> plot = new ArrayList<>();

    Cartoons Ct = new Cartoons();
    Company E1 = new Company();
    Lore E2 = new Lore();
    Plot p = new Plot();

    Ct.add("Encanto",	"4.5");
    Ct.add("Onward", "4.5");
    Ct.add("Monsters, Inc.","5");

    E1.add("Disney", "US");
    E1.add("Pixar","US");

    E2.add("Mirabell","Alma","Columbia");
    E2.add("Iandore",	" - ","New Mushroomton");
E2.add("Sullivan"," Randall" , "Monsters Inc.");

p.add("Stop Craks","Cassita start cracking","Destruction of Cassita", "Rebilding Cassita");
p.add("Summon M.C. father","Part of wand breaks","Fighting whith dragon","Summoning M.C. father");
p.add("Return girl home","Girl appeared in Monster Inc.",
        "Fight whith Randall","Monster Inc. start work at laughter");

        for (int c= 0; c <  Ct.Cartoons.size(); c++){
            Ct.Cartoons.get(c).getCart_id();
        }

        for (int C= 0; C < Ct.Cartoons.size(); C++){
            Ct.Cartoons.get(C).getCompany_id();
        }
        for (int c= 0; c < Ct.Cartoons.size(); c++){
            Ct.Cartoons.get(c).getCart_id();
        }
        for (int P= 0; P < Ct.Cartoons.size(); P++){
            Ct.Cartoons.get(P).getPlot_id();
        }

        System.out.println("  ");
        // out == id ("0","1"...) или "all"
        E1.out(01);
        System.out.println("  ");
        E2.out(01);
        System.out.println("  ");
        p.out(01);
        System.out.println("  ");
        Ct.out(01);
        System.out.println("  ");

        Ct.add("Alladin","5");
Ct.out(3);
        E1.add("Disney", "US");
        E1.out(2);
        E2.add("Alladin","Jafar","Agraba" );
       E2.out(3);
        p.add("Make Jasmin fall in love, defeat Jafar",
                "Finding lamp","Fight with Jafar","Free Genie");
       p.out(3);
        Ct.Red(Ct.Cartoons.get(3).getCart_id(),"The Cat Returns","4" );
        E1.Red(E1.elements.get(2).getCompany_id(),"Studio Ghibli ","JP");
        E2.Red(E2.elements.get(3).getLore_id(),"Haru","Cat King","The Cat Kingdom");
        p.Red(p.plot.get(3).getPlot_id(),"Bring Haru home","Haru save the cat prince","Tower collapse"
                , "Haru back home");

        System.out.println("");




       /* Ct.Del(Ct.Cartoons.get(0).getCart_id(),"The Cat Returns","4" );
        E1.Del(E1.elements.get(2).getCompany_id(),"Studio Ghibli ","JP");
        E2.Del(E2.elements.get(3).getPlot_id(),"Haru","Cat King","The Cat Kingdom");
        p.Del(p.plot.get(3).getPlot_id(),"Bring Haru home","Haru save the cat prince","Tower collapse"
                , "Haru back home");


        for (int i = 0; i<Ct.Cartoons.size(); i++){

            System.out.println(Ct.Cartoons.get(i).getName());
        }

        for (int i = 0; i<E1.elements.size(); i++){

            System.out.println(Ct.Cartoons.get(i).getName());
        }

        for (int i = 0; i<Ct.Cartoons.size(); i++){

            System.out.println(Ct.Cartoons.get(i).getName());
        }

        for (int i = 0; i<Ct.Cartoons.size(); i++){

            System.out.println(Ct.Cartoons.get(i).getName());
        }*/

}}
