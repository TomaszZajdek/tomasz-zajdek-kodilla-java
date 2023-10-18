package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import javax.crypto.spec.PSource;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String word = "Kodilla lambda";
        poemBeautifier.beautify(word, string -> string.toUpperCase());
        poemBeautifier.beautify(word, string -> "ABC" + string + "ABC");
        poemBeautifier.beautify(word, string -> string + "ma " + string.length() + " liter");
        poemBeautifier.beautify(word, string -> string + string + string + string);

        System.out.println();

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
        System.out.println();


        //  [ 7.3 ] funkcyjny spacer po liście użytkowników forum

        Forum forum = new Forum();
        ForumUser forumUser1 = new ForumUser(1, "User1", 'M', LocalDate.of(2000, 1, 15), 5);
        ForumUser forumUser2 = new ForumUser(2, "User2", 'M', LocalDate.of(2005, 1, 15), 5);
        ForumUser forumUser3 = new ForumUser(3, "User3", 'F', LocalDate.of(2005, 1, 15), 5);
        ForumUser forumUser4 = new ForumUser(3, "User4", 'M', LocalDate.of(1999, 1, 15), 0);
        forum.addToUserList(forumUser1);
        forum.addToUserList(forumUser2);
        forum.addToUserList(forumUser3);
        forum.addToUserList(forumUser4);
        Map<Integer, ForumUser> userMap = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> user.getDateOfBirth().getYear() > 2003)
                .filter(forumUser -> forumUser.getPostsCount() > 1)
                .collect(Collectors.toMap(user -> user.getUserId(), user -> user));

        System.out.println(userMap);

        System.out.println();

    }
}