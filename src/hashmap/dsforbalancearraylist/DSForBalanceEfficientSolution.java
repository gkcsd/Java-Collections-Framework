package hashmap.dsforbalancearraylist;

import java.util.HashMap;

class UsersList {
    HashMap<Integer,Integer> m;

    UsersList() {
        m = new HashMap<>();
    }

    int get(int id) {
        return m.get(id);
    }

    void set(int id, int balance) {
        m.put(id, balance);
    }
}

public class DSForBalanceEfficientSolution {
    public static void main(String[] args) {
        UsersList users = new UsersList();
        users.set(1, 1000);
        users.set(2,2000);

        System.out.println(users.get(1));

        users.set(1, 5000);

        System.out.println(users.get(1));
    }
}
