package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final /* synthetic */ class zzbe implements Runnable {
    public final /* synthetic */ zzbo zza;
    public final /* synthetic */ zzbc zzb;

    public /* synthetic */ zzbe(zzbo zzbo, zzbc zzbc) {
        this.zza = zzbo;
        this.zzb = zzbc;
    }

    public final void run() {
        zzbo.zza(this.zza, this.zzb);
    }
}
