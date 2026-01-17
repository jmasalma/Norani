package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdje {
    public static final zzdje zza = new zzdje(new zzdjc());
    private final zzbhq zzb;
    private final zzbhn zzc;
    private final zzbid zzd;
    private final zzbia zze;
    private final zzbmy zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdje(zzdjc zzdjc) {
        this.zzb = zzdjc.zza;
        this.zzc = zzdjc.zzb;
        this.zzd = zzdjc.zzc;
        this.zzg = new SimpleArrayMap(zzdjc.zzf);
        this.zzh = new SimpleArrayMap(zzdjc.zzg);
        this.zze = zzdjc.zzd;
        this.zzf = zzdjc.zze;
    }

    public final zzbhn zza() {
        return this.zzc;
    }

    public final zzbhq zzb() {
        return this.zzb;
    }

    public final zzbht zzc(String str) {
        return (zzbht) this.zzh.get(str);
    }

    public final zzbhw zzd(String str) {
        if (str == null) {
            return null;
        }
        return (zzbhw) this.zzg.get(str);
    }

    public final zzbia zze() {
        return this.zze;
    }

    public final zzbid zzf() {
        return this.zzd;
    }

    public final zzbmy zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        SimpleArrayMap simpleArrayMap = this.zzg;
        ArrayList arrayList = new ArrayList(simpleArrayMap.size());
        for (int i = 0; i < simpleArrayMap.size(); i++) {
            arrayList.add((String) simpleArrayMap.keyAt(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
