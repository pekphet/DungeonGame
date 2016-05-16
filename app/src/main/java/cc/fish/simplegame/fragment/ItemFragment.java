package cc.fish.simplegame.fragment;

import android.view.LayoutInflater;
import android.view.View;

import cc.fish.coreui.BaseFragment;
import cc.fish.simplegame.R;

/**
 * Created by fish on 16-5-16.
 */
public class ItemFragment extends BaseFragment {
    @Override
    protected View initView(LayoutInflater inflater) {
        View v = inflater.inflate(R.layout.fragment_statistic, null);
        return v;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void click(View v) {

    }
}
