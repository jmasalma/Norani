package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfed implements zzcwb {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzbzw zzc;

    public zzfed(Context context, zzbzw zzbzw) {
        this.zzb = context;
        this.zzc = zzbzw;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final synchronized void zzdD(zze zze) {
        if (zze.zza != 3) {
            this.zzc.zzl(this.zza);
        }
    }
}
