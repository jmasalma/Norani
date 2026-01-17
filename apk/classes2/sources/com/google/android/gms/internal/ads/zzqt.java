package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzqt extends zzco {
    private int[] zzd;
    private int[] zze;

    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int[] iArr2 = iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int zzk : iArr2) {
                int zzk2 = (zzex.zzk(this.zzb.zzd) * zzk) + position;
                int i = this.zzb.zzd;
                if (i != 2) {
                    if (i == 3) {
                        zzj.put(byteBuffer.get(zzk2));
                    } else if (i != 4) {
                        if (i != 21) {
                            if (i != 22) {
                                if (i != 268435456) {
                                    if (i != 1342177280) {
                                        if (i != 1610612736) {
                                            throw new IllegalStateException("Unexpected encoding: " + i);
                                        }
                                    }
                                }
                            }
                            zzj.putInt(byteBuffer.getInt(zzk2));
                        }
                        byte b = byteBuffer.get(byteBuffer.order() == ByteOrder.BIG_ENDIAN ? zzk2 : zzk2 + 2);
                        byte b2 = byteBuffer.get(zzk2 + 1);
                        if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                            zzk2 += 2;
                        }
                        int i2 = ((b << Ascii.CAN) & -16777216) | ((b2 << Ascii.DLE) & 16711680) | ((byteBuffer.get(zzk2) << 8) & 65280);
                        int i3 = i2 >> 8;
                        boolean z = true;
                        zzdd.zze((i3 & -16777216) == 0 || (i3 & -8388608) == -8388608, "Value out of range of 24-bit integer: ".concat(String.valueOf(Integer.toHexString(i3))));
                        if (zzj.remaining() < 3) {
                            z = false;
                        }
                        zzdd.zzd(z);
                        zzj.put((byte) (zzj.order() == ByteOrder.BIG_ENDIAN ? (i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE : i3 & KotlinVersion.MAX_COMPONENT_VALUE)).put((byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)).put((byte) (zzj.order() == ByteOrder.BIG_ENDIAN ? i3 & KotlinVersion.MAX_COMPONENT_VALUE : (i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
                    } else {
                        zzj.putFloat(byteBuffer.getFloat(zzk2));
                    }
                }
                zzj.putShort(byteBuffer.getShort(zzk2));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    public final zzcl zzi(zzcl zzcl) throws zzcm {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i = zzcl.zzd;
        if (zzex.zzK(i)) {
            int i2 = zzcl.zzc;
            boolean z = i2 != iArr.length;
            int i3 = 0;
            while (true) {
                int length = iArr.length;
                if (i3 >= length) {
                    return z ? new zzcl(zzcl.zzb, length, i) : zzcl.zza;
                }
                int i4 = iArr[i3];
                if (i4 < i2) {
                    z |= i4 != i3;
                    i3++;
                } else {
                    throw new zzcm("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", zzcl);
                }
            }
        } else {
            throw new zzcm("Unhandled input format:", zzcl);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzk() {
        this.zze = this.zzd;
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
