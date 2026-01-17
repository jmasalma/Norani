package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzchh {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* synthetic */ zzchh(zzchf zzchf, zzchg zzchg) {
        this.zza = zzchf.zza;
        this.zzb = zzchf.zzb;
        this.zzd = zzchf.zzd;
        this.zzc = zzchf.zzc;
    }

    /* access modifiers changed from: package-private */
    public final long zza() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final Context zzb() {
        return this.zzb;
    }

    public final zzk zzc() {
        return new zzk(this.zzb, this.zza);
    }

    /* access modifiers changed from: package-private */
    public final zzbfx zzd() {
        return new zzbfx(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final VersionInfoParcel zze() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final String zzf() {
        return zzv.zzr().zzc(this.zzb, this.zza.afmaVersion);
    }

    /* access modifiers changed from: package-private */
    public final WeakReference zzg() {
        return this.zzd;
    }
}
