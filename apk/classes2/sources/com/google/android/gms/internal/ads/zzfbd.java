package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfbd implements OnAdMetadataChangedListener, zzcxm, zzcwb, zzcvy, zzcwo, zzcyk, zzezo, zzded {
    private final zzfef zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfbd zzi = null;

    public zzfbd(zzfef zzfef) {
        this.zza = zzfef;
    }

    public final void onAdMetadataChanged() {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.onAdMetadataChanged();
        } else {
            zzezf.zza(this.zzb, new zzfar());
        }
    }

    public final void zza() {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zza();
            return;
        }
        this.zza.zza();
        zzezf.zza(this.zzd, new zzfaz());
        zzezf.zza(this.zze, new zzfba());
    }

    public final void zzdH() {
    }

    public final void zzdf() {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zzdf();
        } else {
            zzezf.zza(this.zzd, new zzfas());
        }
    }

    public final void zzg(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzh(zzt zzt) {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zzh(zzt);
        } else {
            zzezf.zza(this.zzh, new zzfao(zzt));
        }
    }

    public final void zzi(zzdt zzdt) {
        this.zzh.set(zzdt);
    }

    public final void zzj(zzbwy zzbwy) {
        this.zzd.set(zzbwy);
    }

    public final void zzk(zzbxc zzbxc) {
        this.zzc.set(zzbxc);
    }

    public final void zzl(zzezo zzezo) {
        this.zzi = (zzfbd) zzezo;
    }

    @Deprecated
    public final void zzm(zzbwi zzbwi) {
        this.zze.set(zzbwi);
    }

    @Deprecated
    public final void zzn(zzbwd zzbwd) {
        this.zzg.set(zzbwd);
    }

    public final void zzo(zzbxd zzbxd) {
        this.zzf.set(zzbxd);
    }

    public final void zzs(zze zze2) {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zzs(zze2);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzezf.zza(atomicReference, new zzfat(zze2));
        zzezf.zza(atomicReference, new zzfau(zze2));
    }

    public final void zzb() {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zzb();
        } else {
            zzezf.zza(this.zze, new zzfbb());
        }
    }

    public final void zze() {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zze();
        } else {
            zzezf.zza(this.zze, new zzfav());
        }
    }

    public final void zzf() {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zzf();
        } else {
            zzezf.zza(this.zze, new zzfah());
        }
    }

    public final void zzu() {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zzu();
            return;
        }
        zzezf.zza(this.zzc, new zzfap());
        zzezf.zza(this.zze, new zzfaq());
    }

    public final void zzc() {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zzc();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzezf.zza(atomicReference, new zzfal());
        zzezf.zza(this.zze, new zzfam());
        zzezf.zza(atomicReference, new zzfan());
    }

    public final void zzdD(zze zze2) {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zzdD(zze2);
            return;
        }
        int i = zze2.zza;
        AtomicReference atomicReference = this.zzc;
        zzezf.zza(atomicReference, new zzfaw(zze2));
        zzezf.zza(atomicReference, new zzfax(i));
        zzezf.zza(this.zze, new zzfay(i));
    }

    public final void zzdu(zzbwc zzbwc, String str, String str2) {
        zzfbd zzfbd = this.zzi;
        if (zzfbd != null) {
            zzfbd.zzdu(zzbwc, str, str2);
            return;
        }
        zzezf.zza(this.zzd, new zzfbc(zzbwc));
        zzezf.zza(this.zzf, new zzfai(zzbwc, str, str2));
        zzezf.zza(this.zze, new zzfaj(zzbwc));
        zzezf.zza(this.zzg, new zzfak(zzbwc, str, str2));
    }
}
