package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzehu extends zzeiv {
    private final zzdem zza;

    public zzehu(zzcvw zzcvw, zzdeb zzdeb, zzcwq zzcwq, zzcxf zzcxf, zzcxk zzcxk, zzcwl zzcwl, zzdaz zzdaz, zzdey zzdey, zzcye zzcye, zzdem zzdem, zzdav zzdav) {
        super(zzcvw, zzdeb, zzcwq, zzcxf, zzcxk, zzdaz, zzcye, zzdey, zzdav, zzcwl);
        this.zza = zzdem;
    }

    public final void zzs(zzbwo zzbwo) {
        this.zza.zza(zzbwo);
    }

    public final void zzt(zzbws zzbws) throws RemoteException {
        this.zza.zza(new zzbwo(zzbws.zzf(), zzbws.zze()));
    }

    public final void zzu() throws RemoteException {
        this.zza.zza((zzbwo) null);
    }

    public final void zzv() throws RemoteException {
        this.zza.zzb();
    }

    public final void zzw() {
        this.zza.zzb();
    }

    public final void zzz() {
        this.zza.zzc();
    }
}
