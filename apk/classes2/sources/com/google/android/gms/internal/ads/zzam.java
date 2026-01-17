package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzam {
    public static final zzam zza = new zzam(new zzal());
    public final Uri zzb = null;
    public final String zzc = null;
    public final Bundle zzd = null;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    private zzam(zzal zzal) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        zzam zzam = (zzam) obj;
        Uri uri = zzam.zzb;
        if (Objects.equals((Object) null, (Object) null)) {
            String str = zzam.zzc;
            if (Objects.equals((Object) null, (Object) null)) {
                Bundle bundle = zzam.zzd;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
