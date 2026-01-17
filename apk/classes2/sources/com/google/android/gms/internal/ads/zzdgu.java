package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzdgu implements zzcrd {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhhg zzd;
    private final zzdje zze;

    zzdgu(Map map, Map map2, Map map3, zzhhg zzhhg, zzdje zzdje) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhhg;
        this.zze = zzdje;
    }

    public final zzedm zza(int i, String str) {
        zzedm zzedm;
        zzedm zzedm2 = (zzedm) this.zza.get(str);
        if (zzedm2 != null) {
            return zzedm2;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzefv zzefv = (zzefv) this.zzc.get(str);
            if (zzefv != null) {
                return new zzedn(zzefv, new zzcrf());
            }
            zzedm = (zzedm) this.zzb.get(str);
            if (zzedm == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzedm = ((zzcrd) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzedn(zzedm, new zzcrg());
    }
}
