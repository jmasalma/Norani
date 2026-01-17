package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbni implements Runnable {
    public final /* synthetic */ zzbnl zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbni(zzbnl zzbnl, String str) {
        this.zza = zzbnl;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zza.loadData(this.zzb, "text/html", "UTF-8");
    }
}
