package com.student.oclass.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.student.oclass.R;
import com.student.oclass.adapter.SyncTechAdapter;
import com.student.oclass.model.BookEntity;
import com.student.oclass.utils.AppConstant;

public class ExamFagment extends BaseFragment {

    private GridView gridView;

    private SyncTechAdapter adapter;

    private int position = 0;

    private List<BookEntity> listBook = new ArrayList<BookEntity>();

    public static ExamFagment newInstance(int position) {
        ExamFagment fragment = new ExamFagment();
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_sync_tech, container, false);
        gridView = (GridView) contentView.findViewById(R.id.gridview);
        parseArgument();
        if (position == 0) {
            initExamData();
        } else {
            initQuestionData();
        }
        adapter = new SyncTechAdapter(getActivity(), listBook, false);
        gridView.setAdapter(adapter);
        return contentView;
    }

    void initExamData() {
        for (int i = 0; i < 6; i++) {
            BookEntity book = new BookEntity();
            book.setType(AppConstant.EXAM);
            listBook.add(book);
        }
    }

    void initQuestionData() {
        for (int i = 0; i < 2; i++) {
            BookEntity book = new BookEntity();
            book.setType(AppConstant.EXAM);
            listBook.add(book);
        }
    }

    private void parseArgument() {
        Bundle bundle = getArguments();
        position = bundle.getInt("position");

    }
}
