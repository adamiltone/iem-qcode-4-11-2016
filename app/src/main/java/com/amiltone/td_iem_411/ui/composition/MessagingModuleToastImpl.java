package com.amiltone.td_iem_411.ui.composition;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by amiltonedev_lt027 on 01/11/2016.
 */

public class MessagingModuleToastImpl implements MessagingModule {
    public void displayError(Context context, String errorMsg) {
        Toast.makeText(context, errorMsg, Toast.LENGTH_SHORT).show();
    }
}
