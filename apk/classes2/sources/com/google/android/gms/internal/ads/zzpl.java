package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzpl extends ContentObserver {
    final /* synthetic */ zzpo zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzpl(zzpo zzpo, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        Objects.requireNonNull(zzpo);
        this.zza = zzpo;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    public final void onChange(boolean z) {
        zzpo zzpo = this.zza;
        zzpo.zzk(zzpj.zzc(zzpo.zza, zzpo.zzh, zzpo.zzg));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
