package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzyv {
    public final zzbm zza;
    public final int[] zzb;

    public zzyv(zzbm zzbm, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzea.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbm;
        this.zzb = iArr;
    }
}
