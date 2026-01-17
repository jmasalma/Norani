package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzkd implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzacj, zzqh, zzxn, zzuf, zzhw {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzkh zza;

    /* synthetic */ zzkd(zzkh zzkh, zzkg zzkg) {
        Objects.requireNonNull(zzkh);
        this.zza = zzkh;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzkh zzkh = this.zza;
        zzkh.zzP(zzkh, surfaceTexture);
        zzkh.zzac(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzkh zzkh = this.zza;
        zzkh.zzae((Object) null);
        zzkh.zzac(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzac(i, i2);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzac(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzac(0, 0);
    }

    public final void zza(Exception exc) {
        this.zza.zzr.zzw(exc);
    }

    public final void zzb(String str, long j, long j2) {
        this.zza.zzr.zzx(str, j, j2);
    }

    public final void zzc(String str) {
        this.zza.zzr.zzy(str);
    }

    public final void zzd(zzid zzid) {
        this.zza.zzr.zzz(zzid);
    }

    public final void zze(zzid zzid) {
        this.zza.zzr.zzA(zzid);
    }

    public final void zzf(zzz zzz, zzie zzie) {
        this.zza.zzr.zzB(zzz, zzie);
    }

    public final void zzg(long j) {
        this.zza.zzr.zzC(j);
    }

    public final void zzh(int i) {
        this.zza.zzA.zzf(new zzjz(i), new zzka(i));
    }

    public final void zzi(Exception exc) {
        this.zza.zzr.zzD(exc);
    }

    public final void zzj(zzqi zzqi) {
        this.zza.zzr.zzE(zzqi);
    }

    public final void zzk(zzqi zzqi) {
        this.zza.zzr.zzF(zzqi);
    }

    public final void zzl(int i, long j, long j2) {
        this.zza.zzr.zzG(i, j, j2);
    }

    public final void zzm(int i, long j) {
        this.zza.zzr.zzH(i, j);
    }

    public final void zzn(Object obj, long j) {
        zzkh zzkh = this.zza;
        zzkh.zzr.zzI(obj, j);
        if (zzkh.zzJ == obj) {
            zzdz zzE = zzkh.zzm;
            zzE.zzd(26, new zzjy());
            zzE.zzc();
        }
    }

    public final void zzo(boolean z) {
        zzkh zzkh = this.zza;
        if (zzkh.zzP != z) {
            zzkh.zzP = z;
            zzdz zzE = zzkh.zzm;
            zzE.zzd(23, new zzkb(z));
            zzE.zzc();
        }
    }

    public final void zzp(Exception exc) {
        this.zza.zzr.zzK(exc);
    }

    public final void zzq(String str, long j, long j2) {
        this.zza.zzr.zzL(str, j, j2);
    }

    public final void zzr(String str) {
        this.zza.zzr.zzM(str);
    }

    public final void zzs(zzid zzid) {
        this.zza.zzr.zzN(zzid);
    }

    public final void zzt(zzid zzid) {
        this.zza.zzr.zzO(zzid);
    }

    public final void zzu(long j, int i) {
        this.zza.zzr.zzP(j, i);
    }

    public final void zzv(zzz zzz, zzie zzie) {
        this.zza.zzr.zzQ(zzz, zzie);
    }

    public final void zzw(zzcd zzcd) {
        zzdz zzE = this.zza.zzm;
        zzE.zzd(25, new zzkc(zzcd));
        zzE.zzc();
    }
}
