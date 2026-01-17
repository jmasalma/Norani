package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcvh {
    private final Context zza;
    private final zzfcw zzb;
    private final Bundle zzc;
    private final zzfco zzd;
    private final zzcuy zze;
    private final zzedr zzf;
    private final int zzg;

    /* synthetic */ zzcvh(zzcvf zzcvf, zzcvg zzcvg) {
        this.zza = zzcvf.zza;
        this.zzb = zzcvf.zzb;
        this.zzc = zzcvf.zzc;
        this.zzd = zzcvf.zzd;
        this.zze = zzcvf.zze;
        this.zzf = zzcvf.zzf;
        this.zzg = zzcvf.zzg;
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final Context zzb(Context context) {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzc() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final zzcuy zzd() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final zzcvf zze() {
        zzcvf zzcvf = new zzcvf();
        zzcvf.zzf(this.zza);
        zzcvf.zzk(this.zzb);
        zzcvf.zzg(this.zzc);
        zzcvf.zzh(this.zze);
        zzcvf.zze(this.zzf);
        return zzcvf;
    }

    /* access modifiers changed from: package-private */
    public final zzedr zzf(String str) {
        zzedr zzedr = this.zzf;
        return zzedr != null ? zzedr : new zzedr(str);
    }

    /* access modifiers changed from: package-private */
    public final zzfco zzg() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final zzfcw zzh() {
        return this.zzb;
    }
}
