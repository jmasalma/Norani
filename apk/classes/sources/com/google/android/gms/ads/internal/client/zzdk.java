package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzdk implements MuteThisAdReason {
    private final String zza;
    private final zzdj zzb;

    public zzdk(zzdj zzdj) {
        String str;
        this.zzb = zzdj;
        try {
            str = zzdj.zze();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            str = null;
        }
        this.zza = str;
    }

    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzdj zza() {
        return this.zzb;
    }
}
