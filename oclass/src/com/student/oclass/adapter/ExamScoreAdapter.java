package com.student.oclass.adapter;

import java.util.List;

import com.student.oclass.R;
import com.student.oclass.adapter.GameRecordAdapter.ViewHolder;
import com.student.oclass.model.BookEntity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ExamScoreAdapter extends BaseAdapter {

	private List<BookEntity> listBook=null;
	private Context context;
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listBook.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listBook.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder=null;
		if(convertView==null) {
			holder=new ViewHolder();
			convertView=LayoutInflater.from(context).inflate(R.layout.game_record_item, null);
			holder.iv_tag=(ImageView) convertView.findViewById(R.id.iv_tag);
			holder.tv_name=(TextView) convertView.findViewById(R.id.tv_name);
			holder.tv_score=(TextView) convertView.findViewById(R.id.tv_score);
			holder.tv_class=(TextView) convertView.findViewById(R.id.tv_class);
			convertView.setTag(holder);
		}else {
			holder=(ViewHolder) convertView.getTag();
		}
		BookEntity book=listBook.get(position);
		holder.iv_tag.setVisibility(View.GONE);
		holder.tv_class.setVisibility(View.VISIBLE);
		holder.tv_class.setText("四年级英语");
		holder.tv_name.setText("2014/6/12(14:30:12)");
		holder.tv_score.setText("95分");
		return convertView;
	}
	public ExamScoreAdapter(Context context,List<BookEntity> listBook) {
		this.context=context;
		this.listBook=listBook;
	}
	class ViewHolder{
		ImageView iv_tag;
		TextView tv_name;
		TextView tv_score;
		TextView tv_class;
	}

}
