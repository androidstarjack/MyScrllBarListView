package cv.yyh.com.myscrollbarlistview;

import android.support.annotation.Nullable;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import cv.yyh.com.myscrollbarlistview.adapter.ScrollListViewAdapter2;
import cv.yyh.com.myscrollbarlistview.bean.Student;
import cv.yyh.com.myscrollbarlistview.service.ServiceData;
import cv.yyh.com.myscrollbarlistview.view.MyScrollbarListview;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.lv_customser_zoomscroll)
    MyScrollbarListview lv_customser_zoomscroll;
    private List<Student> list = new ArrayList<>();
    private ScrollListViewAdapter2 scrollListViewAdapter2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    protected void initData() {
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        list.addAll(ServiceData.getStudentList());
        lv_customser_zoomscroll.setOnPositionListener(new MyScrollbarListview.OnPositionListener() {
            @Override
            public void myPositionChanged(int position, Student student, MyScrollbarListview myScrollbarListView, View mScrollPanelView) {
                Student student1 = list.get(position);
                TextView tv = (TextView) mScrollPanelView;
                tv.setText("" + position);

            }
        });
        scrollListViewAdapter2 = new ScrollListViewAdapter2(MainActivity.this,list);

        lv_customser_zoomscroll.setAdapter(scrollListViewAdapter2);

    }

}
