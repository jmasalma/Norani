package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzx;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfjp {
    private final zzx zza;
    private final zzu zzb;
    private final zzgdz zzc;
    private final zzfjq zzd;

    public zzfjp(zzx zzx, zzu zzu, zzgdz zzgdz, zzfjq zzfjq) {
        this.zza = zzx;
        this.zzb = zzu;
        this.zzc = zzgdz;
        this.zzd = zzfjq;
    }

    public static /* synthetic */ ListenableFuture zzc(zzfjp zzfjp, int i, long j, String str, zzt zzt) {
        if (zzt != zzt.zzc) {
            return zzgdn.zzh(zzt);
        }
        zzx zzx = zzfjp.zza;
        long zzb2 = (long) zzx.zzb();
        if (i != 1) {
            zzb2 = (long) (zzx.zza() * ((double) j));
        }
        return zzfjp.zze(str, zzb2, i + 1);
    }

    public final ListenableFuture zzd(String str) {
        try {
            return zze(str, 0, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgdn.zzh(zzt.zzb);
        }
    }

    private final ListenableFuture zze(String str, long j, int i) {
        String str2;
        zzx zzx = this.zza;
        if (i > zzx.zzc()) {
            zzfjq zzfjq = this.zzd;
            if (zzfjq == null || !zzx.zzd()) {
                return zzgdn.zzh(zzt.zzc);
            }
            zzfjq.zza(str, "", 2);
            return zzgdn.zzh(zzt.zzd);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zziW)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            str2 = String.valueOf(clearQuery.build()) + "&" + encodedQuery;
        } else {
            str2 = str;
        }
        zzfjo zzfjo = new zzfjo(this, i, j, str);
        if (j == 0) {
            zzgdz zzgdz = this.zzc;
            return zzgdn.zzn(zzgdz.zzb(new zzfjn(this, str2)), zzfjo, zzgdz);
        }
        zzgdz zzgdz2 = this.zzc;
        return zzgdn.zzn(zzgdz2.zzc(new zzfjm(this, str2), j, TimeUnit.MILLISECONDS), zzfjo, zzgdz2);
    }
}
