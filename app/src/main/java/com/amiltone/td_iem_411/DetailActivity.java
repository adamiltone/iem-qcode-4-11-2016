package com.amiltone.td_iem_411;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by amiltonedev_lt027 on 01/11/2016.
 */

public class DetailActivity extends AppCompatActivity {
    @BindView(R.id.activity_detail_tv_content) TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.activity_detail_button_history)
    public void actionRetrieve(Button button) {
        updateContent("History clicked");
    }


    private void updateContent(String value) {
        tvContent.setText(value);
    }

}
