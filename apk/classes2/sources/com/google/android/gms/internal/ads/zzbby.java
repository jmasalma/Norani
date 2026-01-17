package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbby {
    /* access modifiers changed from: private */
    public zzbbn zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final Object zzd = new Object();

    zzbby(Context context) {
        this.zzc = context;
    }

    /* access modifiers changed from: package-private */
    public final Future zzc(zzbbo zzbbo) {
        zzbbs zzbbs = new zzbbs(this);
        zzbbw zzbbw = new zzbbw(this, zzbbo, zzbbs);
        zzbbx zzbbx = new zzbbx(this, zzbbs);
        synchronized (this.zzd) {
            zzbbn zzbbn = new zzbbn(this.zzc, zzv.zzv().zzb(), zzbbw, zzbbx);
            this.zza = zzbbn;
            zzbbn.checkAvailabilityAndConnect();
        }
        return zzbbs;
    }

    static /* bridge */ /* synthetic */ void zze(zzbby zzbby) {
        synchronized (zzbby.zzd) {
            zzbbn zzbbn = zzbby.zza;
            if (zzbbn != null) {
                zzbbn.disconnect();
                zzbby.zza = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
