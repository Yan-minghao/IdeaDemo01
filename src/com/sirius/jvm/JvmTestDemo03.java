package com.sirius.jvm;

import java.util.Random;

/**
 * @author Ymh_Sirius E-mail: ymh254089@163.com
 * @Title: JvmTestDemo03
 * @ProjectName IdeaDemo01
 * @Description jvm堆大小调整
 * @date 2019/7/20 17:21
 */
public class JvmTestDemo03 {
    public static void main(String[] args) {
           String str="sirius.com";

          /* while (true){
               str +=str+ new Random().nextInt(8888888)+new Random().nextInt(9999999);
           }*/

          while (true){
              str+=str+new Random().nextInt(888888)+new Random().nextInt(99999);
          }
    }
}
