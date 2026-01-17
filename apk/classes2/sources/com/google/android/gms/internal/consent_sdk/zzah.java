package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
final class zzah extends zza {
    final zzdr zza;
    final zzdr zzb;
    final zzdr zzc;
    final zzdr zzd;
    final zzdr zze;
    final zzdr zzf;
    final zzdr zzg;
    final zzdr zzh;
    final zzdr zzi;
    final zzdr zzj;
    final zzdr zzk;
    final zzdr zzl;
    final zzdr zzm;
    /* access modifiers changed from: private */
    public final zzah zzn = this;

    zzah(Application application) {
        zzdo zzb2 = zzdp.zzb(application);
        this.zza = zzb2;
        zzdr zzb3 = zzdn.zzb(new zzar(zzb2));
        this.zzb = zzb3;
        zzdr zzb4 = zzdn.zzb(zzae.zza);
        this.zzc = zzb4;
        zzag zzag = new zzag(this);
        this.zzd = zzag;
        zzav zzav = zzau.zza;
        zzdr zzb5 = zzdn.zzb(new zzbp(zzag, zzav));
        this.zze = zzb5;
        zzq zzq = new zzq(zzb2, zzb3);
        this.zzf = zzq;
        zzdr zzb6 = zzdn.zzb(new zzf(zzav));
        this.zzg = zzb6;
        zzdr zzb7 = zzdn.zzb(new zzan(zzb2));
        this.zzh = zzb7;
        zzdr zzb8 = zzdn.zzb(new zzm(zzb2, zzb7));
        this.zzi = zzb8;
        zzap zzap = new zzap(zzb2, zzb3, zzb8, zzav);
        this.zzj = zzap;
        zzac zzac = new zzac(zzb6, zzap, zzb3);
        this.zzk = zzac;
        zzx zzx = new zzx(zzb2, zzb4, zzas.zza, zzav, zzb3, zzb5, zzq, zzac, zzb6);
        this.zzl = zzx;
        this.zzm = zzdn.zzb(new zzk(zzb3, zzx, zzb5));
    }

    public final zzj zzb() {
        return (zzj) this.zzm.zza();
    }

    public final zzbo zzc() {
        return (zzbo) this.zze.zza();
    }
}
