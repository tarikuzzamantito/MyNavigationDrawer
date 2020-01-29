package bd.dev.tarik.mynavigationdrawer.circular_image_view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import bd.dev.tarik.mynavigationdrawer.R;
import bd.dev.tarik.mynavigationdrawer.databinding.ActivityMainCircleImageViewBinding;

/**
 * Created by Md.Tarikuzzaman on 29-Jan-2020, ROSC-II MIS Cell, LGED.
 */
public class CIrcleImageViewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_circle_image_view);
        ActivityMainCircleImageViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main_circle_image_view);
        binding.setMyName("Tarik");
        binding.setBgColor(Color.BLUE);

        /*ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main_circle_image_view);
        binding.setMyName("Vatar");
        binding.setBgColor(Color.BLUE);*/
    }

    public void onCircleImageClick(View view) {
        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();
    }

    public void onAClick(View view) {
        AvatarImageView a = (AvatarImageView) view;
        if (a.getState() == AvatarImageView.SHOW_INITIAL) {
            a.setState(AvatarImageView.SHOW_IMAGE);
        } else {
            a.setState(AvatarImageView.SHOW_INITIAL);
        }
    }

    public void onGotoListSampleClick(View view) {
        Intent i = new Intent(this, PersonListActivity.class);
        startActivity(i);
    }
}