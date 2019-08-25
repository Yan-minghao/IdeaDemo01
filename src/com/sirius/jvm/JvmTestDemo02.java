package com.sirius.jvm;

/**
 * @author Ymh_Sirius E-mail: ymh254089@163.com
 * @Title: JvmTestDemo02
 * @ProjectName IdeaDemo01
 * @Description jvm初始化数据
 * @date 2019/7/20 17:19
 */
public class JvmTestDemo02 {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory() ;//返回 Java 虚拟机试图使用的最大内存量。
        long totalMemory = Runtime.getRuntime().totalMemory() ;//返回 Java 虚拟机中的内存总量。
        System.out.println("MAX_MEMORY = " + maxMemory + "（字节）、" + (maxMemory / (double)1024 / 1024) + "MB");
        System.out.println("TOTAL_MEMORY = " + totalMemory + "（字节）、" + (totalMemory / (double)1024 / 1024) + "MB");

    }

}
