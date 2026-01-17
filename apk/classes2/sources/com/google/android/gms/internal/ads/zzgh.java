package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgh extends zzgc {
    private zzgo zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgh() {
        super(false);
    }

    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        String str = zzex.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    public final long zzb(zzgo zzgo) throws IOException {
        zzi(zzgo);
        this.zza = zzgo;
        Uri normalizeScheme = zzgo.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzdd.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = zzex.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw zzaz.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e);
                }
            } else {
                this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j = zzgo.zze;
            int length = this.zzb.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.zzc = i;
                int i2 = length - i;
                this.zzd = i2;
                long j2 = zzgo.zzf;
                int i3 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                if (i3 != 0) {
                    this.zzd = (int) Math.min((long) i2, j2);
                }
                zzj(zzgo);
                return i3 != 0 ? j2 : (long) this.zzd;
            }
            this.zzb = null;
            throw new zzgk(2008);
        }
        throw zzaz.zzb("Unexpected URI format: ".concat(String.valueOf(String.valueOf(normalizeScheme))), (Throwable) null);
    }

    public final Uri zzc() {
        zzgo zzgo = this.zza;
        if (zzgo != null) {
            return zzgo.zza;
        }
        return null;
    }

    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
