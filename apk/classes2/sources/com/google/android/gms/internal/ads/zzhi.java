package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhi implements zzgj {
    private final zzgj zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzhi(zzgj zzgj) {
        zzgj zzgj2 = zzgj;
        this.zza = zzgj;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int zza2 = this.zza.zza(bArr, i, i2);
        if (zza2 != -1) {
            this.zzb += (long) zza2;
        }
        return zza2;
    }

    public final long zzb(zzgo zzgo) throws IOException {
        this.zzc = zzgo.zza;
        this.zzd = Collections.emptyMap();
        try {
            long zzb2 = this.zza.zzb(zzgo);
            Uri zzc2 = zzc();
            if (zzc2 != null) {
                this.zzc = zzc2;
            }
            this.zzd = zze();
            return zzb2;
        } catch (Throwable th) {
            Uri zzc3 = zzc();
            if (zzc3 != null) {
                this.zzc = zzc3;
            }
            this.zzd = zze();
            throw th;
        }
    }

    public final Uri zzc() {
        return this.zza.zzc();
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final Map zze() {
        return this.zza.zze();
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }

    public final void zzf(zzhj zzhj) {
        zzhj.getClass();
        this.zza.zzf(zzhj);
    }
}
