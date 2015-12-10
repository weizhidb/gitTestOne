package com.student.oclass.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.student.oclass.R;
import com.student.oclass.adapter.FamousBookFragmentAdapter;
import com.student.oclass.adapter.GameAdapter;
import com.student.oclass.adapter.SyncTechAdapter;
import com.student.oclass.model.BookEntity;
import com.student.oclass.utils.AppConstant;

public class GameFragment extends BaseFragment {

	private GridView gridView;
	private GameAdapter adapter;
	private List<BookEntity> listBook=new ArrayList<BookEntity>();
	public static GameFragment newInstance(int position) {
		GameFragment fragment = new GameFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_sync_tech, container, false);
        gridView=(GridView) contentView.findViewById(R.id.gridview);
        initData();
        adapter=new GameAdapter(getActivity(), listBook);
        gridView.setAdapter(adapter);      
        return contentView;
    }
    void initData() {
    	for(int i=0;i<9;i++) {
    		BookEntity book=new BookEntity();
    		book.setType(AppConstant.BEST_HEAD);
    		listBook.add(book);
    	}
    }
    private void parseArgument() {
        Bundle bundle = getArguments();
        int position=bundle.getInt("position");
       
    }
}
