package cv.yyh.com.myscrollbarlistview.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Jason on 2016/9/1.
 */
public class Student implements Serializable {
    private String name;
    private int age;
    private List<Course> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }
}
