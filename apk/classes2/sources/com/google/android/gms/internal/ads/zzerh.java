package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzerh implements zzeub {
    private final Integer zza;

    public zzerh(Integer num) {
        this.zza = num;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcva zzcva = (zzcva) obj;
        if (num != null) {
            zzcva.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
