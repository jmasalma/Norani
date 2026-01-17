package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdly implements zzcgw {
    public final /* synthetic */ zzcaj zza;

    public /* synthetic */ zzdly(zzcaj zzcaj) {
        this.zza = zzcaj;
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzcaj zzcaj = this.zza;
        if (z) {
            zzcaj.zzb();
            return;
        }
        zzcaj.zzd(new zzehf(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
