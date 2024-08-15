package bd.dev.tarik.mynavigationdrawer.codinginflow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import bd.dev.tarik.mynavigationdrawer.R;

public class CodingInFlowMainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_in_flow_main);

        Toolbar toolbar = findViewById(R.id.toolbar_codinginflow);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout_codinginflow);
        NavigationView navigationView = findViewById(R.id.nav_view_codinginflow);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_codinginflow, new HomeFragmentCodingInFlow()).commit();
            navigationView.setCheckedItem(R.id.nav_home_codinginflow);
        }
    }

    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_home_codinginflow:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_codinginflow, new HomeFragmentCodingInFlow()).commit();
                break;
            case R.id.nav_gallery_codinginflow:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_codinginflow, new GalleryFragmentCodingInFlow()).commit();
                break;
            case R.id.nav_slideshow_codinginflow:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_codinginflow, new SlideShowFragmentCodingInFlow()).commit();
                break;
            case R.id.nav_share_codinginflow:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_send_codinginflow:
                Toast.makeText(this, "Send", Toast.LENGTH_SHORT).show();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
