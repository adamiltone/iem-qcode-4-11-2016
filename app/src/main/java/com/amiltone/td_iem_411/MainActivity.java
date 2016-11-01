package com.amiltone.td_iem_411;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.activity_main_tv_content) TextView tvContent;
    private BLEManager bleManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bleManager = BLEManager.getInstance();
    }

    @OnClick(R.id.activity_main_button_associate)
    public void actionAssociate(Button button) {
        boolean success = bleManager.connectDevice();
        if (success) {
            updateContent("Paired and connected device");
        } else {
            displayError("Failed, already connected or device offline");
        }
    }

    @OnClick(R.id.activity_main_button_detail)
    public void actionDetail(Button button) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.activity_main_button_retrieve)
    public void actionRetrieve(Button button) {
        String result = bleManager.getBLELastValue();
        if (result != null) {
            updateContent(result);
        } else {
            displayError("not connected to device");
        }
    }

    private void updateContent(String value) {
        tvContent.setText(value);
    }

    private void displayError(String errorMsg) {
        Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();
    }
}