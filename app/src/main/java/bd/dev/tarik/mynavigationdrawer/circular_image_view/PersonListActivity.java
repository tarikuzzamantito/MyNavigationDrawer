package bd.dev.tarik.mynavigationdrawer.circular_image_view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import bd.dev.tarik.mynavigationdrawer.R;


/**
 * Created by Md.Tarikuzzaman on 29-Jan-2020, ROSC-II MIS Cell, LGED.
 */
public class PersonListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_list_circle_image_view);

        RecyclerView rv = findViewById(R.id.rv);
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new PersonListAdapter());
    }

}
