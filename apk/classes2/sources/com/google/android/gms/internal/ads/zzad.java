package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzad {
    private String zza;
    private Uri zzb;
    private final zzae zzc = new zzae();
    private final List zzd;
    private final zzfyq zze;
    private final zzai zzf;
    private final zzam zzg;

    public zzad() {
        zzfyq.zzn();
        this.zzd = Collections.emptyList();
        this.zze = zzfyq.zzn();
        this.zzf = new zzai();
        this.zzg = zzam.zza;
    }

    public final zzad zza(String str) {
        String str2 = str;
        this.zza = str;
        return this;
    }

    public final zzad zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzap zzc() {
        Uri uri = this.zzb;
        zzak zzak = uri != null ? new zzak(uri, (String) null, (zzah) null, (zzac) null, this.zzd, (String) null, this.zze, (Object) null, -9223372036854775807L, (zzao) null) : null;
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzap(str, new zzag(this.zzc, (zzao) null), zzak, new zzaj(this.zzf, (zzao) null), zzat.zza, this.zzg, (zzao) null);
    }
}
