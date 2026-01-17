package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdsi {
    final /* synthetic */ zzdsj zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdsi(zzdsj zzdsj) {
        Objects.requireNonNull(zzdsj);
        this.zza = zzdsj;
    }

    public final zzdsi zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdsi zzc(zzfca zzfca) {
        zzb("aai", zzfca.zzw);
        zzb("request_id", zzfca.zzan);
        zzb("ad_format", zzfca.zza(zzfca.zzb));
        return this;
    }

    public final zzdsi zzd(zzfcd zzfcd) {
        zzb("gqi", zzfcd.zzb);
        return this;
    }

    public final String zze() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzi() {
        this.zza.zzb.execute(new zzdsh(this));
    }

    public final void zzj() {
        this.zza.zzb.execute(new zzdsf(this));
    }

    public final void zzk() {
        this.zza.zzb.execute(new zzdsg(this));
    }
}
