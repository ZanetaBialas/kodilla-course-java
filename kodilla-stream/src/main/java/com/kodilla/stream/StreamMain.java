package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoeamBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main (String[] args) {
       // Processor processor = new Processor();
        // processor.execute(() -> System.out.println("This is an example text."));
       // ExpressionExecutor expressionExecutor = new ExpressionExecutor();

       // System.out.println("Calculating expressions with lambdas");
       // expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
       // expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
       // expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
       // expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

       // System.out.println("Calculating expressions with method references");
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
       // expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        //PoeamBeautifier poemBeautifier = new PoeamBeautifier();
        //String beautifierText1 = poemBeautifier.beautifierText("Text to beatify", (text -> text.toUpperCase()));
        //System.out.println(beautifierText1);

        //String beautifierText2 = poemBeautifier.beautifierText("Text to beautify", (text -> "ABC" + text + "ABC"));
        //System.out.println(beautifierText2);

        //String beautofierText3 = poemBeautifier.beautifierText("Text to beautify", (text -> text.replace(" ", "#")));
        //System.out.println(beautifierText2);

        //String beautifierText4 = poemBeautifier.beautifierText("Text to beautify", (text -> text.length() + "long text ******" + text.length() + "short text **"));
        //System.out.println(beautifierText4);

        //String beautifierText5 = poemBeautifier.beautifierText("Text to beautify", (text -> text.concat((String.valueOf(text.hashCode())) )));
        //System.out.println(beautifierText5);

        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);

        //People.getList().stream()
        //        .map(String::toUpperCase)                             // [1]
        //        .filter(s -> s.length() > 11)                         // [2]
        //        .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
        //        .filter(s -> s.substring(0, 1).equals("M"))           // [4]
        //        .forEach(System.out::println);
        //
        //BookDirectory theBookDirectory = new BookDirectory();
        //String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
        //        .filter(book -> book.getYearOfPublication() > 2005)
        //        .map(Book::toString)
        //        .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        //System.out.println(theResultStringOfBooks);
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPostsQty() >= 1)
                .collect(Collectors.toMap(ForumUser::getNumberIDUser, ForumUser -> ForumUser));

        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }

}
