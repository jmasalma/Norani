package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zztc {
    public final zzti zza;
    public final MediaFormat zzb;
    public final zzz zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;
    public final zztb zzf;

    private zztc(zzti zzti, MediaFormat mediaFormat, zzz zzz, Surface surface, MediaCrypto mediaCrypto, zztb zztb) {
        this.zza = zzti;
        this.zzb = mediaFormat;
        this.zzc = zzz;
        this.zzd = surface;
        this.zzf = zztb;
    }

    public static zztc zza(zzti zzti, MediaFormat mediaFormat, zzz zzz, MediaCrypto mediaCrypto, zztb zztb) {
        return new zztc(zzti, mediaFormat, zzz, (Surface) null, (MediaCrypto) null, zztb);
    }

    public static zztc zzb(zzti zzti, MediaFormat mediaFormat, zzz zzz, Surface surface, MediaCrypto mediaCrypto) {
        return new zztc(zzti, mediaFormat, zzz, surface, (MediaCrypto) null, (zztb) null);
    }
}
