package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbcg {
    final /* synthetic */ zzbci zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbcg(zzbci zzbci, byte[] bArr, zzbch zzbch) {
        Objects.requireNonNull(zzbci);
        this.zza = zzbci;
        this.zzb = bArr;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbci zzbci = this.zza;
            if (zzbci.zzb) {
                zzbci.zza.zzj(this.zzb);
                zzbci.zza.zzi(0);
                zzbci.zza.zzg(this.zzc);
                zzbci.zza.zzh((int[]) null);
                zzbci.zza.zzf();
            }
        } catch (RemoteException e) {
            zzo.zzf("Clearcut log failed", e);
        }
    }

    public final zzbcg zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new zzbcf(this));
    }
}
