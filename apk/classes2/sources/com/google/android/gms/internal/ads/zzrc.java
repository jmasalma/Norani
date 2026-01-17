package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzrc {
    /* access modifiers changed from: private */
    public final Context zza;
    /* access modifiers changed from: private */
    public final zzpj zzb;
    private boolean zzc;
    private final zzra zzd;
    private final zzrb zze;
    /* access modifiers changed from: private */
    public zzre zzf;
    /* access modifiers changed from: private */
    public zzqu zzg;

    @Deprecated
    public zzrc() {
        this.zza = null;
        this.zzb = zzpj.zza;
        this.zzd = zzra.zza;
        this.zze = zzrb.zza;
    }

    public final zzro zzc() {
        zzdd.zzf(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zzre(new zzcn[0]);
        }
        if (this.zzg == null) {
            this.zzg = new zzqu(this.zza);
        }
        return new zzro(this, (zzrn) null);
    }

    public zzrc(Context context) {
        this.zza = context;
        this.zzb = zzpj.zza;
        this.zzd = zzra.zza;
        this.zze = zzrb.zza;
    }
}
