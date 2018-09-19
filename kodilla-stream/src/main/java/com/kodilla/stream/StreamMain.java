package com.kodilla.stream;

import com.kodilla.stream.beautifier.DecorateMethods;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, ((a, b) -> a + b));
//        expressionExecutor.executeExpression(10, 5, ((a, b) -> a - b));
//        expressionExecutor.executeExpression(10, 5, ((a, b) -> a * b));
//        expressionExecutor.executeExpression(10, 5, ((a, b) -> a / b));
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        System.out.println("Text beautifier: ");
//
//        poemBeautifier.beautify("Rafal", DecorateMethods::addABCAtTheBeginningAndEnd);
//        poemBeautifier.beautify("make me upper case", DecorateMethods::toUpperCaseText);
//        poemBeautifier.beautify("MAKE ME SMALL LETTERS", DecorateMethods::toLowerCaseText);
//        poemBeautifier.beautify("HELLO", DecorateMethods::addStarsAtTheBeginningAndEnd);
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//        People.getList().stream()
//                .map(s->s.toUpperCase()) //(String::toUpperCase)
//                .filter(s -> s.length()>11)
//                .map(s->s.substring(0,s.indexOf(' ')+2)+".")
//                .filter(s -> s.substring(0,1).equals("M"))
//                .forEach(System.out::println);
        //Zapisanie zbioru w postaci listy i wyswietlenie w oparciu o tę listę
//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book->book.getYearOfPublication()>2005)
//                .collect(Collectors.toList());
//        System.out.println("# elements: "+theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);
         // Jako mapa
//            BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication()>2005)
//                .collect(Collectors.toMap(Book::getSignature, book->book));
//        System.out.println("# elements" + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry->entry.getKey()+": "+entry.getValue())
//                .forEach(System.out::println);
        //Zapisanie do String'a
//        BookDirectory theBookDirectory = new BookDirectory();
//
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book->book.getYearOfPublication()>2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<", ">>"));
//        System.out.println(theResultStringOfBooks);
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultForumUsers = forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getGender().equals(ForumUser.Gender.F))
                .filter(forumUser -> forumUser.getBirthDate().getYear()<=1988)
                .filter(forumUser-> forumUser.getNumberOfPublishedPost()>0)
                .collect(Collectors.toMap(ForumUser::getUserID,forumUser -> forumUser ));
        System.out.println("# elements: "+resultForumUsers.size());
        resultForumUsers.entrySet().stream()
                .map(entry-> entry.getKey()+": "+ entry.getValue())
                .forEach(System.out::println);
    }
}