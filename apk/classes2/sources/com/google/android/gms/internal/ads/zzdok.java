package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdok implements zzbkw {
    private final zzcxf zza;
    private final zzbwo zzb;
    private final String zzc;
    private final String zzd;

    public zzdok(zzcxf zzcxf, zzfca zzfca) {
        this.zza = zzcxf;
        this.zzb = zzfca.zzl;
        this.zzc = zzfca.zzj;
        this.zzd = zzfca.zzk;
    }

    @ParametersAreNonnullByDefault
    public final void zza(zzbwo zzbwo) {
        int i;
        String str;
        zzbwo zzbwo2 = this.zzb;
        if (zzbwo2 != null) {
            zzbwo = zzbwo2;
        }
        if (zzbwo != null) {
            str = zzbwo.zza;
            i = zzbwo.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbvz(str, i), this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zza.zze();
    }

    public final void zzc() {
        this.zza.zzf();
    }
}
