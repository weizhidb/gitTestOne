package com.student.oclass.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.student.oclass.R;
import com.student.oclass.adapter.ExamScoreAdapter;
import com.student.oclass.model.BookEntity;

public class ExamScoreFragment extends BaseFragment {

	private List<BookEntity> listBook=new ArrayList<BookEntity>();
	private ExamScoreAdapter adapter;
	private ListView mListView;
	public static ExamScoreFragment newInstance(int position) {
		ExamScoreFragment fragment = new ExamScoreFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_view_list, container, false);
        mListView=(ListView)contentView.findViewById(R.id.list);
        initData();
        adapter=new ExamScoreAdapter(getActivity(), listBook);
        mListView.setAdapter(adapter);
        return contentView;
    }
    void initData() {
    	for(int i=0;i<4;i++) {
    		BookEntity book=new BookEntity();
    		listBook.add(book);
    	}
    }
    private void parseArgument() {
        Bundle bundle = getArguments();
        int position=bundle.getInt("position");
       
    }
}
