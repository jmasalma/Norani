package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcak;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbo {
    private static zzaqg zza;
    private static final Object zzb = new Object();

    public zzbo(Context context) {
        zzaqg zzaqg;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                zzbde.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzeJ)).booleanValue()) {
                        zzaqg = zzaz.zzb(context);
                        zza = zzaqg;
                    }
                }
                zzaqr zzaqr = null;
                zzaqg = zzark.zza(context, (zzaqr) null);
                zza = zzaqg;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzcak zzcak = new zzcak();
        zza.zza(new zzbm(str, (Map) null, zzcak));
        return zzcak;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        String str2 = str;
        zzaqi zzbk = new zzbk((zzbn) null);
        zzbi zzbi = new zzbi(this, str2, zzbk);
        zzl zzl = new zzl((String) null);
        zzbj zzbj = new zzbj(this, i, str, zzbk, zzbi, bArr, map, zzl);
        if (zzl.zzk()) {
            try {
                zzl.zzd(str2, ShareTarget.METHOD_GET, zzbj.zzl(), zzbj.zzx());
            } catch (zzapl e) {
                String message = e.getMessage();
                int i2 = zze.zza;
                zzo.zzj(message);
            }
        }
        zza.zza(zzbj);
        return zzbk;
    }
}
