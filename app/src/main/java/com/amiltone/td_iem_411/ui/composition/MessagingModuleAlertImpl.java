package com.amiltone.td_iem_411.ui.composition;

import android.content.Context;

import com.afollestad.materialdialogs.MaterialDialog;
import com.amiltone.td_iem_411.R;

/**
 * Created by amiltonedev_lt027 on 01/11/2016.
 */

public class MessagingModuleAlertImpl implements MessagingModule {
    @Override
    public void displayError(Context context, String errorMsg) {
        MaterialDialog dialog = new MaterialDialog.Builder(context)
                .title(R.string.dialog_label_error_title)
                .content(errorMsg)
                .positiveText(R.string.dialog_label_ok)
                .show();
    }
}
