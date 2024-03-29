package Repository;

import Entity.User;

import java.util.ArrayList;

public class UserRepo implements UserRepoInterface {

    private ArrayList<User> userArrayList;

    public UserRepo() {
        userArrayList = new ArrayList<User>();
    }

    @Override
    public void addToList(User user){
        userArrayList.add(user);
    }

    @Override
    public void displayUsers() {
        for (int i = 0; i < userArrayList.size(); i++) {
            System.out.println(userArrayList.get(i).getName()+ "    " + userArrayList.get(i).getPhone() + " ");
        }
        System.out.println("Using a hypothetically better User storage method. PS need to learn Spring JPA");
    }
}
