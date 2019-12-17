package com.bressan.ocp.lamda.reusing.lamda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class RefactoringLexicalScoping {
    static final List<String> friends =
            Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

    public static void main(String[] args) {
        final Function<String, Predicate<String>> startsEithLetter =
        letter -> name -> name.startsWith(letter);

        final long countFriednsStartN =
                friends.stream()
                .filter(startsEithLetter.apply("N")).count();

        final long countFriendsStartB =
                friends.stream()
                .filter(startsEithLetter.apply("B")).count();

        System.out.println("N: " + countFriednsStartN);
        System.out.println("B: " + countFriendsStartB);
    }
}
