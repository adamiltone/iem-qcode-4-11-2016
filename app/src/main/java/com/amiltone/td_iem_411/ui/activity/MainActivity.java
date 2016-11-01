package com.amiltone.td_iem_411.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.amiltone.td_iem_411.R;
import com.amiltone.td_iem_411.model.manager.BLEManager;
import com.amiltone.td_iem_411.ui.composition.MessagingModule;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.activity_main_tv_content) TextView tvContent;
    private BLEManager bleManager;
    private MessagingModule messagingModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initializeInjection();
    }

    private void initializeInjection() {
        bleManager = BLEManager.getInstance();
        messagingModule = new MessagingModule();
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
        messagingModule.displayError(getApplicationContext(),errorMsg);
    }
}