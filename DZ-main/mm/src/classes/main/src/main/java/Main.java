

    public class Main implements ua {
        public void name(){
            user.name();
        }
        public void aid(){
            application.id();
        }
        public void uid(){
            user.id();
        }
        public void place(){
            application.place();
        }

        public static void main (String[] args){
            Main main = new Main();
            System.out.println ("Введите имя пользоваетеля.");
            main.name();
            System.out.println ("Ваше id:");
            main.uid();
            System.out.println ("Номер заявки:");
            main.aid();
            System.out.println ("Место в очереди:");
            main.place();
        }
    }


