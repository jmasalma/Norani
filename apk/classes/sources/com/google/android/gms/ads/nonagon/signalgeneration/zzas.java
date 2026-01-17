package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbuf;
import com.google.android.gms.internal.ads.zzcyi;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzas implements zzgdj {
    final /* synthetic */ zzbuf zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    zzas(zzau zzau, zzbuf zzbuf, boolean z) {
        this.zza = zzbuf;
        this.zzb = z;
        Objects.requireNonNull(zzau);
        this.zzc = zzau;
    }

    public final void zza(Throwable th) {
        try {
            zzbuf zzbuf = this.zza;
            String message = th.getMessage();
            zzbuf.zze("Internal error: " + message);
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzh("", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        List<Uri> list = (List) obj;
        try {
            zzau zzau = this.zzc;
            zzau.zzJ(zzau, list);
            this.zza.zzf(list);
            if (zzau.zzs || this.zzb) {
                for (Uri uri : list) {
                    if (zzau.zzP(uri)) {
                        zzau.zzq.zzd(zzau.zzaa(uri, zzau.zzA, "1").toString(), (zzv) null, (zzfhu) null, (zzcyi) null);
                    } else {
                        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhJ)).booleanValue()) {
                            zzau.zzq.zzd(uri.toString(), (zzv) null, (zzfhu) null, (zzcyi) null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzh("", e);
        }
    }
}
