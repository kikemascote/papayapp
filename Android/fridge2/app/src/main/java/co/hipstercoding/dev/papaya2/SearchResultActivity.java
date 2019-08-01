package co.hipstercoding.dev.papaya2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import co.hipstercoding.dev.papaya2.R;

import co.hipstercoding.dev.papaya2.utils.DBUtils;

import static android.app.SearchManager.QUERY;

public class SearchResultActivity extends AppCompatActivity {

    SearchFoodAdapter searchFoodAdapter;
    RecyclerView recyclerView;
    String queryString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        getSupportActionBar().setTitle(R.string.search_activity_text);

        recyclerView = (RecyclerView) findViewById(R.id.rv_search_result);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        //to designate that the contents of the RecyclerView won't change an item's size
        recyclerView.setHasFixedSize(true);

        Intent intent = getIntent();

        //populate ui
        if(intent.hasExtra(QUERY)) {
            queryString = intent.getStringExtra(QUERY);
            populateUi(queryString);
        }

    }

    private void populateUi(String queryString) {
        searchFoodAdapter = new SearchFoodAdapter(new DBUtils(this).queryFoods(queryString),this);
        recyclerView.setAdapter(searchFoodAdapter);
    }

}
