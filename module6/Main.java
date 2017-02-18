package module6;

/**
 * Created by pan on 01.02.17.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = new User[5];
        User user1 = new User(1,"test","test",2400,5000);
        User user2 = new User(2,"test","test",2400,5000);
        User user3 = new User(3,"test","test",2400,5000);
        User user4 = new User(4,"test","test",2400,2000);
        User user5 = new User(5,"test","test",2400,5000);

        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user3;
        users[4] = user2;

        System.out.println("Users With lBalance: ");
        for (User eeee : UserUtils.usersWithContitionalBalance(users,5000)) {
            System.out.println(eeee);
        }

        System.out.println(" \n Get users ID");
        for (long id : UserUtils.getUsersId(users)) {
            System.out.println(id);
        }

        System.out.println(" \n Pay Salary to USERS: ");
        for (User res : UserUtils.paySalaryToUsers(users)) {
            System.out.println(res);
        }

        System.out.println("\n UniqueUsers: ");
        for (User l : UserUtils.uniqueUsers(users)) {
            System.out.println(l);
        }




    }
}
