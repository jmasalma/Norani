package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;
import com.google.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzanw extends zzadg {
    public zzanw(zzeu zzeu, long j, long j2) {
        super(new zzadb(), new zzanu(zzeu, (zzanv) null), j, 0, j + 1, 0, j2, 188, zzbcj.zzq.zzf);
    }

    static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }
}
