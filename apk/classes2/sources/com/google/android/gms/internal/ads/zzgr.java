package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgr implements zzgi {
    private final zzhd zza = new zzhd();
    private zzhj zzb;
    private String zzc;
    private int zzd = 8000;
    private int zze = 8000;
    private boolean zzf;

    public final zzgr zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzgr zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzgr zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzgr zze(zzhj zzhj) {
        this.zzb = zzhj;
        return this;
    }

    public final zzgr zzf(String str) {
        this.zzc = str;
        return this;
    }

    /* renamed from: zzg */
    public final zzgw zza() {
        zzgw zzgw = new zzgw(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, (zzfvq) null, false, (zzgv) null);
        zzhj zzhj = this.zzb;
        if (zzhj != null) {
            zzgw.zzf(zzhj);
        }
        return zzgw;
    }
}
