package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzgda extends zzgcn {
    /* access modifiers changed from: private */
    public zzgcz zza;

    zzgda(zzfyl zzfyl, boolean z, Executor executor, Callable callable) {
        super(zzfyl, z, false);
        this.zza = new zzgcy(this, callable, executor);
        zzz();
    }

    /* access modifiers changed from: package-private */
    public final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzk() {
        zzgcz zzgcz = this.zza;
        if (zzgcz != null) {
            zzgcz.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzx(int i, Object obj) {
    }

    /* access modifiers changed from: package-private */
    public final void zzy() {
        zzgcz zzgcz = this.zza;
        if (zzgcz != null) {
            zzgcz.zzf();
        }
    }
}
