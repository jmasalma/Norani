package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcvs implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;
    private final zzhha zzc;
    private final zzhha zzd;
    private final zzhha zze;

    private zzcvs(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        this.zza = zzhha;
        this.zzb = zzhha2;
        this.zzc = zzhha3;
        this.zzd = zzhha4;
        this.zze = zzhha5;
    }

    public static zzcvs zzc(zzhha zzhha, zzhha zzhha2, zzhha zzhha3, zzhha zzhha4, zzhha zzhha5) {
        return new zzcvs(zzhha, zzhha2, zzhha3, zzhha4, zzhha5);
    }

    /* renamed from: zza */
    public final zzcvr zzb() {
        zzfca zzc2 = ((zzcrr) this.zza).zzc();
        zzfca zzfca = zzc2;
        String zzc3 = ((zzcrs) this.zzb).zzc();
        String str = zzc3;
        zzfcd zzc4 = ((zzcrt) this.zzd).zzc();
        zzfcd zzfcd = zzc4;
        return new zzcvr(zzc2, zzc3, (zzedr) this.zzc.zzb(), zzc4, (String) this.zze.zzb());
    }
}
