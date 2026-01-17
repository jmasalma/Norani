package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final /* synthetic */ class zzu implements Runnable {
    public final /* synthetic */ zzw zza;
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener zzb;
    public final /* synthetic */ zzab zzc;

    public /* synthetic */ zzu(zzw zzw, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzab zzab) {
        this.zza = zzw;
        this.zzb = onConsentInfoUpdateSuccessListener;
        this.zzc = zzab;
    }

    public final void run() {
        zzw.zzb(this.zza, this.zzb, this.zzc);
    }
}
