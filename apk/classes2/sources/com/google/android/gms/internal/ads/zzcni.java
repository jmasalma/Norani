package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcni {
    private final String zza;
    private final zzbpf zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public zzcnn zzd;
    private final zzbkf zze = new zzcnf(this);
    private final zzbkf zzf = new zzcnh(this);

    public zzcni(String str, zzbpf zzbpf, Executor executor) {
        this.zza = str;
        this.zzb = zzbpf;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcni zzcni, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcni.zza);
    }

    public final void zzc(zzcnn zzcnn) {
        zzbpf zzbpf = this.zzb;
        zzbpf.zzb("/updateActiveView", this.zze);
        zzbpf.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcnn;
    }

    public final void zzd(zzcfg zzcfg) {
        zzcfg.zzag("/updateActiveView", this.zze);
        zzcfg.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        zzbpf zzbpf = this.zzb;
        zzbpf.zzc("/updateActiveView", this.zze);
        zzbpf.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcfg zzcfg) {
        zzcfg.zzaz("/updateActiveView", this.zze);
        zzcfg.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
