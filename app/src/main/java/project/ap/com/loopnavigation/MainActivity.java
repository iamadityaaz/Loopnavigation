package project.ap.com.loopnavigation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.cleveroad.loopbar.widget.Orientation;
import project.ap.com.loopnavigation.fragments.CategoriesAdapterLoopBarFragment;

public class MainActivity extends AppCompatActivity implements IFragmentReplacer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            replaceFragment(CategoriesAdapterLoopBarFragment.newInstance(Orientation.ORIENTATION_VERTICAL_LEFT));
        }
    }

    @Override
    public void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}
