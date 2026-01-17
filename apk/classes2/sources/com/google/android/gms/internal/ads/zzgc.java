package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzgc implements zzgj {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgo zzd;

    protected zzgc(boolean z) {
        this.zza = z;
    }

    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    public final void zzg(int i) {
        zzgo zzgo = this.zzd;
        String str = zzex.zza;
        zzgo zzgo2 = zzgo;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhj) this.zzb.get(i2)).zza(this, zzgo, this.zza, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzh() {
        zzgo zzgo = this.zzd;
        String str = zzex.zza;
        zzgo zzgo2 = zzgo;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhj) this.zzb.get(i)).zzb(this, zzgo, this.zza);
        }
        this.zzd = null;
    }

    /* access modifiers changed from: protected */
    public final void zzi(zzgo zzgo) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzhj) this.zzb.get(i)).zzc(this, zzgo, this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj(zzgo zzgo) {
        this.zzd = zzgo;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhj) this.zzb.get(i)).zzd(this, zzgo, this.zza);
        }
    }

    public final void zzf(zzhj zzhj) {
        zzhj.getClass();
        ArrayList arrayList = this.zzb;
        if (!arrayList.contains(zzhj)) {
            arrayList.add(zzhj);
            this.zzc++;
        }
    }
}
