package com.sirius.jvm;

/**
 * @author Ymh_Sirius E-mail: ymh254089@163.com
 * @Title: JvmTestDemo01
 * @ProjectName IdeaDemo01
 * @Description JvmTest
 * @date 2019/7/20 16:55
 */
public class JvmTestDemo01 {

    public static void main(String[] args) {
        JvmTestDemo01 jvm=new JvmTestDemo01();
        jvm.Demo01();

    }

   public void Demo01(){
        Demo02();
   }
   public void Demo02(){
        Demo01();
   }

}
