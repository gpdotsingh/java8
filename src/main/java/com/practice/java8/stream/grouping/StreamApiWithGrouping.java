package com.practice.java8.stream.grouping;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import com.practice.java8.stream.grouping.Staff;
public class StreamApiWithGrouping {

    public static void main(String[] args) {

        List<Staff> staff = Arrays.asList(
        		new Staff("mkyong", 30, new BigDecimal(10000)),
                new Staff("ABC", 30, new BigDecimal(10000)),
                new Staff("jack", 27, new BigDecimal(20000))
        );

        //Before Java 8
        List<String> result = new ArrayList<>();
        for (Staff x : staff) {
            result.add(x.getName());
        }
        System.out.println(result); //[mkyong, jack, lawrence]

        //Java 8
        List<String> collect1 = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(collect1); //[mkyong, jack, lawrence]
        
        
        Map<Integer, Set<String>> result1 =
        		staff.stream().collect(
                        Collectors.groupingBy(Staff::getAge,
                                Collectors.mapping(Staff::getName, Collectors.toSet())
                        )
                );
        
        Map<Integer, Set<Staff>> result2 =
        		staff.stream().filter(s->s.getAge()>27).collect(Collectors.groupingBy(Staff::getAge,
                        Collectors.mapping(Function.identity(), Collectors.toSet())
                        ));
        
        Stream<Staff> stfStream=staff.stream();
        
        System.out.println(stfStream.toString());
System.out.println(result1);
System.out.println(result2);
    }

}