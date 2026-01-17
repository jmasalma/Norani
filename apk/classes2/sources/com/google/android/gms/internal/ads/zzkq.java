package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzkq {
    public zzls zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    /* access modifiers changed from: private */
    public boolean zze;

    public zzkq(zzls zzls) {
        this.zza = zzls;
    }

    public final void zza(int i) {
        boolean z = true;
        if (true != (this.zze | i)) {
            z = false;
        }
        this.zze = z;
        this.zzb += i;
    }

    public final void zzb(zzls zzls) {
        this.zze |= this.zza != zzls;
        this.zza = zzls;
    }

    public final void zzc(int i) {
        boolean z = true;
        if (!this.zzc || this.zzd == 5) {
            this.zze = true;
            this.zzc = true;
            this.zzd = i;
            return;
        }
        if (i != 5) {
            z = false;
        }
        zzdd.zzd(z);
    }
}
