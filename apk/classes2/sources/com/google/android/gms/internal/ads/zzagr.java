package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzagr implements zzau {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzx zzx = new zzx();
        zzx.zzah("application/id3");
        zzx.zzan();
        zzx zzx2 = new zzx();
        zzx2.zzah("application/x-scte35");
        zzx2.zzan();
    }

    public zzagr(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagr zzagr = (zzagr) obj;
            return this.zzc == zzagr.zzc && this.zzd == zzagr.zzd && Objects.equals(this.zza, zzagr.zza) && Objects.equals(this.zzb, zzagr.zzb) && Arrays.equals(this.zze, zzagr.zze);
        }
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
        long j = this.zzc;
        int hashCode2 = (((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) this.zzd)) * 31) + Arrays.hashCode(this.zze);
        this.zzf = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    public final /* synthetic */ void zza(zzar zzar) {
    }
}
