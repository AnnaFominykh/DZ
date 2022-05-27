

import java.io.IOException;
import java.util.ArrayList;

public class Cartoons {
    int id=1;

    ArrayList<Cartoons_dt> Cartoons = new ArrayList<>();


    public String C_ID()
    {

        String C_id="";
        int C_ID;
        C_ID=id;
        id+=1;
        C_id+=C_ID;

        return C_id;
    }

    public String cart_ID()
    {

        String cart_id="";
        int c_ID;
        c_ID=id;
        id+=1;
        cart_id+=c_ID;

        return cart_id;
    }

    public String L_id()
    {
        String l_id="";
        int L_ID;
        L_ID=id;
        id+=1;
        l_id+=L_ID;

        return l_id;
    }

    public String P_id()
    {

        String p_id="";
        int P_ID;
        P_ID=id;
        id+=1;
        p_id+=P_ID;

        return p_id;
    }


    public void add(String name,String rait) {

        Cartoons_dt C_dt = new Cartoons_dt();
        C_dt.setCart_id(cart_ID());
        C_dt.setName(name);
        C_dt.setRaiting(rait);
        boolean add = Cartoons.add(C_dt);
    }

    public void Del(String Cart_id, String name, String rait)
    {
        int a;
        for (a=0;a<Cartoons.size(); a++){
        if (Cartoons.get(a).getName().equals(name)&& Cartoons.get(a).getCart_id().equals(Cart_id)&&
              Cartoons.get(a).getRaiting().equals(rait));
        {Cartoons.remove(a);}}}

    public void Red (String c_id, String new_name, String new_rait)
    {
        for (Cartoons_dt cart:Cartoons) {
            if (cart.getCart_id() == c_id) {
                cart.setName(new_name);
                cart.setRaiting(new_rait);
            }

        }}

    public void out(int out)

    {System.out.println(" | "+Cartoons.get(out).getCart_id()+" | " + Cartoons.get(out).getName()+" | "+
                    Cartoons.get(out).getRaiting()+" | ");

        if (out == 01){
            System.out.println(" | "+Cartoons.get(0).getCart_id()+" | " + Cartoons.get(0).getName()+" | "+
                    Cartoons.get(0).getRaiting()+" | ");
            System.out.println(" | "+Cartoons.get(1).getCart_id()+" | " + Cartoons.get(1).getName()+" | "+
                    Cartoons.get(1).getRaiting()+" | ");
    }
}}








