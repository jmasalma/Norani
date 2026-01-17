package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzabh {
    /* access modifiers changed from: private */
    public final Context zza;
    /* access modifiers changed from: private */
    public final zzabs zzb;
    /* access modifiers changed from: private */
    public zzca zzc;
    /* access modifiers changed from: private */
    public boolean zzd;
    /* access modifiers changed from: private */
    public zzdj zze = zzdj.zza;
    private boolean zzf;

    public zzabh(Context context, zzabs zzabs) {
        this.zza = context.getApplicationContext();
        this.zzb = zzabs;
    }

    public final zzabh zzd(zzdj zzdj) {
        this.zze = zzdj;
        return this;
    }

    public final zzabh zze(boolean z) {
        this.zzd = true;
        return this;
    }

    public final zzabo zzf() {
        zzdd.zzf(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzabl(false);
        }
        zzabo zzabo = new zzabo(this, (zzabn) null);
        this.zzf = true;
        return zzabo;
    }
}
