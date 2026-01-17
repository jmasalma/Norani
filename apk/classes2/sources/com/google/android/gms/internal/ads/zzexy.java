package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzexy implements zzcwb, zzcxx, zzezo, zzr, zzcyk, zzcwo, zzded {
    private final zzfef zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzexy zzh = null;

    public zzexy(zzfef zzfef) {
        this.zza = zzfef;
    }

    public static zzexy zzi(zzexy zzexy) {
        zzexy zzexy2 = new zzexy(zzexy.zza);
        zzexy zzexy3 = zzexy;
        zzexy2.zzh = zzexy;
        return zzexy2;
    }

    public final void zzd() {
    }

    public final void zzdH() {
    }

    public final void zzdf() {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzdf();
        } else {
            zzezf.zza(this.zzd, new zzexp());
        }
    }

    public final void zzdk() {
    }

    public final void zzds() {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzds();
        } else {
            zzezf.zza(this.zzf, new zzexm());
        }
    }

    public final void zzdt() {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzdt();
            return;
        }
        zzezf.zza(this.zzf, new zzexx());
        AtomicReference atomicReference = this.zzd;
        zzezf.zza(atomicReference, new zzexk());
        zzezf.zza(atomicReference, new zzexl());
    }

    public final void zzdv() {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzdv();
        } else {
            zzezf.zza(this.zzf, new zzexw());
        }
    }

    public final void zzdw(int i) {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzdw(i);
        } else {
            zzezf.zza(this.zzf, new zzexs(i));
        }
    }

    public final void zzg() {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzg();
        } else {
            zzezf.zza(this.zze, new zzexv());
        }
    }

    public final void zzh(zzt zzt) {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzh(zzt);
        } else {
            zzezf.zza(this.zzg, new zzexj(zzt));
        }
    }

    public final void zzj() {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzj();
            return;
        }
        this.zza.zza();
        zzezf.zza(this.zzc, new zzexq());
        zzezf.zza(this.zzd, new zzexr());
    }

    public final void zzl(zzezo zzezo) {
        this.zzh = (zzexy) zzezo;
    }

    public final void zzm(zzr zzr) {
        this.zzf.set(zzr);
    }

    public final void zzn(zzdt zzdt) {
        this.zzg.set(zzdt);
    }

    public final void zzo(zzbaz zzbaz) {
        this.zzb.set(zzbaz);
    }

    public final void zzp(zzbbd zzbbd) {
        this.zzd.set(zzbbd);
    }

    public final void zzs(zze zze2) {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzs(zze2);
        } else {
            zzezf.zza(this.zzd, new zzexn(zze2));
        }
    }

    public final void zzk(zzbaw zzbaw) {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzk(zzbaw);
        } else {
            zzezf.zza(this.zzb, new zzexo(zzbaw));
        }
    }

    public final void zzdD(zze zze2) {
        zzexy zzexy = this.zzh;
        if (zzexy != null) {
            zzexy.zzdD(zze2);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzezf.zza(atomicReference, new zzext(zze2));
        zzezf.zza(atomicReference, new zzexu(zze2));
    }
}
