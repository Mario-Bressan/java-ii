package com.bressan.ocp.lamda.reusing.lamda.expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReusingLambda {
    final List<String> friends =
            Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
    final List<String> editors =
            Arrays.asList("Brian", "Jackie", "John", "Mike");
    final List<String> comrades =
            Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");

    // we define a function and pass it in the filter of the lambda expression
    long countStartN(List<String> list) {
        final Predicate<String> startsWithN = name -> name.startsWith("N");
        return list.stream()
                .filter(startsWithN)
                .count();
    }

    public static void main(String[] args) {
        ReusingLambda reusingLambda = new ReusingLambda();
        System.out.println(reusingLambda.countStartN(reusingLambda.friends));
        System.out.println(reusingLambda.countStartN(reusingLambda.editors));
        System.out.println(reusingLambda.countStartN(reusingLambda.comrades));
    }
}
