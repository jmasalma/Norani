package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfqg {
    final /* synthetic */ zzfqi zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfqg(zzfqi zzfqi, byte[] bArr, zzfqh zzfqh) {
        Objects.requireNonNull(zzfqi);
        this.zza = zzfqi;
        this.zzb = bArr;
    }

    public final zzfqg zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfqg zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfqi zzfqi = this.zza;
            if (zzfqi.zzb) {
                zzfql zzfql = zzfqi.zza;
                zzfql.zzj(this.zzb);
                zzfql.zzi(this.zzc);
                zzfql.zzg(this.zzd);
                zzfql.zzh((int[]) null);
                zzfql.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
