package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfmi {
    private static final zzfmi zza = new zzfmi();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfmi() {
    }

    public static zzfmi zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzflp zzflp) {
        this.zzb.add(zzflp);
    }

    public final void zze(zzflp zzflp) {
        ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzflp);
        this.zzc.remove(zzflp);
        if (zzg && !zzg()) {
            zzfmq.zzb().zzg();
        }
    }

    public final void zzf(zzflp zzflp) {
        ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzflp);
        if (!zzg) {
            zzfmq.zzb().zzf();
        }
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
