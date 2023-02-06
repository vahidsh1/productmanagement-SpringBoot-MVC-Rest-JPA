//package com.digipay.controller;
//
////import com.digipay.model.entity.Student;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//import java.util.function.Function;
//import java.util.function.Predicate;
//import java.util.function.Supplier;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//class BaseControllerImplTest {
//
//    @Test
//    void list() {
//
//        TestRestTemplate restTemplate = new TestRestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("userNationalID", "22");
//        HttpEntity<Object> objectHttpEntity = new HttpEntity<>(headers);
//
//        ResponseEntity<String> response =
//                restTemplate.getForEntity("http://localhost:8081/product/digital/", String.class);
//        Assertions.assertEquals(response.getBody(), new ArrayList<>());
//    }
//
//    @Test
//    void list2() {
//
//        Predicate<String> p = myItem -> myItem.startsWith("a");
//        ArrayList<String> names = new ArrayList<>();
//        names.add("ali");
//        names.add("ahmad");
//        names.add("vahid");
//        names.add("asghar");
//        Set<String> collect = names.stream().filter(p).collect(Collectors.toSet());
//        Stream<String> nameswithFilter = (Stream<String>) collect;
//
//
////        Predicate<String > p = myItem -> myItem.startsWith("a");
////        Optional<String> nameOptional = Optional.ofNullable("alireza");
////        Optional<String > s= nameOptional.filter(p);
////        if (s.isPresent()) {
////            String name = s.get();
////        }
//    }
//
//    @Test
//    void list3() {
//
////        Predicate<String > p = myItem -> myItem.startsWith("a");
//        ArrayList<String> names = new ArrayList<>();
//        names.add("ali");
//        names.add("ahmad");
//        names.add("vahid");
//        names.add("asghar");
//        Set<String> collect = names.stream().filter(p -> p.startsWith("a")).collect(Collectors.toSet());
//        Stream<String> nameswithFilter = (Stream<String>) collect;
//
//    }
//    @Test
//    void list4() {
//        Function<String ,String> convertName = name -> name+"*";
//
////        Predicate<String > p = myItem -> myItem.startsWith("a");
//        ArrayList<String> names = new ArrayList<>();
//        names.add("ali");
//        names.add("ahmad");
//        names.add("vahid");
//        names.add("asghar");
//        List<String > changeNames = names.stream().map(convertName).toList();
//        List<String> strings = names.stream().map(String::toUpperCase).toList();
//    }
//
//    @Test
//    void list5() {
//        Function<String ,String> convertName = name -> name+"*";
//
////        Predicate<String > p = myItem -> myItem.startsWith("a");
//        ArrayList<String> names = new ArrayList<>();
//        names.add("ali");
//        names.add("ahmad");
//        names.add("vahid");
//        names.add("asghar");
////        List<String > changeNames = names.stream().map(convertName).toList();
////        List<String> strings = names.stream().map(String::toUpperCase).toList();
//        names.forEach(System.out::println);
//
//        names.forEach(str -> System.out.println(str));
//    }
//
//    @Test
//    void list6() {
//        Function<String ,String> convertName = name -> name+"*";
//
////        Predicate<String > p = myItem -> myItem.startsWith("a");
//        ArrayList<String> names = new ArrayList<>();
//        names.add("ali");
//        names.add("ahmad");
//        names.add("vahid");
//        names.add("asghar");
////        List<String > changeNames = names.stream().map(convertName).toList();
////        List<String> strings = names.stream().map(String::toUpperCase).toList();
//        names.forEach(System.out::println);
//
//        names.forEach(str -> System.out.println(str));
//        names.forEach(str -> {
//            String s =str + "-";
//            System.out.println(s);
//        });
//    }
//
//    @Test
//    void list7() {
//        Function<String ,String> convertName = name -> name+"*";
//
////        Predicate<String > p = myItem -> myItem.startsWith("a");
//        ArrayList<String> names = new ArrayList<>();
//        names.add("ali");
//        names.add("ahmad");
//        names.add("vahid");
//        names.add("asghar");
////        List<String > changeNames = names.stream().map(convertName).toList();
////        List<String> strings = names.stream().map(String::toUpperCase).toList();
//        names.forEach(System.out::println);
//        Supplier<String> sup =()->  "Hello";
////        Supplier<Student> sup2 = Student::new;
//        Supplier<String> sup3 = () -> Thread.currentThread().getName();
//        System.out.println(sup3.get());
//
//        names.forEach(str -> System.out.println(str));
//        names.forEach(str -> {
//            String s =str + "-";
//            System.out.println(s);
//        });
//    }
//
//    @Test
//    void list8() {
//        Function<String ,String> convertName = name -> name+"*";
//Student student = null;
////        Predicate<String > p = myItem -> myItem.startsWith("a");
//        ArrayList<String> names = new ArrayList<>();
//        names.add("ali");
//        names.add("ahmad");
//        names.add("vahid");
//        names.add("asghar");
////        List<String > changeNames = names.stream().map(convertName).toList();
////        List<String> strings = names.stream().map(String::toUpperCase).toList();
//        names.forEach(System.out::println);
//        Supplier<String> sup =()->  "Hello";
//        Supplier<Student> sup2 = Student::new;
//        Supplier<String> sup3 = () -> Thread.currentThread().getName();
//        System.out.println(sup3.get());
//        Optional.ofNullable(student).orElseThrow(RuntimeException::new);
//        names.forEach(str -> System.out.println(str));
//        names.forEach(str -> {
//            String s =str + "-";
//            System.out.println(s);
//        });
//    }
//
//
//    @Test
//    public void sum() {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(12);
//        numbers.add(3);
//        numbers.add(41);
//
//        Integer integer = numbers.stream().reduce((a, b) -> a + b).get();
//
//    }
//    @Test
//    void listA() {
//        Predicate<String> p = myItem -> myItem.startsWith("a");
//        Predicate<String> p1 = myItem -> myItem.contains("ali");
//        ArrayList<String> names = new ArrayList<>();
//        ArrayList<String> names1 = new ArrayList<>();
//        names1.add("ali");
//        names1.add("ahmad");
//        names1.add("vahid");
//        names1.add("asghar");
//        Set<String> collect1 = names1.stream().filter(p1).collect(Collectors.toSet());
//        Stream<String> nameswithFilter = (Stream<String>) collect1;
//
//
////        Predicate<String > p = myItem -> myItem.startsWith("a");
////        Optional<String> nameOptional = Optional.ofNullable("alireza");
////        Optional<String > s= nameOptional.filter(p);
////        if (s.isPresent()) {
////            String name = s.get();
////        }
//    }
//}