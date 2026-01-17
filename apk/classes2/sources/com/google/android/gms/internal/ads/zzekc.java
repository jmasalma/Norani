package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzekc extends zzbp {
    private final zzelj zza;

    public zzekc(Context context, zzche zzche, zzfcu zzfcu, zzdje zzdje, zzbk zzbk) {
        zzell zzell = new zzell(zzdje, zzche.zzi());
        zzell.zze(zzbk);
        this.zza = new zzelj(new zzelv(zzche, context, zzell, zzfcu), zzfcu.zzN());
    }

    public final synchronized String zze() {
        return this.zza.zza();
    }

    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    public final void zzg(zzm zzm) throws RemoteException {
        this.zza.zzd(zzm, 1);
    }

    public final synchronized void zzh(zzm zzm, int i) throws RemoteException {
        this.zza.zzd(zzm, i);
    }

    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
