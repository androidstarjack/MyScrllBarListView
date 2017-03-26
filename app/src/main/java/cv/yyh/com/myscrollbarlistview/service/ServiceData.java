package cv.yyh.com.myscrollbarlistview.service;


import java.util.ArrayList;
import java.util.List;

import cv.yyh.com.myscrollbarlistview.bean.Course;
import cv.yyh.com.myscrollbarlistview.bean.Student;

/**
 * 提供数据的服务类
 * @author yyh
 */
public class ServiceData {

    public static  List<Student> getStudentList(){
        List<Student> list = new ArrayList<Student>();
        for(int i = 0 ; i < 100 ; i++){
            Student student = new Student();
            student.setAge(i);
            student.setName("张三");
            List<Course> listcourse1 = new ArrayList<>() ;
            listcourse1.add(new Course("语文"));
            listcourse1.add(new Course("English"));
            listcourse1.add(new Course("Math"));
            listcourse1.add(new Course("Physics"));
            student.setList(listcourse1);
            if(i ==0){
                student.setAge(i);
                student.setName("张三");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("语文"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==1){
                student.setAge(i);
                student.setName("王五");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("化学"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==2){
                student.setAge(i);
                student.setName("刘能");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("物理"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==3){
                student.setAge(i);
                student.setName("李思思");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("美术"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==4){
                student.setAge(i);
                student.setName("卡卡罗特");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("瞬间移动"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==5){
                student.setAge(i);
                student.setName("贝吉塔");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("瞬间移动"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==6){
                student.setAge(i);
                student.setName("贝吉塔");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("瞬间移动"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==7){
                student.setAge(i);
                student.setName("保护神");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("瞬间移动"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==8){
                student.setAge(i);
                student.setName("破坏神");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("瞬间移动"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==9){
                student.setAge(i);
                student.setName("北京五环");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("瞬间移动"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }else if(i ==10){
                student.setAge(i);
                student.setName("雅琪萝北");
                List<Course> listcourse = new ArrayList<>() ;
                listcourse.add(new Course("瞬间移动"));
                listcourse.add(new Course("English"));
                listcourse.add(new Course("Math"));
                listcourse.add(new Course("Physics"));
                student.setList(listcourse);
            }
            list.add(student);
        }
        return list;
    }

}
