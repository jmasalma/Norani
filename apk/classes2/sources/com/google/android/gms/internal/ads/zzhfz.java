package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzhfz extends zzhgc implements zzarq {
    protected final String zza = "moov";

    public zzhfz(String str) {
    }

    public final String zza() {
        return this.zza;
    }

    public final void zzb(zzhgd zzhgd, ByteBuffer byteBuffer, long j, zzarn zzarn) throws IOException {
        zzhgd.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhgd;
        this.zze = zzhgd.zzb();
        zzhgd.zze(zzhgd.zzb() + j);
        this.zzf = zzhgd.zzb();
        this.zzb = zzarn;
    }
}
