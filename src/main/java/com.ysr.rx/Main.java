package com.ysr.rx;

import io.reactivex.Flowable;

public class Main {

    public static void main(String[] args) {
        test();

    }

    private static void test() {

        Flowable.just("Hello world").subscribe(System.out::println);


        Flowable<Integer> flow = Flowable.range(1, 5)
                .map(v -> v * v)
                .filter(v -> v % 3 == 0);
        Flowable.just(flow).subscribe(System.out::println);
    }





}
