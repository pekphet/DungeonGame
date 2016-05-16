package cc.fish.simplegame;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import cc.fish.coreui.BaseFragment;
import cc.fish.coreui.BaseFragmentActivity;
import cc.fish.simplegame.fragment.DungeonFrament;
import cc.fish.simplegame.fragment.ItemFragment;
import cc.fish.simplegame.fragment.SettingFragment;
import cc.fish.simplegame.fragment.SkillFragment;
import cc.fish.simplegame.fragment.StatisticsFragment;

public class MainActivity extends BaseFragmentActivity {

    final private static String[] tabs = {"属性", "地下城", "背包", "技能", "设置"};
    final private static Class<BaseFragment>[] fragments = new Class[]{
            StatisticsFragment.class, DungeonFrament.class,
            ItemFragment.class, SkillFragment.class, SettingFragment.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onItemClick(View item, int index) {

    }

    @Override
    protected void initView() {
    }

    @Override
    protected Class<BaseFragment>[] putFragments() {
        return fragments;
    }

    @Override
    protected View getBottomItemView(int index) {
        TextView tv = new TextView(this);
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1.0f);
        tv.setLayoutParams(param);
        tv.setText(tabs[index]);
        tv.setGravity(Gravity.CENTER);
        return tv;
    }

    @Override
    protected int getFLid() {
        return R.id.fl_fragment;
    }

    @Override
    protected LinearLayout getBottomLayout() {
        return (LinearLayout) findViewById(R.id.ll_bottom);
    }

    @Override
    protected void checkAllBottomItem(View item, int position, boolean isChecked) {
        if (item instanceof TextView) {
            ((TextView) item).setTextColor(isChecked ? 0xff000000 : 0xff666666);
        }
    }
}
