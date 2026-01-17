package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdnk implements zzbkf {
    private final zzbht zza;
    private final zzdny zzb;
    private final zzhgl zzc;

    public zzdnk(zzdje zzdje, zzdit zzdit, zzdny zzdny, zzhgl zzhgl) {
        this.zza = zzdje.zzc(zzdit.zzA());
        this.zzb = zzdny;
        this.zzc = zzhgl;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbhj) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza != null) {
            this.zzb.zzl("/nativeAdCustomClick", this);
        }
    }
}
