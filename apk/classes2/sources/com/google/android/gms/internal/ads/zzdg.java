package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdg implements Runnable {
    public final /* synthetic */ zzdi zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzdg(zzdi zzdi, Object obj) {
        this.zza = zzdi;
        this.zzb = obj;
    }

    public final void run() {
        zzdi.zza(this.zza, this.zzb);
    }
}
