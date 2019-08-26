package com.sirius;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Ymh_Sirius E-mail: ymh254089@163.com
 * @Title: TestDemo03
 * @ProjectName IdeaDemo01
 * @Description ConcurrentModifitiryException
 * @date 2019/8/25 15:48
 */
public class TestDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {list.add(UUID.randomUUID().toString().substring(0,9));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }


}
class test{
    public  void test01(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(UUID.randomUUID().toString().substring(0,9));
        }
    }
}
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

class Human {
    public static void main(String[] args)
            throws Exception {
        try {
            try {
                throw new Sneeze();
            }
            catch ( Annoyance a ) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        }
        catch ( Sneeze s ) {
            System.out.println("Caught Sneeze");
            return ;
        }
        finally {
            System.out.println("Hello World!");
        }
    }
}
