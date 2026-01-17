package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbnf implements Runnable {
    public final /* synthetic */ zzbnl zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbnf(zzbnl zzbnl, String str) {
        this.zza = zzbnl;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zza.loadUrl(this.zzb);
    }
}
