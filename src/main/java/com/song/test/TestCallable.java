package com.song.test;

import java.util.concurrent.*;

public class TestCallable {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);



        Callable<Integer> c1 = () -> {
            int sum =0;
            for (int i = 1; i <= 50; i++) {
                sum+=i;
            }
            return sum;
        };

        Callable<Integer> c2 = ()->{
            int sum = 0;
            for (int i = 51; i <= 100; i++) {
                sum+=i;
            }
            return sum;
        };

        new Callable<Integer>(){

            @Override
            public Integer call() throws Exception {

                return null;
            }
        };

        Future<Integer> submit1 = pool.submit(c1);
        Future<Integer> submit2 = pool.submit(c2);
        try {
            Integer t1 = submit1.get();
            Integer t2 = submit2.get();
            int t3 = t1 + t2;
            System.out.println("计算出的总和："+t3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
