package hashmap.dsforbalancearraylist;

import java.util.ArrayList;

class User {
    int id, balance;
    User(int id,int balance) {
        this.id = id;
        this.balance = balance;
    }
}

class UserList {
    ArrayList<User> al;
    UserList(){
        al = new ArrayList<>();
    }

    int get(int id) {
        for(User x: al) {
            if(x.id == id) {
                return x.balance;
            }
        }
        return -1;
    }

    void set(int id,int balance) {
        for(User x: al) {
            if(x.id == id) {
                x.balance = balance;
                return;
            }
        }
        al.add(new User(id, balance));
    }
}

public class DSForBalanceNaiveSolution {
    public static void main(String[] args) {
        UserList users = new UserList();
        users.set(1,100);
        users.set(2, 2000);

        System.out.println(users.get(1));

        users.set(1, 5000);
        System.out.println(users.get(1));
    }
}
