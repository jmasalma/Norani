package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzawr implements zzfqf {
    private final zzfok zza;
    private final zzfoz zzb;
    private final zzaxe zzc;
    private final zzawq zzd;
    private final zzawa zze;
    private final zzaxg zzf;
    private final zzawy zzg;
    private final zzawp zzh;

    zzawr(zzfok zzfok, zzfoz zzfoz, zzaxe zzaxe, zzawq zzawq, zzawa zzawa, zzaxg zzaxg, zzawy zzawy, zzawp zzawp) {
        this.zza = zzfok;
        this.zzb = zzfoz;
        this.zzc = zzaxe;
        this.zzd = zzawq;
        this.zze = zzawa;
        this.zzf = zzaxg;
        this.zzg = zzawy;
        this.zzh = zzawp;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfok zzfok = this.zza;
        zzatq zzb2 = this.zzb.zzb();
        hashMap.put("v", zzfok.zzd());
        hashMap.put("gms", Boolean.valueOf(zzfok.zzg()));
        hashMap.put("int", zzb2.zzg());
        hashMap.put("attts", Long.valueOf(zzb2.zzf().zza()));
        hashMap.put("att", zzb2.zzf().zzd());
        hashMap.put("attkid", zzb2.zzf().zzf());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzawy zzawy = this.zzg;
        if (zzawy != null) {
            hashMap.put("tcq", Long.valueOf(zzawy.zzc()));
            hashMap.put("tpq", Long.valueOf(zzawy.zzg()));
            hashMap.put("tcv", Long.valueOf(zzawy.zzd()));
            hashMap.put("tpv", Long.valueOf(zzawy.zzh()));
            hashMap.put("tchv", Long.valueOf(zzawy.zzb()));
            hashMap.put("tphv", Long.valueOf(zzawy.zzf()));
            hashMap.put("tcc", Long.valueOf(zzawy.zza()));
            hashMap.put("tpc", Long.valueOf(zzawy.zze()));
            zzawa zzawa = this.zze;
            if (zzawa != null) {
                hashMap.put("nt", Long.valueOf(zzawa.zza()));
            }
            zzaxg zzaxg = this.zzf;
            if (zzaxg != null) {
                hashMap.put("vs", Long.valueOf(zzaxg.zzc()));
                hashMap.put("vf", Long.valueOf(zzaxg.zzb()));
            }
        }
        return hashMap;
    }

    public final Map zza() {
        zzaxe zzaxe = this.zzc;
        Map zze2 = zze();
        zze2.put("lts", Long.valueOf(zzaxe.zza()));
        return zze2;
    }

    public final Map zzb() {
        return zze();
    }

    public final Map zzc() {
        zzawp zzawp = this.zzh;
        Map zze2 = zze();
        if (zzawp != null) {
            zze2.put("vst", zzawp.zza());
        }
        return zze2;
    }

    /* access modifiers changed from: package-private */
    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
