package com.song.test;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class exam {
    public static void main(String[] args) {
        String s = new String(new char[] {'没','人','比','我','更','懂','j','a','v','a'});
        String si = "没人比我更懂java";
        System.out.println(s == si);
        System.out.println(s.intern() == "没人比我更懂java");
        System.out.println(s == si.intern());

    }
      public static int calc(int n) {
          try {
              n += 1;
              if (n / 0 > 0) {
                  n += 1;
              } else {
                  n -= 10;
              }
              return n;
          } catch (Exception e) {
              n++;
          }
          n++;
          return n++;
      }

}
