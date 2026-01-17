package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdot implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;

    private zzdot(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
    }

    public static zzdot zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzdot(zzhha, zzhha2, zzhha3);
    }

    public final /* synthetic */ Object zzb() {
        zzedm zzedm;
        zzfcw zzc2 = ((zzcvp) this.zzc).zzc();
        zzfcw zzfcw = zzc2;
        int i = zzc2.zzo.zza;
        if (i != 0) {
            if (i - 1 != 0) {
                zzedm = ((zzeiu) this.zzb).zzb();
            } else {
                zzedm = ((zzeiu) this.zza).zzb();
            }
            zzedm zzedm2 = zzedm;
            return zzedm;
        }
        throw null;
    }
}
