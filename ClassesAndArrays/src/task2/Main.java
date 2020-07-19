package task2;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[15];
        users[0] = new User("Ruslan", "Atas",12,false);
        users[1] = new User("Ivan", "Ostapchuk",22,false);
        users[2] = new User("Roman", "Diduh",31,true);
        users[3] = new User("Ostap", "Ramen",27,true);
        users[4] = new User("Andriy", "Veselka",17,false);
        users[5] = new User("Anna", "Urgant",28,true);
        users[6] = new User("Igor", "Metan",24,false);
        users[7] = new User("Ura", "Buvalij",19,true);
        users[8] = new User("Adriana", "BogomDana",20,false);
        users[9] = new User("Vitalij", "Propianat",16,false);
        users[10] = new User("Petro", "Mohyla",29,true);
        users[11] = new User("Marta", "Kanat",37,true);
        users[12] = new User("Solomia", "Rafaello",18,false);
        users[13] = new User("Slava", "Ukraini",25,true);
        users[14] = new User("Murder", "AtMidnight",46,false);

        int countAdult = 0;
        int countMarried = 0;

        for (int i = 0; i < users.length; i++){
            if (users[i].age >= 18){
                countAdult++;
            }
        }

        for (int i = 0; i < users.length; i++){
            if (users[i].isMarried){
                countMarried++;
            }
        }

        User[] adultUsers = new User[countAdult];
        User[] marriedUsers = new User[countMarried];
        User[] minorUsers = new User[15 - countAdult];
        User[] freeUsers = new User[15 - countMarried];
        int pos = 0;
        int secPos = 0;

        for (int i = 0; i < users.length; i++){
            if (users[i].age >= 18){
                adultUsers[pos] = users[i];
                pos++;
            }
            else {
                minorUsers[secPos] = users[i];
                secPos++;
            }
        }
        pos = 0;
        secPos = 0;
        for (int i = 0; i < users.length; i++){
            if (users[i].isMarried){
                marriedUsers[pos] = users[i];
                pos++;
            }
            else {
                freeUsers[secPos] = users[i];
                secPos++;
            }
        }

        System.out.println("Adult Users:");
        for(User u : adultUsers){
            System.out.println(u.fullInfo());
        }
        System.out.println("========================");

        System.out.println("Minor Users: ");
        for(User u : minorUsers){
            System.out.println(u.fullInfo());
        }
        System.out.println("========================");

        System.out.println("Married Users: ");
        for(User u : marriedUsers){
            System.out.println(u.fullInfo());
        }
        System.out.println("========================");

        System.out.println("Free Users: ");
        for(User u : freeUsers){
            System.out.println(u.fullInfo());
        }

    }

}
