package com.qifuataufiqs.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<CoreVisual>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(CoreHaq.getListData());

        showRecyclerList();
    }
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CorehaqAdapter listCoreAdapter = new CorehaqAdapter(this);
        listCoreAdapter.setListCoreVisual(list);
        rvCategory.setAdapter((listCoreAdapter));
    }
}
