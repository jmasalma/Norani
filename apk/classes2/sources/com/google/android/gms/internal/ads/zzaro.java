package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaro extends zzhgc implements Closeable {
    static {
        zzhgj.zzb(zzaro.class);
    }

    public zzaro(zzhgd zzhgd, zzarn zzarn) throws IOException {
        zze(zzhgd, zzhgd.zzc(), zzarn);
    }

    public final void close() throws IOException {
    }

    public final String toString() {
        String obj = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
