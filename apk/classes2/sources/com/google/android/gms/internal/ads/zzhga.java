package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzhga extends zzhfy implements zzarq {
    private int zzg;

    protected zzhga(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzarp.zzc(byteBuffer.get());
        zzarp.zzd(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
