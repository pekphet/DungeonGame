package cc.fish.simplegame;

import android.os.Bundle;

import cc.fish.coreui.BaseSplashActivity;
import cc.fish.coreui.annotation.Splash;

/**
 * Created by fish on 16-5-16.
 */
@Splash(delay = 1000, clz = MainActivity.class)
public class SplashActivity extends BaseSplashActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initData();
    }

    private void initData() {

    }
}
