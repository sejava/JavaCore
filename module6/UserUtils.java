package module6;

public class UserUtils {

    public static User[] uniqueUsers(User[] users) {
        User[] res = users;
        User[] EndRes = new User[users.length];

        int index = 0;

        for (int i = 0; i < users.length; i++) {
            EndRes[index] = users[i];
            for (int j = 0; j < res.length; j++) {
                if (EndRes[index].equals(res[j])) {
                    res[j] = null;
                    deleteEmptyUsers(res);
                }
            }
            if (deleteEmptyUsers(res).length == 0)
                break;
            index++;
        }
        return deleteEmptyUsers(EndRes);
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        int count = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance)
                count++;
        }

        User[] res = new User[count];
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                res[index] = users[i];
                index++;
            }
        }

        return res;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] res = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            res[i] = users[i].getId();
        }
        return res;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        int count = 0;
        for (User user : users) {
            if (user != null)
                count++;
        }
        User[] res = new User[count];
        int index = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                res[index] = users[i];
                index++;
            }
        }
        return res;
    }

}
