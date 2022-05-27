import java.io.IOException;
import java.util.ArrayList;

public class Plot extends Cartoons{
    ArrayList<Plot_el> plot = new ArrayList<>();

    public void add(String base, String begg, String max, String end) {

        Plot_el pl = new Plot_el();

        pl.setPlot_id(P_id());
        pl.setBase(base);
        pl.setBeggining(begg);
        pl.setThe_Climax(max);
        pl.setEnding(end);
        boolean add = plot.add(pl);
    }
    public void Del ( String p_id, String base, String begg, String max, String end){

        int P;
        for (P=0;P<plot.size(); P++)
        if (plot.get(P).getPlot_id().equals(p_id)&& plot.get(P).getBase().equals(base)&&
                plot.get(P).getBeggining().equals(begg)&& plot.get(P).getThe_Climax().equals(max)&&
                plot.get(P).getEnding().equals(end))
        {plot.remove(P);}
    }

    public void Red(String p_id,String new_base, String new_beg,
                   String new_max, String new_end)

        {for (Plot_el pl: plot) {
            if (pl.getPlot_id() == p_id) {
                pl.setBase(new_base);
                pl.setBeggining(new_beg);
                pl.setThe_Climax(new_max);
                pl.setEnding(new_end);

    }}}

    public void out(int out)
    {

        {System.out.println(" | "+plot.get(out).getPlot_id()+" | " + plot.get(out).getBase()+" | "
                + plot.get(out).getBeggining()+" | " + plot.get(out).getThe_Climax()+" | "
                + plot.get(out).getEnding()+" | ");}
        if (out == 01){

            System.out.println(" | "+plot.get(0).getPlot_id()+" | " + plot.get(0).getBase()+" | "
                    + plot.get(0).getBeggining()+" | " + plot.get(0).getThe_Climax()+" | "
                    + plot.get(0).getEnding()+" | ");
            System.out.println(" | "+plot.get(1).getPlot_id()+" | " + plot.get(1).getBase()+" | "
                    + plot.get(1).getBeggining()+" | " + plot.get(1).getThe_Climax()+" | "
                    + plot.get(1).getEnding()+" | ");
            System.out.println(" | "+plot.get(2).getPlot_id()+" | " + plot.get(2).getBase()+" | "
                    + plot.get(2).getBeggining()+" | " + plot.get(2).getThe_Climax()+" | "
                    + plot.get(2).getEnding()+" | ");

        }
    }
}

