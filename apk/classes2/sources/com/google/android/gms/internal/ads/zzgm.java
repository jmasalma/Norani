package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgm {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzgm() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1;
    }

    /* synthetic */ zzgm(zzgo zzgo, zzgn zzgn) {
        this.zza = zzgo.zza;
        this.zzb = zzgo.zzd;
        this.zzc = zzgo.zze;
        this.zzd = zzgo.zzf;
        this.zze = zzgo.zzg;
    }

    public final zzgm zza(int i) {
        this.zze = 6;
        return this;
    }

    public final zzgm zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzgm zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzgm zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgo zze() {
        if (this.zza != null) {
            return new zzgo(this.zza, 0, 1, (byte[]) null, this.zzb, this.zzc, this.zzd, (String) null, this.zze, (Object) null, (zzgn) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
