package com.metin.medium.mapandflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        // map()
        List<Double> productPrices = Arrays.asList(100D, 200D, 300D);

        productPrices.forEach(System.out::println);

        List<Double> productPricesWithTax = productPrices.stream()
                .map(price -> price * 1.18)
                .collect(Collectors.toList());

        productPricesWithTax.forEach(System.out::println);

        // flatMap()
        List<String> europeanCountries = Arrays.asList("Almanya", "Avusturya", "Belçika", "Bulgaristan");
        List<String> africanCountries = Arrays.asList("Ethiopia", "Tanzania", "Kenya", "Sudan");
        List<String> asianCountries = Arrays.asList("Japonya", "Çin", "Hindistan", "Kore");

        List<List<String>> allCountries = new ArrayList<>();
        allCountries.add(europeanCountries);
        allCountries.add(africanCountries);
        allCountries.add(asianCountries);

        System.out.println(allCountries);

        List<String> allCountriesAsFlat = allCountries.stream().flatMap(country -> country.stream()).collect(Collectors.toList());

        System.out.println(allCountriesAsFlat);
    }
}
