package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbbv extends PushbackInputStream {
    final /* synthetic */ zzbbw zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbbv(zzbbw zzbbw, InputStream inputStream, int i) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbbw);
        this.zza = zzbbw;
    }

    public final synchronized void close() throws IOException {
        zzbby.zze(this.zza.zzc);
        super.close();
    }
}
