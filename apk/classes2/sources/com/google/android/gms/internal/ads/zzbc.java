package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbc {
    private final zzt zza = new zzt();

    public final zzbc zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzbc zzb(zzbd zzbd) {
        zzv zza2 = zzbd.zza;
        for (int i = 0; i < zza2.zzb(); i++) {
            this.zza.zza(zza2.zza(i));
        }
        return this;
    }

    public final zzbc zzc(int... iArr) {
        for (int i = 0; i < 20; i++) {
            this.zza.zza(iArr[i]);
        }
        return this;
    }

    public final zzbc zzd(int i, boolean z) {
        if (z) {
            this.zza.zza(i);
        }
        return this;
    }

    public final zzbd zze() {
        return new zzbd(this.zza.zzb(), (zzbg) null);
    }
}
