package com.sirius;

import java.io.File;

/**
 * @author Ymh_Sirius E-mail: ymh254089@163.com
 * @Title: TestDemo04
 * @ProjectName IdeaDemo01
 * @Description 目录大小
 * @date 2019/8/26 20:22
 */
public class TestDemo04 {
    public static void main(String[] args) {
       // File f = new File("/Users/Hao/Downloads");
       /* File f = new File("C:/Users/Ymh_Sirius/Desktop");
        for(File temp : f.listFiles()) {
            if(temp.isFile()) {
                System.out.println(temp.getName());
            }
        }*/
        File file = new File("C:/Users/Ymh_Sirius/Desktop");
        for (File temp: file.listFiles()) {
            if(temp.isFile()){
                System.out.print(temp.getName()+"-------" );
            }
        }

    }
}
