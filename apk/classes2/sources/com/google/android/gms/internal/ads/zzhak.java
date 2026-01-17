package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhak implements zzhbm {
    private static final zzhaq zza = new zzhai();
    private final zzhaq zzb;

    public zzhak() {
        zzhaq zzhaq = zza;
        int i = zzhbc.zza;
        zzhaj zzhaj = new zzhaj(zzgza.zza(), zzhaq);
        byte[] bArr = zzgzu.zzb;
        this.zzb = zzhaj;
    }

    public final zzhbl zza(Class cls) {
        int i = zzhbn.zza;
        if (!zzgzh.class.isAssignableFrom(cls)) {
            int i2 = zzhbc.zza;
        }
        zzhap zzb2 = this.zzb.zzb(cls);
        if (!zzb2.zzb()) {
            int i3 = zzhbc.zza;
            return zzhav.zzm(cls, zzb2, zzhaz.zza(), zzhag.zza(), zzhbn.zzm(), zzb2.zzc() + -1 != 1 ? zzgyu.zza() : null, zzhao.zza());
        }
        int i4 = zzhbc.zza;
        return zzhaw.zzc(zzhbn.zzm(), zzgyu.zza(), zzb2.zza());
    }
}
