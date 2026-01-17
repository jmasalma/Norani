package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzpi {
    public static final zzpi zza;
    public final int zzb;
    public final int zzc;
    private final zzfyv zzd;

    static {
        zzpi zzpi;
        if (Build.VERSION.SDK_INT >= 33) {
            zzfyu zzfyu = new zzfyu();
            for (int i = 1; i <= 10; i++) {
                zzfyu.zzf(Integer.valueOf(zzex.zzi(i)));
            }
            zzpi = new zzpi(2, (Set) zzfyu.zzi());
        } else {
            zzpi = new zzpi(2, 10);
        }
        zza = zzpi;
    }

    public zzpi(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzpi(int i, Set set) {
        this.zzb = i;
        zzfyv zzl = zzfyv.zzl(set);
        this.zzd = zzl;
        zzgaw zze = zzl.iterator();
        int i2 = 0;
        while (zze.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) zze.next()).intValue()));
        }
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpi)) {
            return false;
        }
        zzpi zzpi = (zzpi) obj;
        return this.zzb == zzpi.zzb && this.zzc == zzpi.zzc && Objects.equals(this.zzd, zzpi.zzd);
    }

    public final int hashCode() {
        zzfyv zzfyv = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfyv == null ? 0 : zzfyv.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + valueOf + "]";
    }

    public final int zza(int i, zze zze) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = this.zzb;
            for (int i3 = 10; i3 > 0; i3--) {
                int zzi = zzex.zzi(i3);
                if (zzi != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(zzi).build(), zze.zza().zza)) {
                    return i3;
                }
            }
            return 0;
        }
        Integer num = (Integer) zzpj.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        Integer num2 = num;
        return num.intValue();
    }

    public final boolean zzb(int i) {
        zzfyv zzfyv = this.zzd;
        if (zzfyv == null) {
            return i <= this.zzc;
        }
        int zzi = zzex.zzi(i);
        if (zzi == 0) {
            return false;
        }
        return zzfyv.contains(Integer.valueOf(zzi));
    }
}
