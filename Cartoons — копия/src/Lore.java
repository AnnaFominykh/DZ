import java.io.IOException;
import java.util.ArrayList;

public class Lore extends Cartoons{
    ArrayList<Elements> elements = new ArrayList<>();

    public void add(String mc_name,String ag_name,String loc) {

        Elements el = new Elements();
        el.setLore_id(L_id());
        el.setCName(mc_name);
        el.setAname(ag_name);
        el.setLocation(loc);
        boolean add = elements.add(el);
    }

    public void Del ( String L_id, String mc_name,String ag_name, String loc){
        int L;
        for (L=0;L<elements.size(); L++)
        if (elements.get(L).getCname().equals(mc_name)&&elements.get(L).getAname().equals(ag_name)&&
                elements.get(L).getLore_id().equals(L_id)&& elements.get(L).getLocation().equals(loc))
        {elements.remove(L);}
    }

    public void Red(String L_id,String new_Cname,String new_aname, String new_loc)
    {   for (Elements EL2:elements) {
        if (EL2.getLore_id() == L_id) {
            EL2.setCName(new_Cname);
            EL2.setAname(new_aname);
            EL2.setLocation(new_loc);
        }}}

    public void out(int out)
    {
        System.out.println(" | "+elements.get(out).getLore_id()+" | " + elements.get(out).getCname()+" | "
                + elements.get(out).getAname()+" | " + elements.get(out).getLocation()+" | ");
        if (out == 01){
                  System.out.println(" | "+elements.get(0).getLore_id()+" | " + elements.get(0).getCname()+" | "
                          + elements.get(0).getAname()+" | " + elements.get(0).getLocation()+" | ");
                  System.out.println(" | "+elements.get(1).getLore_id()+" | " + elements.get(1).getCname()+" | "
                    + elements.get(1).getAname()+" | "+ elements.get(1).getLocation()+" | ");
            System.out.println(" | "+elements.get(2).getLore_id()+" | " + elements.get(2).getCname()+" | "
                    + elements.get(2).getAname()+" | "+ elements.get(2).getLocation()+" | ");

        }}}


