package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaay {
    /* access modifiers changed from: private */
    public final Context zza;
    private boolean zzb;
    /* access modifiers changed from: private */
    public zztr zzc = zztr.zza;
    /* access modifiers changed from: private */
    public final zztd zzd;
    /* access modifiers changed from: private */
    public Handler zze;
    /* access modifiers changed from: private */
    public zzacj zzf;

    public zzaay(Context context) {
        this.zza = context;
        this.zzd = new zzsx(context, (zzfwh) null, (zzfwh) null);
    }

    public final zzaay zze(Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaay zzf(zzacj zzacj) {
        this.zzf = zzacj;
        return this;
    }

    public final zzaay zzg(zztr zztr) {
        this.zzc = zztr;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r3.zzf != null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzaba zzh() {
        /*
            r3 = this;
            boolean r0 = r3.zzb
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdd.zzf(r0)
            android.os.Handler r0 = r3.zze
            if (r0 != 0) goto L_0x0012
            com.google.android.gms.internal.ads.zzacj r2 = r3.zzf
            if (r2 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r2 = r1
            goto L_0x001a
        L_0x0012:
            r2 = 0
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzacj r0 = r3.zzf
            if (r0 == 0) goto L_0x001a
            goto L_0x0010
        L_0x001a:
            com.google.android.gms.internal.ads.zzdd.zzf(r2)
            r3.zzb = r1
            com.google.android.gms.internal.ads.zzaba r0 = new com.google.android.gms.internal.ads.zzaba
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaay.zzh():com.google.android.gms.internal.ads.zzaba");
    }
}
