package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzak {
    public final Uri zza;
    public final String zzb = null;
    public final zzah zzc = null;
    public final zzac zzd = null;
    public final List zze;
    public final String zzf;
    public final zzfyq zzg;
    public final Object zzh;
    public final long zzi;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* synthetic */ zzak(Uri uri, String str, zzah zzah, zzac zzac, List list, String str2, zzfyq zzfyq, Object obj, long j, zzao zzao) {
        this.zza = uri;
        int i = zzay.zza;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfyq;
        int i2 = zzfyq.zzd;
        zzfyn zzfyn = new zzfyn();
        if (zzfyq.size() <= 0) {
            zzfyn.zzi();
            this.zzh = null;
            this.zzi = -9223372036854775807L;
            return;
        }
        zzan zzan = (zzan) zzfyq.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzak = (zzak) obj;
        if (this.zza.equals(zzak.zza)) {
            String str = zzak.zzb;
            if (Objects.equals((Object) null, (Object) null)) {
                zzah zzah = zzak.zzc;
                if (Objects.equals((Object) null, (Object) null)) {
                    zzac zzac = zzak.zzd;
                    if (Objects.equals((Object) null, (Object) null) && this.zze.equals(zzak.zze)) {
                        String str2 = zzak.zzf;
                        if (Objects.equals((Object) null, (Object) null) && this.zzg.equals(zzak.zzg)) {
                            Object obj2 = zzak.zzh;
                            if (Objects.equals((Object) null, (Object) null)) {
                                long j = zzak.zzi;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
