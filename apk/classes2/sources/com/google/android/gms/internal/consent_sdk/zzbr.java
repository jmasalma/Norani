package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final /* synthetic */ class zzbr implements Runnable {
    public final /* synthetic */ zzbv zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbr(zzbv zzbv, String str) {
        this.zza = zzbv;
        this.zzb = str;
    }

    public final void run() {
        zzct.zza(this.zza, this.zzb);
    }
}
