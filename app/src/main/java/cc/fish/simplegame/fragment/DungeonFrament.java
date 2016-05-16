package cc.fish.simplegame.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;

import cc.fish.coreui.BaseFragment;
import cc.fish.coreui.util.DisplayUtil;
import cc.fish.simplegame.R;

/**
 * Created by fish on 16-5-16.
 */
public class DungeonFrament extends BaseFragment {

    private GridView gvDungeon;
    private DungeonAdapter mAdapter = new DungeonAdapter();
    private LinearLayout.LayoutParams para;

    @Override
    protected View initView(LayoutInflater inflater) {
        View v = inflater.inflate(R.layout.fragment_dungeon, null);
        para = new LinearLayout.LayoutParams(DisplayUtil.Dp2Px(getContext(), 40), DisplayUtil.Dp2Px(getContext(), 40));
//        para = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, DisplayUtil.Dp2Px(getContext(), 40));
        gvDungeon = (GridView) v.findViewById(R.id.gv_dungeon);
        gvDungeon.setAdapter(mAdapter);
        return v;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void click(View v) {

    }
    public Context getContext() {
        return getActivity();
    }


    private class DungeonAdapter extends BaseAdapter {

        private Random rand = new Random();

        public DungeonAdapter() {
        }
        @Override
        public int getCount() {
            return 64;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            return getItemView(position);
        }

        private View getItemView(final int position) {
            ImageView img = new ImageView(getContext());
            img.setLayoutParams(para);
            img.setBackgroundColor(rand.nextInt(0xFFFFFF) | 0xFF000000);
            img.setOnClickListener((v) -> Toast.makeText(getContext(), "" + position, Toast.LENGTH_SHORT).show());
            return img;

        }
    }
}