package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcbq {
    private final Context zza;
    private final zzccb zzb;
    private final ViewGroup zzc;
    private final zzdsj zzd;
    private zzcbp zze;

    public zzcbq(Context context, ViewGroup viewGroup, zzcfg zzcfg, zzdsj zzdsj) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcfg;
        this.zze = null;
        this.zzd = zzdsj;
    }

    public final zzcbp zza() {
        return this.zze;
    }

    public final Integer zzb() {
        zzcbp zzcbp = this.zze;
        if (zzcbp != null) {
            return zzcbp.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbp zzcbp = this.zze;
        if (zzcbp != null) {
            zzcbp.zzF(i, i2, i3, i4);
        }
    }

    public final void zzd(int i, int i2, int i3, int i4, int i5, boolean z, zzcca zzcca) {
        if (this.zze == null) {
            zzccb zzccb = this.zzb;
            zzbdl.zza(zzccb.zzl().zza(), zzccb.zzk(), "vpr2");
            zzcbp zzcbp = new zzcbp(this.zza, zzccb, i5, z, zzccb.zzl().zza(), zzcca, this.zzd);
            this.zze = zzcbp;
            this.zzc.addView(zzcbp, 0, new ViewGroup.LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            this.zze.zzF(i, i2, i3, i4);
            zzccb.zzz(false);
        }
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbp zzcbp = this.zze;
        if (zzcbp != null) {
            zzcbp.zzq();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbp zzcbp = this.zze;
        if (zzcbp != null) {
            zzcbp.zzu();
        }
    }

    public final void zzg(int i) {
        zzcbp zzcbp = this.zze;
        if (zzcbp != null) {
            zzcbp.zzC(i);
        }
    }
}
