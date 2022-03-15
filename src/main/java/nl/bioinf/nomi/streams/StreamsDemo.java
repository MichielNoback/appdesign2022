package nl.bioinf.nomi.streams;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(2, 4, 1, 5, 6, 3, 8, 7, 9);
//
//        Optional<Double> reduce = numbers.
//                stream().
//                filter(i -> i > 5).
//                peek(System.out::println).
//                map(Math::sqrt).
//                peek(System.out::println).
//                reduce((x, y) -> x + y);
//
//        System.out.println(reduce.orElse(0.0));
//        //    collect(Collectors.toList());
        //assert(collect.size() == 2);


        int A = 65;
        System.out.println("A = " + A);
        System.out.println("A = " + (char)A);

        System.out.println('A' + 'B');

        String seq = "BGAATCATACAGX";
        Set<Character> legalNucleotides = Set.of('A', 'C', 'G', 'T');
        //List<Character> legalNucleotides = List.of('A', 'C', 'G', 'T');
        seq.chars().
                //filter(i -> isLegalDna(i)).
                mapToObj(c -> (char) c).
                filter(new Predicate<Character>() {
                    @Override
                    public boolean test(Character character) {
                        return legalNucleotides.contains(character);
                    }
                }). //SAME AS://   n -> legalNucleotides.contains(n)
                forEach(System.out::println);

    }

    private static boolean isLegalDna(int i) {
        return i == 65 || i == 67 || i == 71 || i == 84;
    }
}