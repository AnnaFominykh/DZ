import java.util.Scanner;

public class moderator extends Usual_u {
    void del_us(){ Usual_u.del();}
    moderator mod = new moderator();

    static void write_comm(){
        System.out.println("Напишите коментарий.");
        Scanner m = new Scanner(System.in);
        String c = m.next();
    }
    static void del(){
        System.out.println("Вы хотите удалить коментарий?");
        System.out.println("1.Да");
        System.out.println("2.Нет");
        Scanner m = new Scanner(System.in);
        int choose = m.nextInt();
        switch (choose){
            case 1:
                
                System.out.println("Сообщение удалено.");
                break;
            case 2:
                System.out.println(c);

        }}
}

