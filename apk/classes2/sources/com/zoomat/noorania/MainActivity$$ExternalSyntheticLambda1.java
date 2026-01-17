package com.zoomat.noorania;

import android.util.Log;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda1 implements ConsentInformation.OnConsentInfoUpdateFailureListener {
    public final void onConsentInfoUpdateFailure(FormError formError) {
        Log.d("UMP", "فشل التحديث: " + formError.getMessage());
    }
}
