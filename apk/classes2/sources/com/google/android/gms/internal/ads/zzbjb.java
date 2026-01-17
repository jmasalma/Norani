package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbjb implements zzfve {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbjb(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbkf zzbkf = zzbke.zza;
        if (((Boolean) zzbfd.zzi.zze()).booleanValue()) {
            zzv.zzp().zzw(th, "prepareClickUrl.attestation2");
        }
        return this.zza;
    }
}
