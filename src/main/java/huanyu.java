package main.java;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class huanyu {
    public static void main(String[] args) throws IOException {
        //修改为你的html，其实什么数据都行只要会解析
        FileReader fileReader = new FileReader("C:/Users/17719/Downloads/武汉理工大学学分制教务管理信息系统2.html", StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        int len;
        char[] chars = new char[1024];
        while ((len = fileReader.read(chars)) != -1) {
            stringBuilder.append(chars, 0, len);
        }
        WUTParser wutParser = new WUTParser(stringBuilder.toString());
        //System.out.println(wutParser.base_table);
        wutParser.generateCourseList();
        //System.out.println(wutParser.base_info);
    }
}
