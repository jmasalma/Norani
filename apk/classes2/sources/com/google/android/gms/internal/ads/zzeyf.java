package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeyf implements zzeln {
    final /* synthetic */ zzeyg zza;

    zzeyf(zzeyg zzeyg) {
        Objects.requireNonNull(zzeyg);
        this.zza = zzeyg;
    }

    public final void zza() {
        zzeyg zzeyg = this.zza;
        synchronized (zzeyg) {
            zzeyg.zza = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcom zzcom = (zzcom) obj;
        zzeyg zzeyg = this.zza;
        synchronized (zzeyg) {
            zzcom zzcom2 = zzeyg.zza;
            if (zzcom2 != null) {
                zzcom2.zzb();
            }
            zzeyg.zza = zzcom;
            zzcom.zzc(zzeyg);
            zzeyg.zzg.zzk(new zzcon(zzcom, zzeyg, zzeyg.zzg, zzeyg.zzi));
            zzcom.zzk();
        }
    }
}
