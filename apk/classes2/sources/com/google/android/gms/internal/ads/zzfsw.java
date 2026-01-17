package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfsw extends zzftz {
    private int zza;
    private String zzb;
    private byte zzc;

    zzfsw() {
    }

    public final zzftz zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzftz zzb(int i) {
        this.zza = i;
        this.zzc = 1;
        return this;
    }

    public final zzfua zzc() {
        if (this.zzc == 1) {
            return new zzfsy(this.zza, this.zzb, (zzfsx) null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
