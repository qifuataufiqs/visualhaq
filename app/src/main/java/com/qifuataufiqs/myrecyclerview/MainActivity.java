package com.qifuataufiqs.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<CoreVisual>list;

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewCorehaqAdapter cardViewCorehaqAdapter = new CardViewCorehaqAdapter(this);
        cardViewCorehaqAdapter.setListCoreVisual(list);
        rvCategory.setAdapter(cardViewCorehaqAdapter);
    }

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
        rvCategory.setAdapter(listCoreAdapter);
    }

    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewCorehaqAdapter cardViewCorehaqAdapter = new CardViewCorehaqAdapter(this);
        cardViewCorehaqAdapter.setListCoreVisual(list);
        rvCategory.setAdapter(cardViewCorehaqAdapter);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String title = null;
        switch (item.getItemId()) {
            case R.id.action_list:
                showRecyclerList();
                title = "Mode List";
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                title = "Mode Grid";
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                title = "Mode CardView";
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
