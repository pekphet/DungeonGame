package cc.fish.simplegame.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import cc.fish.coreui.BaseFragment;
import cc.fish.simplegame.R;

/**
 * Created by fish on 16-5-16.
 */
public class StatisticsFragment extends BaseFragment {

    private TextView tvJob;
    private TextView tvLv;
    private TextView tvHP;
    private TextView tvMP;
    private TextView tvStr;
    private TextView tvInt;
    private TextView tvCon;
    private TextView tvSpr;
    private TextView tvPatk;
    private TextView tvMatk;
    private TextView tvWatk;
    private TextView tvPdef;
    private TextView tvMdef;
    private TextView tvHit;
    private TextView tvMis;
    private TextView tvPcri;
    private TextView tvMcri;
    private TextView tvPcatk;
    private TextView tvMcatk;
    private TextView tvHPR;
    private TextView tvMPR;
    private TextView tvFireAtk;
    private TextView tvWatereAtk;
    private TextView tvLightAtk;
    private TextView tvDarkAtk;
    private TextView tvFireDef;
    private TextView tvWaterDef;
    private TextView tvLightDef;
    private TextView tvDarkDef;

    @Override
    protected View initView(LayoutInflater inflater) {
        View v = inflater.inflate(R.layout.fragment_statistic, null);
        initCreate(v);
        return v;
    }

    private void initCreate(View v) {
        tvJob = (TextView) v.findViewById(R.id.tv_job);
        tvLv = (TextView) v.findViewById(R.id.tv_lv);
        tvHP = (TextView) v.findViewById(R.id.tv_hp);
        tvMP = (TextView) v.findViewById(R.id.tv_mp);
        tvStr = (TextView) v.findViewById(R.id.tv_str);
        tvInt = (TextView) v.findViewById(R.id.tv_int);
        tvCon = (TextView) v.findViewById(R.id.tv_con);
        tvSpr = (TextView) v.findViewById(R.id.tv_spr);
        tvPatk = (TextView) v.findViewById(R.id.tv_patk);
        tvMatk = (TextView) v.findViewById(R.id.tv_matk);
        tvWatk = (TextView) v.findViewById(R.id.tv_watk);
        tvPdef = (TextView) v.findViewById(R.id.tv_pdef);
        tvMdef = (TextView) v.findViewById(R.id.tv_mdef);
        tvHit = (TextView) v.findViewById(R.id.tv_hit);
        tvMis = (TextView) v.findViewById(R.id.tv_mis);
        tvPcri = (TextView) v.findViewById(R.id.tv_pcri);
        tvMcri = (TextView) v.findViewById(R.id.tv_mcriatk);
        tvPcatk = (TextView) v.findViewById(R.id.tv_pcriatk);
        tvMcatk = (TextView) v.findViewById(R.id.tv_mcri);
        tvHPR = (TextView) v.findViewById(R.id.tv_hprcv);
        tvMPR = (TextView) v.findViewById(R.id.tv_mprcv);

        tvFireAtk = (TextView) v.findViewById(R.id.tv_fire_atk);
        tvWatereAtk = (TextView) v.findViewById(R.id.tv_water_atk);
        tvLightAtk = (TextView) v.findViewById(R.id.tv_light_atk);
        tvDarkAtk = (TextView) v.findViewById(R.id.tv_dark_atk);
        tvFireDef = (TextView) v.findViewById(R.id.tv_fire_def);
        tvWaterDef = (TextView) v.findViewById(R.id.tv_water_def);
        tvLightDef = (TextView) v.findViewById(R.id.tv_light_def);
        tvDarkDef = (TextView) v.findViewById(R.id.tv_dark_def);
    }

    @Override
    protected void initData() {
        calcStatistic();
    }

    private void calcStatistic() {

    }

    @Override
    protected void click(View v) {

    }
}
