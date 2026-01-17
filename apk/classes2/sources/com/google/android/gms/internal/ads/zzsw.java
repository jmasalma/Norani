package com.google.android.gms.internal.ads;

import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzsw extends zzhs {
    private long zzg;
    private int zzh;
    private int zzi = 32;

    public zzsw() {
        super(2, 0);
    }

    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzm() {
        return this.zzh;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final void zzo(int i) {
        this.zzi = i;
    }

    public final boolean zzp(zzhs zzhs) {
        ByteBuffer byteBuffer;
        zzdd.zzd(!zzhs.zzd(Ints.MAX_POWER_OF_TWO));
        zzdd.zzd(!zzhs.zzd(268435456));
        zzdd.zzd(!zzhs.zzd(4));
        if (zzq()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzhs.zzc;
            if (!(byteBuffer2 == null || (byteBuffer = this.zzc) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.zzh;
        this.zzh = i + 1;
        if (i == 0) {
            this.zze = zzhs.zze;
            if (zzhs.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhs.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhs.zze;
        return true;
    }

    public final boolean zzq() {
        return this.zzh > 0;
    }
}
