package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbm;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzbo;
import com.google.android.gms.internal.consent_sdk.zzcs;
import com.google.android.ump.ConsentForm;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class UserMessagingPlatform {

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(ConsentForm consentForm);
    }

    private UserMessagingPlatform() {
    }

    public static ConsentInformation getConsentInformation(Context context) {
        return zza.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        if (zza.zza(activity).zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed((FormError) null);
            return;
        }
        zzbo zzc = zza.zza(activity).zzc();
        zzcs.zza();
        zzbm zzbm = new zzbm(activity, onConsentFormDismissedListener);
        Objects.requireNonNull(onConsentFormDismissedListener);
        zzc.zzb(zzbm, new zzbn(onConsentFormDismissedListener));
    }

    public static void loadConsentForm(Context context, OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zza.zza(context).zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public static void showPrivacyOptionsForm(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zza.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
