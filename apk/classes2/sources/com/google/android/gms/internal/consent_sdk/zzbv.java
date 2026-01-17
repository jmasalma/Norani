package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzbv extends WebView {
    private final Handler zza;
    /* access modifiers changed from: private */
    public final zzcb zzb;
    /* access modifiers changed from: private */
    public boolean zzc = false;

    public zzbv(zzbx zzbx, Handler handler, zzcb zzcb) {
        super(zzbx);
        this.zza = handler;
        this.zzb = zzcb;
    }

    static /* bridge */ /* synthetic */ boolean zzf(zzbv zzbv, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        zzcb zzcb = this.zzb;
        Objects.requireNonNull(zzcb);
        this.zza.post(new zzbs(zzcb));
    }

    public final void zzd(String str, String str2) {
        this.zza.post(new zzbr(this, str + "(" + str2 + ");"));
    }
}
