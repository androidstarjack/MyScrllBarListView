package cv.yyh.com.myscrollbarlistview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import cv.yyh.com.myscrollbarlistview.R;
import cv.yyh.com.myscrollbarlistview.bean.Student;

/**
 * Created by Administrator on 2017/2/25 0025.
 */

public class ScrollListViewAdapter2 extends BaseAdapter {
    private List<Student> list;
    private Context cnt;
    public ScrollListViewAdapter2(Context cnt , List<Student> list){
        this.cnt= cnt;
        this.list = list;
    }
    public void setMyDataChaged(List<Student> list){
        this.list = list;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = View.inflate(cnt, R.layout.item_xzoomscrollview, null);
            holder = new ViewHolder();
            holder.team_item_active_num = (TextView) view.findViewById(R.id.team_item_active_num);
            holder.team_item_time = (TextView) view.findViewById(R.id.team_item_time);
            holder.team_item_title =(TextView) view.findViewById(R.id.team_item_title);
            holder.team_item_icon = (ImageView)view.findViewById(R.id.team_item_icon);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        Student item = list.get(position);
        holder.team_item_time .setText(String.valueOf(item.getList().size()) + "");
        holder.team_item_active_num.setText(String.valueOf(item.getList().get(0).getPerListenceName()) + "");
        holder.team_item_title.setText(item.getName());
        return view;
    }
    class ViewHolder {
        TextView team_item_title, team_item_time, team_item_active_num;
        ImageView team_item_icon;
    }
}
