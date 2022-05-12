import java.util.Scanner;

public class Usual_u extends User {
    static String c;

    static void write_comm(){
        System.out.println("Напишите коментарий.");
        Scanner m = new Scanner(System.in);
        c = m.next();
    }
 static void del() {
     System.out.println("Вы хотите удалить коментарий?");
     System.out.println("1.Да");
     System.out.println("2.Нет");
     Scanner n = new Scanner(System.in);
     int choose = n.nextInt();
     switch (choose){
         case 1:
             System.out.println("Сообщение удалено.");
         break;
         case 2:
               System.out.println(c);

     }}

static void red(){
    System.out.println("Вы хотите редактировать коментарий?");
    System.out.println("1.Да");
    System.out.println("2.Нет");
    Scanner n = new Scanner(System.in);
    int choose = n.nextInt();
    switch (choose){
        case 1:
            System.out.println("Напишите заново сообщение.");
            Scanner g = new Scanner(System.in);
            c = g.next();
     case 2: {
         System.out.println(c);
}}
    }}
