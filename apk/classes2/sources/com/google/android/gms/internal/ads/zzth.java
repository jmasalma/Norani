package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzth extends zzhq {
    public final int zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzth(Throwable th, zzti zzti) {
        super("Decoder failed: ".concat(String.valueOf(zzti == null ? null : zzti.zza)), th);
        int i;
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            i = codecException.getErrorCode();
        } else {
            i = 0;
        }
        this.zza = i;
    }
}
