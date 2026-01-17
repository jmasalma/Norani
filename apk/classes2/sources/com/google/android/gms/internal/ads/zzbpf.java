package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbpf {
    private final zzboi zza;
    private ListenableFuture zzb;

    zzbpf(zzboi zzboi) {
        this.zza = zzboi;
    }

    private final void zzd() {
        if (this.zzb == null) {
            zzcak zzcak = new zzcak();
            this.zzb = zzcak;
            this.zza.zzb((zzavu) null).zzj(new zzbpc(zzcak), new zzbpd(zzcak));
        }
    }

    public final zzbpi zza(String str, zzbop zzbop, zzboo zzboo) {
        zzd();
        return new zzbpi(this.zzb, "google.afma.activeView.handleUpdate", zzbop, zzboo);
    }

    public final void zzb(String str, zzbkf zzbkf) {
        zzd();
        this.zzb = zzgdn.zzn(this.zzb, new zzbpe(str, zzbkf), zzcaf.zzg);
    }

    public final void zzc(String str, zzbkf zzbkf) {
        this.zzb = zzgdn.zzm(this.zzb, new zzbpb(str, zzbkf), zzcaf.zzg);
    }
}
