package com.amiltone.td_iem_411;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.activity_main_tv_content) TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.activity_main_button_associate)
    public void actionAssociate(Button button) {
        updateContent("Associate clicked");
    }

    @OnClick(R.id.activity_main_button_detail)
    public void actionDetail(Button button) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.activity_main_button_retrieve)
    public void actionRetrieve(Button button) {
        updateContent("Retrieve clicked");
    }

    private void updateContent(String value) {
        tvContent.setText(value);
    }
}
