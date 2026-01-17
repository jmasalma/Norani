package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzph {
    public final String zza;
    private final zzpg zzb;
    private final Object zzc;

    static {
        new zzph("");
    }

    public zzph(String str) {
        this.zza = str;
        this.zzb = Build.VERSION.SDK_INT >= 31 ? new zzpg() : null;
        this.zzc = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzph)) {
            return false;
        }
        zzph zzph = (zzph) obj;
        return Objects.equals(this.zza, zzph.zza) && Objects.equals(this.zzb, zzph.zzb) && Objects.equals(this.zzc, zzph.zzc);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final synchronized LogSessionId zza() {
        zzpg zzpg;
        zzpg = this.zzb;
        if (zzpg != null) {
            zzpg zzpg2 = zzpg;
        } else {
            throw null;
        }
        return zzpg.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        zzpg zzpg = this.zzb;
        if (zzpg != null) {
            zzpg zzpg2 = zzpg;
            zzdd.zzf(zzpg.zza.equals(LogSessionId.LOG_SESSION_ID_NONE));
            zzpg.zza = logSessionId;
        } else {
            throw null;
        }
    }
}
