package com.bressan.ocp.lamda.reusing.lamda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//Nas chamadas para o método filter(), primeiro chamamos o método checkIfStartsWith(),
//passando uma letra. Essa chamada retorna uma expressão lambda
//que é então passada para o método filter().
public class LexicalScoping {
    static final List<String> friends =
            Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

    public static void main(String[] args) {
        final long countFriendStartN = friends.stream()
                .filter(checkIfStartsWith("N")).count();
        final long countFriendStartB = friends.stream()
                .filter((checkIfStartsWith("B"))).count();

        System.out.println("N: " + countFriendStartN);
        System.out.println("B: " + countFriendStartB);

    }

    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }
}
