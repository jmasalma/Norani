package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcpl implements zzhgr {
    private final zzcoz zza;
    private final zzhha zzb;

    private zzcpl(zzcoz zzcoz, zzhha zzhha) {
        this.zza = zzcoz;
        this.zzb = zzhha;
    }

    public static zzcpl zza(zzcoz zzcoz, zzhha zzhha) {
        return new zzcpl(zzcoz, zzhha);
    }

    public static zzddv zzc(zzcoz zzcoz, zzcqn zzcqn) {
        zzddv zzddv = new zzddv(zzcqn, zzcaf.zzf);
        zzddv zzddv2 = zzddv;
        return zzddv;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcqn) this.zzb.zzb());
    }
}
