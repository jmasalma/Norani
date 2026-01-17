package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbcj;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdqy implements zzcza, zzcxm, zzcwb, zzcws, zza, zzdbm {
    private final zzbcc zza;
    private boolean zzb = false;

    public zzdqy(zzbcc zzbcc, @Nullable zzezv zzezv) {
        this.zza = zzbcc;
        zzbcc.zzc(2);
        if (zzezv != null) {
            zzbcc.zzc(1101);
        }
    }

    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
            return;
        }
        this.zza.zzc(8);
    }

    public final void zzdD(zze zze) {
        switch (zze.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    public final void zzdn(zzbvq zzbvq) {
    }

    public final void zzdo(zzfcn zzfcn) {
        this.zza.zzb(new zzdqu(zzfcn));
    }

    public final void zzh() {
        this.zza.zzc(1109);
    }

    public final void zzi(zzbcj.zzb zzb2) {
        zzdqx zzdqx = new zzdqx(zzb2);
        zzbcc zzbcc = this.zza;
        zzbcc.zzb(zzdqx);
        zzbcc.zzc(1103);
    }

    public final void zzj(zzbcj.zzb zzb2) {
        zzdqv zzdqv = new zzdqv(zzb2);
        zzbcc zzbcc = this.zza;
        zzbcc.zzb(zzdqv);
        zzbcc.zzc(1102);
    }

    public final void zzl(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    public final void zzm(zzbcj.zzb zzb2) {
        zzdqw zzdqw = new zzdqw(zzb2);
        zzbcc zzbcc = this.zza;
        zzbcc.zzb(zzdqw);
        zzbcc.zzc(1104);
    }

    public final void zzn(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    public final synchronized void zzt() {
        this.zza.zzc(6);
    }

    public final void zzu() {
        this.zza.zzc(3);
    }
}
