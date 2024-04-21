package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;


public class UsersManager {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepository();
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        List<User> chemistGroupAge = filterChemistAge(30);
        List<User> chemistGroupAgeAndPost = filterAgeAndPost(30,10);
    }
    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists")) // odwortna kolejność
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
    static List<User> filterChemistAge(int age) {
      List<User> userAgesList = UsersRepository.getUsersList()
              .stream()
              .filter(user -> user.getAge() >age)
              .collect(Collectors.toList());
        return userAgesList;
    }
    static List<User> filterAgeAndPost(int age, int post) {
        List<User> userAgesList = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .filter(user -> user.getNumberOfPost() < post)
                .collect(Collectors.toList());
        return userAgesList;
    }

    static List<String> filterChemistAgeAndPostThenName(int ageGreaterThan, int postLessThan) {
        List<String> userAgesList = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemist"))
                .filter(user -> user.getAge() > ageGreaterThan)
                .filter(user -> user.getNumberOfPost() < postLessThan)
                .map(UsersManager :: getUserName)
                .collect(Collectors.toList());
        return userAgesList;
    }
    public static String getUserName(User user) {
        return user.getUserName();
    }

}










